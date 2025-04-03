import java.util.List;
public class Inscripcion {
    private List<Materia> asignaturas;
    private String id;
    private Alumno alumno;

    public Inscripcion(List<Materia> asignaturas, String id, Alumno alumno) {
        this.asignaturas = asignaturas;
        this.id = id;
        this.alumno = alumno;
    }

    public boolean aprobada() {
        return asignaturas.stream().allMatch(alumno::puedeCursar);
    }
}
