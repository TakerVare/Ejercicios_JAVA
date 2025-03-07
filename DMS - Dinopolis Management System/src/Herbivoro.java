public class Herbivoro extends Dinosaurio{


    public Herbivoro(String p_sNombre, double p_dTamano, String p_sPeriodo) {
        super(p_sNombre, p_dTamano, p_sPeriodo);
    }




    @Override
    public void rugir() {
        System.out.println("BEEEEEEEE (soy vegano)");
    }

    @Override
    public void mostrarInformacion() {

    }

    @Override
    public void atraccionEstrella() {

    }

    @Override
    public String toString() {
        return super.toString()+ " Tipo: Herbivoro. ";
    }
}
