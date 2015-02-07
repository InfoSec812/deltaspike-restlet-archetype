#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ${package};

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author dphillips
 */
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
