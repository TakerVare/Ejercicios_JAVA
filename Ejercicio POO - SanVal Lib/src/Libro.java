import java.util.Objects;

public class Libro {

    private String o_sTitulo;
    private String o_sAutor;
    private int o_iAnho;
    private boolean o_bPrestado;

    public Libro(String p_sTitulo, String p_sAutor, int p_iAnho) {
        setTitulo(p_sTitulo);
        setAutor(p_sAutor);
        setAnho(p_iAnho);
        setPrestado(false);
    }

    public String getTitulo() {
        return o_sTitulo;
    }

    public void setTitulo(String p_sTitulo) {
        o_sTitulo = p_sTitulo;
    }

    public String getAutor() {
        return o_sAutor;
    }

    public void setAutor(String p_sAutor) {
        o_sAutor = p_sAutor;
    }

    public int getAnho() {
        return o_iAnho;
    }

    public void setAnho(int p_iAnho) {
        o_iAnho = p_iAnho;
    }

    public boolean isPrestado() {
        return o_bPrestado;
    }

    public void setPrestado(boolean p_bPrestado) {
        o_bPrestado = p_bPrestado;
    }

    public boolean prestarLibro()
    {
        boolean res = false;
        if(!o_bPrestado){
            o_bPrestado = true;
            res=true;
        }
        return res;
    }
    public boolean devolverLibro()
    {
        boolean res = false;
        if(o_bPrestado){
            o_bPrestado = false;
            res=true;
        }
        return res;
    }

    @Override
    public String toString() {
        return "Titulo: " + o_sTitulo +
                ", Autor: " + o_sAutor +
                ", Año: " + o_iAnho+
                ", Prestado: " + o_bPrestado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(o_sTitulo, libro.o_sTitulo) && Objects.equals(o_sAutor, libro.o_sAutor) && Objects.equals(o_iAnho, libro.o_iAnho);
    }

}
