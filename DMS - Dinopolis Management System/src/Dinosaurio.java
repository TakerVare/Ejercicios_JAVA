import java.util.ArrayList;
import java.util.Objects;

public abstract class Dinosaurio implements iInteractivo {

    private String o_sNombre;
    private double o_dTamano;
    private String o_sPeriodo;

    //Constructor
    public Dinosaurio(String p_sNombre, double p_dTamano, String p_sPeriodo) {
        setNombre(p_sNombre);
        setTamano(p_dTamano);
        setPeriodo(p_sPeriodo);
    }

    //Getters
    public String getNombre() {
        return o_sNombre;
    }
    public double getTamano() {
        return o_dTamano;
    }
    public String getPeriodo() {
        return o_sPeriodo;
    }

    //Setters
    public void setNombre(String p_sNombre) {
        o_sNombre = p_sNombre;
    }
    public void setTamano(double p_dTamano) {
        o_dTamano = p_dTamano;
    }
    public void setPeriodo(String p_sPeriodo) {
        o_sPeriodo = p_sPeriodo;
    }

    @Override
    public String toString() {
        return "DINOSAURIO: " +
                "Nombre: " + o_sNombre +
                ", Tamaño: " + o_dTamano +
                ", Periodo: " + o_sPeriodo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dinosaurio that)) return false;
        return Double.compare(that.o_dTamano, o_dTamano) == 0 && Objects.equals(o_sNombre, that.o_sNombre) && Objects.equals(o_sPeriodo, that.o_sPeriodo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(o_sNombre, o_dTamano, o_sPeriodo);
    }



    public abstract void rugir();
}
