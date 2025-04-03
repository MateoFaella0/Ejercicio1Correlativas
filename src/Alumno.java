import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombreYApellido;
    private String dni;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombreYApellido, String dni) {
        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
        this.materiasAprobadas = new ArrayList<>();
    }

    public void aprobarMateria(Materia materia) {
        this.materiasAprobadas.add(materia);
    }

    Boolean puedeCursar(Materia materia){
        return materiasAprobadas.containsAll(materia.getCorrelativas());
    }

}
