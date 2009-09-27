package arnoud.springwebmvcexercise5;

import arnoud.model.Student;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author arnoud
 */
@Controller
public class HelloController {
    static Category cat = Category.getRoot();
   
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String get(Model model, HttpServletRequest request, HttpServletResponse response) {
        String message = " 1+1=10";
        Configuration config = new Configuration();
        config.configure();

        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Student student = new Student("Arnoud", "HvA", "IvI");
            session.save(student);
            cat.info("Hello " + student.getName());
            message += "Saved data: " + student.toString() + "<br>";
            tx.commit();
        } catch (Exception e) {
            cat.info("Error saving data: " + e.getMessage());
        } finally {
            session.close();
        }

        session = sessionFactory.openSession();
        try {
            Student student = new Student().getByName("Arnoud",session);
            cat.info("Recieved data: " + student.toString());
            message += "Recieved data: " + student.toString();
        } catch (Exception e) {
        } finally {
            session.close();
        }


        model.addAttribute("Message", message);
        sessionFactory.close();
        return "hello";
    } 
}