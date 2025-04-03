import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre, List<Materia> correlativas) {
        this.nombre = nombre;
        if(correlativas != null) {
            this.correlativas = correlativas;
        }else{
            this.correlativas = new ArrayList<>();
        }
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

}
