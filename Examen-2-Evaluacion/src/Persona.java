import java.util.Date;

public class Persona implements IPersona{
    private String o_sNombre;
    private Date o_dFechaNacimiento;
    private String o_sPais;
    private int o_iDNI;

    //Constructor
    public Persona(String p_sNombre, Date p_dFechaNacimiento, String p_sPais, int p_iDNI) {
        setNombre(p_sNombre);
        setFechaNacimiento(p_dFechaNacimiento);
        setPais(p_sPais);
        setDNI(p_iDNI);
    }

    //Setters
    public void setNombre(String p_sNombre) {
        o_sNombre = p_sNombre;
    }
    public void setFechaNacimiento(Date p_dFechaNacimiento) {
        o_dFechaNacimiento = p_dFechaNacimiento;
    }
    public void setPais(String p_sPais) {
        o_sPais = p_sPais;
    }
    public void setDNI(int p_iDNI) {
        o_iDNI = p_iDNI;
    }

    //###################### Metodos implementados ##########################
    //Getters
    @Override
    public String getNombre() {
        return o_sNombre;
    }

    @Override
    public Date getFechaNacimiento() {
        return o_dFechaNacimiento;
    }

    @Override
    public String getPais() {
        return o_sPais;
    }

    @Override
    public int getDni() {
        return o_iDNI;
    }

    //Metodos sobrecargados

    @Override
    public String toString() {
        return "Persona: " +
                "Nombre: " + o_sNombre +
                ", Fecha de Nacimiento: " + o_dFechaNacimiento +
                ", Pais: " + o_sPais +
                ", DNI: " + o_iDNI;
    }
}
