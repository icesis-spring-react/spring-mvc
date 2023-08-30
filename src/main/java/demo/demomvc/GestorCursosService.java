package demo.demomvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("servicio")
public class GestorCursosService {

    @Autowired
    AlumnoRepository repoAlumno;
    @Autowired
    CursoRepository repoCurso;

    public void insertarAlumno(Alumno alumno) {
        repoAlumno.insertar(alumno);
    }

    public List<Alumno> buscarTodosAlumnos() {
        return repoAlumno.buscarTodos();
    }

    public List<Curso> buscarTodosCursos() {
        return repoCurso.buscarTodos();
    }

}