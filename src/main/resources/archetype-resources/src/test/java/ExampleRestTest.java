#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.inject.Inject;
import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CdiTestRunner.class)
public class ExampleRestTest {

    @Inject
    private ExampleRest api;

    @Test
    public void testGetSystemTime() {
        String result = api.getServerTime();
        Assert.assertTrue("The system time in milliseconds MUST be long integer", result.matches("${symbol_escape}${symbol_escape}d*"));
    }
}
