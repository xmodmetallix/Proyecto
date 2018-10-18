public class Opcion {
    private String Titulo;
    private boolean correcto;

    public Opcion(String Titulo, boolean correcto) {
        this.Titulo = Titulo;
        this.correcto = correcto;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the correcto
     */
    public boolean isCorrecto() {
        return correcto;
    }

    /**
     * @param correcto the correcto to set
     */
    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }

}
