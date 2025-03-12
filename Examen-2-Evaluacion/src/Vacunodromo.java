import java.util.ArrayList;
import java.util.Collection;

public class Vacunodromo extends ArrayList<Afiliada> {

    private String o_sNombre;
    private String o_sTipoVacuna;
    private int o_iNumeroPlazas;

    //Constructores
    public Vacunodromo(int initialCapacity, String p_sNombre, String p_sTipoVacuna, int p_iNumeroPlazas) {
        super(initialCapacity);
        setNombre(p_sNombre);
        setTipoVacuna(p_sTipoVacuna);
        setNumeroPlazas(p_iNumeroPlazas);
    }

    public Vacunodromo(String p_sNombre, String p_sTipoVacuna, int p_iNumeroPlazas) {
        setNombre(p_sNombre);
        setTipoVacuna(p_sTipoVacuna);
        setNumeroPlazas(p_iNumeroPlazas);
    }

    public Vacunodromo(Collection<? extends Afiliada> c, String p_sNombre, String p_sTipoVacuna, int p_iNumeroPlazas) {
        super(c);
        setNombre(p_sNombre);
        setTipoVacuna(p_sTipoVacuna);
        setNumeroPlazas(p_iNumeroPlazas);
    }

    @Override
    public String toString() {
        return super.toString()+ " VACUNÓDROMO: " +
                "Nombre: " + o_sNombre +
                ", Tipo Vacuna: " + o_sTipoVacuna+
                ", Numero de Plazas: " + o_iNumeroPlazas;
    }

    //Getters
    public String getNombre() {
        return o_sNombre;
    }

    public String getVacuna() {
        return o_sTipoVacuna;
    }

    public int getNumeroPlazas() {
        return o_iNumeroPlazas;
    }
    //Setters

    public void setNombre(String p_sNombre) {
        this.o_sNombre = p_sNombre;
    }

    public void setTipoVacuna(String p_sTipoVacuna) {
        this.o_sTipoVacuna = p_sTipoVacuna;
    }

    public void setNumeroPlazas(int p_iNumeroPlazas) {
        this.o_iNumeroPlazas = p_iNumeroPlazas;
    }

    public String comprobarRenuentes(){ //No se quieren vacunar
        int iContadorRenuentes=0;
        for(Afiliada paciente: super){
            if (paciente.getAceptacion() == false) {
                iContadorRenuentes++;
            }
            return "Hay "+iContadorRenuentes+" personas en la que no quieren vacunarse.";

        }
}
