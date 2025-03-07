import java.util.ArrayList;
import java.util.Comparator;

public class GestorParque<T extends Dinosaurio> {
    private ArrayList<T> o_alParque = new ArrayList<>();

    //Constructor
    public GestorParque(ArrayList<T> p_alParque) {
        this.o_alParque = p_alParque;
    }

    //Getter
    public ArrayList<T> getParque() {
        return o_alParque;
    }
    //Setter
    public void setParque(ArrayList<T> p_alParque) {
        o_alParque = p_alParque;
    }

    //Métodos propios
    public void altaDinosaurio(T p_Dinosaurio){
        o_alParque.add(p_Dinosaurio);
    }

    public ArrayList<T> buscarDinosaurioPorPeriodo(String p_sPeriodo){
        ArrayList<T> dinosResultado = new ArrayList<T>();
        for(T dino: o_alParque){
            if(dino.getPeriodo()==p_sPeriodo){
                dinosResultado.add(dino);
            }
        }
        return dinosResultado;
    }


    public void ordenarPorTamano() {

        this.getParque().sort((Comparator.comparingDouble(Dinosaurio::getTamano)).reversed());

    }


}
