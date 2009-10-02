/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arnoud.model;

import junit.framework.TestCase;
import org.hibernate.Session;

/**
 *
 * @author arnoud
 */
public class StudentTest extends TestCase {
    
    public StudentTest(String testName) {
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
     * Test of getId method, of class Student.
     */
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Student.
     */
    public void testSetId() {
        System.out.println("setId");
        Integer i = null;
        Student instance = new Student();
        instance.setId(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Student.
     */
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Student.
     */
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student instance = new Student();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSchool method, of class Student.
     */
    public void testGetSchool() {
        System.out.println("getSchool");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getSchool();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSchool method, of class Student.
     */
    public void testSetSchool() {
        System.out.println("setSchool");
        String school = "";
        Student instance = new Student();
        instance.setSchool(school);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTraining method, of class Student.
     */
    public void testGetTraining() {
        System.out.println("getTraining");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getTraining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTraining method, of class Student.
     */
    public void testSetTraining() {
        System.out.println("setTraining");
        String training = "";
        Student instance = new Student();
        instance.setTraining(training);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByName method, of class Student.
     */
    public void testGetByName() {
        System.out.println("getByName");
        String name = "";
        Session session = null;
        Student instance = new Student();
        Student expResult = null;
        Student result = instance.getByName(name, session);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
