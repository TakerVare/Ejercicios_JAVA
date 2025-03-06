public class Herbivoro extends Dinosaurio{








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
