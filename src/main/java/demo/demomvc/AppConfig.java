package demo.demomvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Curso curso(){
        return new Curso();
    }

    @Bean
    public Alumno alumno(){
        return new Alumno();
    }
    @Bean
    public AlumnoRepository repoAlumno(){
        return new AlumnoRepository();
    }
    @Bean
    public CursoRepository  repoCurso(){
        return new CursoRepository();
    }

    @Bean
    public GestorCursosService servicio(){
        return new GestorCursosService();
    }
}
