public class Senador extends Legislador {
    private int o_iNumeroAsiento;

    public Senador(String p_sNombre, String p_sApellido, int p_iEdad, String p_sDocumento, String p_sProvinciaQueRepresenta, String o_sPartidoPolitico, int p_iNumeroAsiento) {
        super(p_sNombre, p_sApellido, p_iEdad, p_sDocumento, p_sProvinciaQueRepresenta, o_sPartidoPolitico);
        setNumeroAsiento(p_iNumeroAsiento);
    }

    public int getNumeroAsiento() {
        return o_iNumeroAsiento;
    }

    public void setNumeroAsiento(int p_iNumeroAsiento) {
        this.o_iNumeroAsiento = p_iNumeroAsiento;
    }

    @Override
    public String toString() {
        return super.toString() +
                " SENADOR: " +
                "NÚmero DE Asiento: " + o_iNumeroAsiento;
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Senado";
    }
}