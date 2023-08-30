package demo.demomvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("repoAlumno")
public class AlumnoRepository {

    private static List<Alumno> alumnos= new ArrayList<Alumno>();
    static {
        alumnos.add(new Alumno("pedro",20));
        alumnos.add(new Alumno("angel",30));
        alumnos.add(new Alumno("ana",50));

    }

    public List<Alumno> buscarTodos() {
        System.out.println(" ===>> "+alumnos.get(0).getNombre());
        return alumnos;
    }

    public void insertar(Alumno alumno) {
        alumnos.add(alumno);
    }

}