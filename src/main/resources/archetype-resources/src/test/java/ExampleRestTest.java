#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.apache.deltaspike.cdise.api.CdiContainer;
import org.apache.deltaspike.cdise.api.CdiContainerLoader;
import org.apache.deltaspike.cdise.api.ContextControl;
import org.apache.deltaspike.core.api.provider.BeanProvider;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.restlet.ext.jaxrs.InstantiateException;
import org.restlet.ext.jaxrs.ObjectFactory;

public class ExampleRestTest {

    ExampleRest api;
    CdiContainer cdiContainer;

    @Before
    public void before() throws InstantiateException {
        cdiContainer = CdiContainerLoader.getCdiContainer();
        cdiContainer.boot();

        // Starting the all contexts
        ContextControl contextControl = cdiContainer.getContextControl();
        contextControl.startContexts();
        api = (new CdiObjectFactory()).getInstance(ExampleRest.class);
    }

    @After
    public void after() {
        cdiContainer.shutdown();
    }

    @Test
    public void testGetSystemTime() {
        String result = api.getServerTime();
        Assert.assertTrue("", result.matches("${symbol_escape}${symbol_escape}d*"));
    }
}
