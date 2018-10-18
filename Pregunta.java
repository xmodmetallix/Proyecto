import java.util.*;
public class Pregunta {
    private String titulo;
    private ArrayList<Opcion> opcions;

    public Pregunta(String titulo, ArrayList<Opcion> opcions) {
        this.titulo = titulo;
        this.opcions = opcions;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the opcions
     */
    public ArrayList<Opcion> getOpcions() {
        return opcions;
    }

    /**
     * @param opcions the opcions to set
     */
    public void setOpcions(ArrayList<Opcion> opcions) {
        this.opcions = opcions;
    }
}
