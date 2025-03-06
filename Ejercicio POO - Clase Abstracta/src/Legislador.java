public abstract class Legislador extends Persona {
    private String o_sProvinciaQueRepresenta;
    private String o_sPartidoPolitico;
    private boolean o_bHaTrabajado;

    public Legislador(String p_sNombre, String p_sApellido, int p_iEdad, String p_sDocumento, String p_sProvinciaQueRepresenta, String o_sPartidoPolitico) {
        super(p_sNombre, p_sApellido, p_iEdad, p_sDocumento);
        setProvinciaQueRepresenta(p_sProvinciaQueRepresenta);
        setPartidoPolitico(o_sPartidoPolitico);
        setHaTrabajado(false);
    }
    //Getters
    public String getProvinciaQueRepresenta() {
        return o_sProvinciaQueRepresenta;
    }

    public String getPartidoPolitico() {
        return o_sPartidoPolitico;
    }

    public boolean isHaTrabajado() {
        return o_bHaTrabajado;
    }

    //Setters


    public void setProvinciaQueRepresenta(String p_sProvinciaQueRepresenta) {
        this.o_sProvinciaQueRepresenta = p_sProvinciaQueRepresenta;
    }

    public void setPartidoPolitico(String p_sPartidoPolitico) {
        this.o_sPartidoPolitico = p_sPartidoPolitico;
    }

    public void setHaTrabajado(boolean p_bHaTrabajado) {
        this.o_bHaTrabajado = p_bHaTrabajado;
    }

    // Metodo abstracto que deben implementar las clases hijas
    public abstract String getCamaraEnQueTrabaja();

    @Override
    public String toString() {
        return super.toString() +
                " Provincia a la que representa: " + o_sProvinciaQueRepresenta +
                ", Partido Político: " + o_sPartidoPolitico +
                ", Ha Trabajado Fuera de la política: " + o_bHaTrabajado;
    }
}