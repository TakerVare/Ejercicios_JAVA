import excepciones.LibroNoValidoException;

public class Biblioteca {
    int contadorLibros= 0;
    Libro[] libros = new Libro[5];
    boolean agregarLibro(Libro libro)
    {
        boolean bRet = false;
        try {
            ComprobarLibro(libro);
            libros[contadorLibros] = libro;
        }
        catch (LibroNoValidoException lnvex)
        {
            throw lnvex();
        }
        catch (Exception ex)
        {

        }
        finally {
            bRet= (libros[contadorLibros].equals(libro));
            contadorLibros++;
        }
        return bRet;
    }

    void ComprobarLibro(Libro libro) throws  LibroNoValidoException
    {
        boolean bRet = false;
        if(libro.getTitulo().equals("")){

            throw new LibroNoValidoException("El titulo del libro bno es correcto");
            //A partir de aqui no se ejecutará nunca porque tenemos el 'throw new LibroNoValidoException'
        }


    }

}
