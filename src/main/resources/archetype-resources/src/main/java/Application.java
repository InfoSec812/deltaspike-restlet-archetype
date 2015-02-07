#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ${package};

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author dphillips
 */
public class Application extends javax.ws.rs.core.Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> rrcs = new HashSet<>();
        rrcs.add(ExampleRest.class);
        // Add JAX-RS Annotated classes to the HashSet
        return rrcs;
    }
}
