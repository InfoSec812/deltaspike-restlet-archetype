package __package__;

import org.apache.deltaspike.cdise.api.CdiContainer;
import org.apache.deltaspike.cdise.api.CdiContainerLoader;
import org.apache.deltaspike.cdise.api.ContextControl;
import org.apache.deltaspike.core.api.provider.BeanProvider;
import org.restlet.Component;
import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.ext.jaxrs.InstantiateException;
import org.restlet.ext.jaxrs.JaxRsApplication;
import org.restlet.ext.jaxrs.ObjectFactory;

public class Main {

    private static final int PORT = 8080;

    public static void main(String[] args) {
        CdiContainer cdiContainer = CdiContainerLoader.getCdiContainer();
        cdiContainer.boot();

        // Starting the all contexts
        ContextControl contextControl = cdiContainer.getContextControl();
        contextControl.startContexts();
        // You can use CDI here
        
        Component component = new Component();
        Server server = new Server(Protocol.HTTP, PORT);
        component.getServers().add(server);
        
        CdiObjectFactory objectFactory = new CdiObjectFactory();

        JaxRsApplication jaxRsApplication = new JaxRsApplication(component.getContext().createChildContext());
        jaxRsApplication.add(new Application());
        jaxRsApplication.setObjectFactory(objectFactory);
        component.getDefaultHost().attach("/rest", jaxRsApplication);

        cdiContainer.shutdown();
    }

    private static class CdiObjectFactory implements ObjectFactory {

        @Override
        public <T> T getInstance(Class<T> aClass) throws InstantiateException {
            return BeanProvider.getContextualReference(aClass, false);
        }
    }
}
