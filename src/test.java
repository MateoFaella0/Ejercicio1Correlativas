import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class test {

    @Test
    void inscripcionAprobada() {
        Materia algoritmos = new Materia("Algoritmos",new ArrayList<>());
        Materia paradigmas = new Materia("Paradigmas", List.of(algoritmos));

        Alumno mateo = new Alumno("Mateo Faella", "44870923");
        mateo.aprobarMateria(algoritmos);

        List<Materia> asignaturas = new ArrayList<>();
        asignaturas.add(paradigmas);

        Inscripcion inscripcion = new Inscripcion(asignaturas, "1", mateo);

        assertTrue(inscripcion.aprobada());
    }

    @Test
    void inscripcionRechazada() {
        Materia algoritmos = new Materia("Algoritmos",new ArrayList<>());
        Materia discreta = new Materia("Discreta",new ArrayList<>());
        Materia paradigmas = new Materia("Paradigmas", List.of(algoritmos, discreta));

        Alumno mateo = new Alumno("Mateo Faella", "44870923");
        mateo.aprobarMateria(algoritmos);

        List<Materia> asignaturas = new ArrayList<>();
        asignaturas.add(paradigmas);

        Inscripcion inscripcion = new Inscripcion(asignaturas, "2", mateo);

        assertFalse(inscripcion.aprobada());
    }

    @Test
    void inscripcionSinCorrelativas() {
        Materia algebra = new Materia("Algebra", new ArrayList<>());
        Materia am1 = new Materia("Analisis Matematico", new ArrayList<>());
        Alumno mateo = new Alumno("Mateo Faella", "44870923");

        List<Materia> asignaturas = new ArrayList<>();
        asignaturas.add(algebra);
        asignaturas.add(am1);

        Inscripcion inscripcion = new Inscripcion(asignaturas, "3", mateo);

        assertTrue(inscripcion.aprobada());
    }
}
