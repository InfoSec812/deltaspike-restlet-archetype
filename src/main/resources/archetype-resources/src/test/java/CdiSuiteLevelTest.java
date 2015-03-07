#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.apache.deltaspike.testcontrol.api.junit.CdiTestSuiteRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author <a href="">Deven Phillips</a>
 */
@RunWith(CdiTestSuiteRunner.class)
@Suite.SuiteClasses({ExampleRestTest.class})
public class CdiSuiteLevelTest {

}
