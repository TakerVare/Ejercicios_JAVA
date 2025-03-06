class Local extends Inmueble {
    private int o_iNumeroVentanas;

    public Local(String p_sdireccion, int p_iMetrosCuadrados, int p_iAntiguedad, double p_dPrecioBase, int p_iNumeroVentanas) {
        super(p_sdireccion, p_iMetrosCuadrados, p_iAntiguedad, p_dPrecioBase);
        setNumeroVentanas(p_iNumeroVentanas);
    }

    public int getNumeroVentanas() {
        return o_iNumeroVentanas;
    }

    public void setNumeroVentanas(int p_iNumeroVentanas) {
        this.o_iNumeroVentanas = p_iNumeroVentanas;
    }

    @Override
    public double calcularPrecio() {
        double dPrecio = getPrecioBase();

        // Restar ajuste por antigüedad
        dPrecio -= ajustePorAntiguedad();

        // Incremento del 1% si tiene más de 50 metros cuadrados
        if (getMetrosCuadrados() > 50) {
            dPrecio += getPrecioBase() * 0.01;
        }

        // Reducción del 2% si tiene 1 o ninguna ventana
        if (getNumeroVentanas() <= 1) {
            dPrecio -= getPrecioBase() * 0.02;
        }

        // Incremento del 2% si tiene más de 4 ventanas
        if (getNumeroVentanas() > 4) {
            dPrecio += getPrecioBase() * 0.02;
        }

        return dPrecio;
    }

    @Override
    public String toString() {
        return "LOCAL: " + super.toString() +
                ", Número de ventanas: " + getNumeroVentanas() +
                ", Precio final: " + calcularPrecio();
    }
}