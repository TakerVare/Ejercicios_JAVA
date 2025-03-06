public class Rectangulo implements iFigura {

    private double o_dBase;
    private double o_dAltura;

    public Rectangulo(double p_dBase, double p_dAltura) {
        setBase(p_dBase);
        setAltura(p_dAltura);
    }

    public void setBase(double p_dBase) {
        o_dBase = p_dBase;
    }

    public void setAltura(double p_dAltura) {
        o_dAltura = p_dAltura;
    }

    public double getBase() {
        return o_dBase;
    }

    public double getAltura() {
        return o_dAltura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (getBase() + getAltura());
    }

    @Override
    public double getArea() {
        return getBase() * getAltura();
    }

    @Override
    public String toString() {
        return "Rectángulo - Base: " + getBase() + ", Altura: " + getAltura();
    }

}
