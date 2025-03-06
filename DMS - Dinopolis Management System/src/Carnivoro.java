public class Carnivoro extends Dinosaurio{



    @Override
    public void rugir() {
        System.out.println("GUAU (soy carnivoro)");
    }

    @Override
    public void mostrarInformacion() {

    }

    @Override
    public void atraccionEstrella() {

    }

    @Override
    public String toString() {
        return super.toString()+ " Tipo: Carnivoro. ";
    }
}
