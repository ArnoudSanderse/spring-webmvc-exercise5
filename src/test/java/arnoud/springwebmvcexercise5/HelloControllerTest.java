/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arnoud.springwebmvcexercise5;

import junit.framework.TestCase;
import org.springframework.ui.Model;

/**
 *
 * @author arnoud
 */
public class HelloControllerTest extends TestCase {
    
    public HelloControllerTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of get method, of class HelloController.
     */
    public void testGet() {
        System.out.println("get");
        Model model = null;
        HelloController instance = new HelloController();
        String expResult = "";
        String result = instance.get(model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
