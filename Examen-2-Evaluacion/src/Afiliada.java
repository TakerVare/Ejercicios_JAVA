import java.util.Date;

public class Afiliada extends Persona{

    public enum eVacuna {
        Sputnik,
        AstraZeneka,
        Janssen,
        Pzer,
        Moderna,
        Sin_asignar
    }

    private int o_iNumSS;
    private boolean o_bAcepta;
    private int o_iDosis;

    private String[] o_sVacuna = new String[2];

    public Afiliada(String p_sNombre, Date p_dFechaNacimiento, String p_sPais, int p_iDNI, int p_iNumSS, boolean p_bAcepta) {
        super(p_sNombre, p_dFechaNacimiento, p_sPais, p_iDNI);
        setNumSS(p_iNumSS);
        setAcepta(p_bAcepta);
        setDosis(0); //Al crearse el objeto no tiene ninguna dosis
        o_sVacuna[0]=""; //Se asignará la vacuna más tarde
        o_sVacuna[1]=""; //Se asignará la vacuna más tarde

    }
    //Setters
    public void setNumSS(int p_iNumSS) {
        o_iNumSS = p_iNumSS;
    }

    public void setAcepta(boolean p_bAcepta) {
        o_bAcepta = p_bAcepta;
    }

    public void setDosis(int p_iDosis) {
        o_iDosis = p_iDosis;
    }

    public void setVacuna(String p_sVacuna) {
        if(o_sVacuna[0]!=""){
            o_sVacuna[1]=p_sVacuna;
        }else{
            o_sVacuna[0]=p_sVacuna;
        }
    }

    //Getters
    public int getNSS() {
        return o_iNumSS;
    }

    public boolean getAceptacion() {
        return o_bAcepta;
    }

    public int getDosis() {
        return o_iDosis;
    }

    public String getUltimaVacuna(){
        String sResultado;
        if(o_sVacuna[1]!=""){
            sResultado=o_sVacuna[1];
        }else{
            sResultado=o_sVacuna[0];
        }
        return sResultado;
    }

    public void anotarDosis(){
        if(getDosis()<2){
            setDosis(getDosis()+1);
        }
    }

    public String[] getVacuna() {
        return o_sVacuna;
    }

    //Metodos sobrecargados

    @Override
    public String toString() {
        String sListaVacunas = "";
        if(o_sVacuna[1]!=""){
            sListaVacunas="Vacuna 1: "+o_sVacuna[0]+ " Vacuna 2: "+o_sVacuna[1];
        }else{
            sListaVacunas="Vacuna 1: "+o_sVacuna[0];
        }

        return super.toString()+ " AFILIADO: " +
                "Nº S.S.: " + o_iNumSS +
                ", Acepta Vacuna: " + o_bAcepta +
                ", Nº de Dosis suministradas: " + o_iDosis +
                ", Vacunas: " + sListaVacunas;
    }
}
