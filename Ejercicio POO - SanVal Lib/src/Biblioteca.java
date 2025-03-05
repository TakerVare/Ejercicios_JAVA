import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {

    private static ArrayList<Libro> o_listaLibros = new ArrayList<Libro>();

    public Biblioteca(ArrayList<Libro> p_listaLibros) {
        this.o_listaLibros = p_listaLibros;
    }

    public ArrayList<Libro> getListaLibros() {
        return o_listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> p_listaLibros) {
        o_listaLibros = p_listaLibros;
    }

    public static void agregarLibro(Libro p_libro) {
        o_listaLibros.add(p_libro);
    }
    public static void listarLibros() {
        for(Libro libro : o_listaLibros) {
            System.out.println(libro.toString());
        }
    }
    public static boolean devolverLibro(String p_sLibro) {
        boolean bRes = false;
        for(Libro libro : o_listaLibros) {
            if(libro.getTitulo().equals(p_sLibro)) {
                bRes = libro.devolverLibro();
                break;
            }
        }
        return bRes;
    }

    public static boolean prestarLibro(String p_sLibro) {
        boolean bRes = false;
        for(Libro libro : o_listaLibros) {
            if(libro.getTitulo().equals(p_sLibro)) {
                bRes = libro.prestarLibro();
                break;
            }
        }
        return bRes;
    }
}
