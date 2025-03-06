public class Circulo implements iFigura {
    private double o_dRadio;

    public Circulo(double p_dRadio) {
        setRadio(p_dRadio);
    }

    public void setRadio(double p_dRadio) {
        o_dRadio = p_dRadio;
    }

    public double getRadio() {
        return o_dRadio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * getRadio();
    }

    @Override
    public double getArea() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Círculo - Radio: " + getRadio();
    }
}