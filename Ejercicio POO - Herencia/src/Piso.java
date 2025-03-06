public class Piso extends Inmueble{

    private int o_iPlanta;

    public Piso(String p_sdireccion, int p_iMetrosCuadrados, int p_iAntiguedad, double p_dPrecioBase, int p_iPlanta) {
        super(p_sdireccion, p_iMetrosCuadrados, p_iAntiguedad, p_dPrecioBase);
        setPlanta(p_iPlanta);
    }

    public int getPlanta() {
        return o_iPlanta;
    }

    public void setPlanta(int p_iPlanta) {
        this.o_iPlanta = p_iPlanta;
    }

    @Override
    public double calcularPrecio() {
        double dPrecio = getPrecioBase();

        // Hacemos el ajuste por antigüedad
        dPrecio -= ajustePorAntiguedad();

        // Hacemos el ajuste del 3% si es un tercero o más
        if (getPlanta() >= 3) {
            dPrecio += getPrecioBase() * 0.03;
        }

        return dPrecio;
    }

    @Override
    public String toString() {
        return "PISO: " + super.toString() +
                ", Planta: " + getPlanta() +
                ", Precio final: " + calcularPrecio();
    }
}
