package arnoud.springwebmvcexercise5;

import arnoud.model.Student;
import java.util.List;
import junit.framework.TestCase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author arnoud
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@Transactional
public class HelloControllerTest extends TestCase {

    @Autowired
    public SessionFactory sessionFactory;

    @Autowired
    private HelloController helloController;

    public HelloControllerTest() {
        super("HelloControllerTests");
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void studentControllerIsWiredTest() {
            assertNotNull(helloController);
    }

    @Test
    public void sessionFactoryIsNotNullTest() {
            assertNotNull(helloController.sessionFactory);
    }

    @Test
    public void hibernateTest() {
            Student student = new Student();
            student.setId(112);
            student.setName("Coffee");
            student.setSchool("BeanSchool");
            student.setTraining("BeanTraining");
            Session session = sessionFactory.getCurrentSession();
            session.save(student);
            session.flush();

            List studenten = session.createQuery("from Student").list();

            assertNotNull(studenten);
            assertEquals(1,studenten.size());
    }

        @Test
	public void studentTest() {
        Session session = sessionFactory.getCurrentSession();

		Student student = new Student();
		student.setId(112);
		student.setName("Coffee");
		student.setSchool("BeanSchool");
                student.setTraining("BeanTraining");
                session.save(student);

		Student student2 = new Student();
		student2.setId(112);
		student2.setName("Coffee2");
		student2.setSchool("BeanSchool");
                student2.setTraining("BeanTraining");

		session.flush();

		List<Student> studenten = session.createQuery("from Student").list();

		assertNotNull(studenten);
		assertEquals( 2, studenten.size() );
	}
}
