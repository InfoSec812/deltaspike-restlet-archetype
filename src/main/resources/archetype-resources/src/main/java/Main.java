package __package__;

import org.apache.deltaspike.cdise.api.CdiContainer;
import org.apache.deltaspike.cdise.api.CdiContainerLoader;
import org.apache.deltaspike.cdise.api.ContextControl;

public class Main {
    public static void main(String[] args) {
        CdiContainer cdiContainer = CdiContainerLoader.getCdiContainer();
        cdiContainer.boot();

        // Starting the all contexts
        ContextControl contextControl = cdiContainer.getContextControl();
        contextControl.startContexts();
        
        // You can use CDI here

        cdiContainer.shutdown();
    }
}
