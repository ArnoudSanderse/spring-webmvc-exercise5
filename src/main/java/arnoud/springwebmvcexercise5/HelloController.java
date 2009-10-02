package arnoud.springwebmvcexercise5;

import arnoud.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author arnoud
 */
@Controller
public class HelloController {
    @Autowired
    public SessionFactory sessionFactory;
   
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String get(Model model) {
        String message = "1+1=10";

        Session session = sessionFactory.getCurrentSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Student student = new Student("Arnoud", "HvA", "IvI");
            session.save(student);
            message += "<br>- Hello " + student.getName();
            message += "<br>- Saved data: " + student.toString() + "<br>";
            tx.commit();
        } catch (Exception e) {
            message += "<br>- Error saving data: " + e.getMessage();
        } finally {
            session.close();
        }

        session = sessionFactory.openSession();
        try {
            Student student = new Student().getByName("Arnoud",session);
            message += "<br>- Recieved data: " + student.toString();
        } catch (Exception e) {
            message += "<br>- Error retrieving data: " + e.getMessage();
        } finally {
            session.close();
        }


        model.addAttribute("Message", message);
        sessionFactory.close();
        return "hello";
    } 
}