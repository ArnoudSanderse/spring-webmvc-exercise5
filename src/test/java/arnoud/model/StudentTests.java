package arnoud.model;

import junit.framework.TestCase;

/**
 *
 * @author arnoud
 */
public class StudentTests extends TestCase {
    Student instance;
    String name = "Aap";
    String school = "Noot";
    String training = "Mies";
    
    public StudentTests(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        instance = new Student(name, school, training);
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
        Integer expResult = 0;
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Student.
     */
    public void testSetId() {
        System.out.println("setId");
        Integer id = 22;
        instance.setId(id);
        int expResult = 22;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Student.
     */
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Aap";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Student.
     */
    public void testSetName() {
        System.out.println("setName");
        name = "Arnoud";
        instance.setName(name);
        String expResult = "Arnoud";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSchool method, of class Student.
     */
    public void testGetSchool() {
        System.out.println("getSchool");
        String expResult = "Noot";
        String result = instance.getSchool();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSchool method, of class Student.
     */
    public void testSetSchool() {
        System.out.println("setSchool");
        school = "HvA";
        instance.setSchool(school);
        String expResult = "HvA";
        String result = instance.getSchool();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTraining method, of class Student.
     */
    public void testGetTraining() {
        System.out.println("getTraining");
        String expResult = "Mies";
        String result = instance.getTraining();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTraining method, of class Student.
     */
    public void testSetTraining() {
        System.out.println("setTraining");
        training = "IvI";
        instance.setTraining(training);
        String expResult = "IvI";
        String result = instance.getTraining();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Student.
     */
    public void testToString() {
        System.out.println("toString");
        String expResult = "0 - Aap - Noot - Mies";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
