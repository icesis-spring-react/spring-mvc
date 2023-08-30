package demo.demomvc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
public class HelloController {
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }

    @RequestMapping(value="/fact", method = RequestMethod.GET)
    public String factorial(ModelMap model) {

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext();
        context.scan("demo.demomvc");

        context.refresh();

        MyServiceClass myServiceClass
                = context.getBean(MyServiceClass.class);

        // Testing the factorial method
        int factorialOf5 = myServiceClass.factorial(5);

        model.addAttribute("message", "Factorial of 5 is: " + factorialOf5);
        return "hello";
    }
}
