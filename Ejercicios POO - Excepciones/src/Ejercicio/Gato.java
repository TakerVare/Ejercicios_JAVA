package Ejercicio;

public class Gato {

    private String o_sNombre;
    private int o_iEdad;

    public Gato(String p_sNombre, int p_iEdad) throws Exception {
        if (p_sNombre.length() < 3) {
            throw new Exception("El nombre debe tener al menos 3 caracteres");
        }

        if (p_iEdad < 0) {
            throw new Exception("La edad no puede ser negativa");
        }

        setNombre(p_sNombre);
        setEdad(p_iEdad);
    }

    public void setNombre(String p_sNombre) throws Exception{
        if (p_sNombre.length() < 3) {
            throw new Exception("El nombre debe tener al menos 3 caracteres");
        }

        o_sNombre = p_sNombre;
    }

    public void setEdad(int p_iEdad) throws Exception{
        if (p_iEdad < 0) {
            throw new Exception("La edad no puede ser negativa");
        }

        o_iEdad = p_iEdad;
    }

    public String getNombre() {
        return o_sNombre;
    }

    public int getEdad() {
        return o_iEdad;
    }

    public void imprimir() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
    }



}
