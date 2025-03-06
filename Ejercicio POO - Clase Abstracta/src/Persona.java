public class Persona {
    private String o_sNombre;
    private String o_sApellido;
    private int o_iEdad;
    private String o_sDocumento;

    public Persona(String p_sNombre, String p_sApellido, int p_iEdad, String p_sDocumento) {
        setNombre(p_sNombre);
        setApellido(p_sApellido);
        setEdad(p_iEdad);
        setDocumento(p_sDocumento);
    }

    //Getters

    public String getNombre() {
        return o_sNombre;
    }

    public String getApellido() {
        return o_sApellido;
    }

    public int getEdad() {
        return o_iEdad;
    }

    public String getDocumento() {
        return o_sDocumento;
    }

    public void setNombre(String p_sNombre) {
        o_sNombre = p_sNombre;
    }

    public void setApellido(String p_sApellido) {
        o_sApellido = p_sApellido;
    }

    public void setEdad(int p_iEdad) {
        o_iEdad = p_iEdad;
    }

    public void setDocumento(String p_sDocumento) {
        o_sDocumento = p_sDocumento;
    }


    @Override
    public String toString() {
        return "DATOS: " +
                "Nombre: " + o_sNombre +
                ", Apellido: " + o_sApellido +
                ", Edad: " + o_iEdad +
                ", Documento: " + o_sDocumento;
    }
}