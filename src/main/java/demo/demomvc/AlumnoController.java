package demo.demomvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller("alumnoController")
public class AlumnoController {

    @Autowired
    GestorCursosService servicio;
    @RequestMapping("/listaalumnos")
    public String listaAlumnos(Model modelo) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GestorCursosService servicio = (GestorCursosService) context.getBean("servicio"); // setter

      //  modelo.addAttribute("listaalumnos",servicio.buscarTodosAlumnos());
        List<Alumno> lista =  servicio.buscarTodosAlumnos();
        modelo.addAttribute("alumno: ", lista.get(0).getNombre());

        return "listaalumnos";
    }

}