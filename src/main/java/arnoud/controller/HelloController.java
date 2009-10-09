package arnoud.controller;

import arnoud.model.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
*
* @author arnoud
*/
@Controller
@Transactional
public class HelloController {
    @Autowired
    public SessionFactory sessionFactory;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String get(Model model) {
        String message = "1+1=10";

        Session session = sessionFactory.getCurrentSession();

        try {
            Student student = new Student(1, "Arnoud", "HvA", "IvI");
            session.save(student);
            message += "<br>- Saved data: " + student.toString();
            session.flush();
        } catch (Exception e) {
            message += "<br>- Error saving data: " + e.getMessage();
        }

        try {
            Query q = session.createQuery("FROM Student");
            if(q.list().size() > 0){
                Student student = (Student) q.list().get(0);//new Student().getByName("Arnoud",session);
                message += "<br>- Recieved data: " + student.toString();
            }
            else {
                message += "<br>- No data Recieved";
            }
            session.flush();
        } catch (Exception e) {
            message += "<br>- Error retrieving data: " + e.getMessage();
        }

        model.addAttribute("Message", message);
        return "hello";
    }
}