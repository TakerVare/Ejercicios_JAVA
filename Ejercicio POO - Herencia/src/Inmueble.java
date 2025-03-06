public abstract class Inmueble {
    protected String o_sdireccion;
    protected int o_iMetrosCuadrados;
    protected int o_iAntiguedad; // en años
    protected boolean o_bNuevo;
    protected double o_dPrecioBase;

    //Constructor

    public Inmueble(String p_sdireccion, int p_iMetrosCuadrados, int p_iAntiguedad, double p_dPrecioBase) {
        setdireccion(p_sdireccion);
        setMetrosCuadrados(p_iMetrosCuadrados);
        setAntiguedad(p_iAntiguedad);
        //Si la antigüedad es 0 a la fuerza es nuevo y si es distinta (se entiende que mayor) es usado
        if(p_iAntiguedad==0)
        {
            setNuevo(true);
        }else {
            setNuevo(false);
        }
        setPrecioBase(p_dPrecioBase);
    }

    //Getters


    public String getdireccion() {
        return o_sdireccion;
    }

    public int getMetrosCuadrados() {
        return o_iMetrosCuadrados;
    }

    public int getAntiguedad() {
        return o_iAntiguedad;
    }

    public boolean isNuevo() {
        return o_bNuevo;
    }

    public double getPrecioBase() {
        return o_dPrecioBase;
    }
    //Setters


    public void setdireccion(String p_sdireccion) {
        o_sdireccion = p_sdireccion;
    }

    public void setMetrosCuadrados(int p_iMetrosCuadrados) {
        o_iMetrosCuadrados = p_iMetrosCuadrados;
    }

    public void setAntiguedad(int p_iAntiguedad) {
        o_iAntiguedad = p_iAntiguedad;
    }

    public void setNuevo(boolean p_bNuevo) {
        o_bNuevo = p_bNuevo;
    }

    public void setPrecioBase(double p_dPrecioBase) {
        o_dPrecioBase = p_dPrecioBase;
    }

    //Métodos propios de la clase

    // Metodo abstracto para calcular el precio final
    public abstract double calcularPrecio();

    // Metodo para calcular el ajuste por antigüedad
    // Lo calculo en esta clase porque todos los inmueles tienen altigüedad
    public double ajustePorAntiguedad() {
        if (getAntiguedad() < 15) {
            // Rebaja del 1% para inmuebles con menos de 15 años
            return getPrecioBase() * 0.01;
        } else {
            // Rebaja del 2% para inmuebles con 15 o más años
            return getPrecioBase() * 0.02;
        }
    }

    @Override
    public String toString() {
        return "Dirección: " + getdireccion() +
                ", Metros cuadrados: " + getMetrosCuadrados() +
                ", Antigüedad: " + getAntiguedad() + " años" +
                ", Es nuevo: " + isNuevo() +
                ", Precio base: " + getPrecioBase();
    }
}