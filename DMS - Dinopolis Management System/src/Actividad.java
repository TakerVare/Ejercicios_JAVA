import java.util.ArrayList;

public class Actividad {

    private String o_sNombre;
    private String o_sTipoPermitido;

    private ArrayList<Dinosaurio> o_listDinosPermitidos = new ArrayList<Dinosaurio>();

    public Actividad(String p_sNombre, String p_sTipoPermitido) {
        this.o_sNombre = p_sNombre;
        this.o_sTipoPermitido = p_sTipoPermitido;
    }

    public void asignarDinosaurio(Dinosaurio dino) throws ActividadInvalidaException {
        if ((dino instanceof Herbivoro && !o_sTipoPermitido.equals("Herbívoro")) ||
                (dino instanceof Carnivoro && !o_sTipoPermitido.equals("Carnívoro"))) {
            throw new ActividadInvalidaException("¡Actividad no válida para este tipo de dinosaurio!");
        }else if(o_listDinosPermitidos.contains(dino)){
            throw new ActividadInvalidaException("¡Este dinosaurio ya está incluido en esta actividad!");
        }else{
            o_listDinosPermitidos.add(dino);
            System.out.println("¡" + dino.getNombre() + " ha sido asignado a la actividad '" + o_sNombre + "'!");
        }

    }

    //Fotografía con dinosaurios

    //Alimentación de herbívoros

    //Alimentación de hojas

    //Demostración de caza (simulada)
}
