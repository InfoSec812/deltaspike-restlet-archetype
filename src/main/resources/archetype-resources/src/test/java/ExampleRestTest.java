#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExampleRestTest {

    ExampleRest api;

    @Before
    public void beforeMethod() {
        api = new ExampleRest();
    }

    @Test
    public void testGetSystemTime() {
        String result = api.getServerTime();
        Assert.assertTrue("", result.matches("${symbol_escape}${symbol_escape}d*"));
    }
}
