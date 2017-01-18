package Controller;

import Model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Burak Köken on 18.1.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView showHomePage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Home"); // Home.jsp
        modelAndView.addObject("message", "Hello Spring MVC");

        return modelAndView;
    }

    @RequestMapping("/welcome")
    public ModelAndView showWelcomePage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Welcome");

        Person person = new Person("Burak Koken", 22);
        modelAndView.addObject("personInfo", person);

        return modelAndView;
    }
}
