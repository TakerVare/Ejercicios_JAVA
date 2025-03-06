public class Triangulo implements iFigura {
    //Asumimos que el triángulo es equilátero
    private double o_dBase;
    private double o_dAltura;

    public Triangulo(double p_dBase, double p_dAltura) {
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
        // Calculamos el perímetro usando base multiplicada por 3 (suponiendo un triángulo equilátero)
        return getBase() * 3;
    }

    @Override
    public double getArea() {
        return (getBase() * getAltura()) / 2;
    }

    @Override
    public String toString() {
        return "Triángulo - Base: " + getBase() + ", Altura: " + getAltura();
    }

}
