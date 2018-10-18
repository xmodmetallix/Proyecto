import java.util.*;
public class Cuestionario {
    private ArrayDeque<Pregunta> pregntas;

    public Cuestionario(ArrayDeque<Pregunta> pregntas) {
        this.pregntas = pregntas;
    }

    /**
     * @return the pregntas
     */
    public ArrayDeque<Pregunta> getPregntas() {
        return pregntas;
    }

    /**
     * @param pregntas the pregntas to set
     */
    public void setPregntas(ArrayDeque<Pregunta> pregntas) {
        this.pregntas = pregntas;
    }
    
}
