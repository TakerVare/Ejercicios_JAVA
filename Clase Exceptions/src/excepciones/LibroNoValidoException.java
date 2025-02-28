package excepciones;

public class LibroNoValidoException extends Exception{

    public LibroNoValidoException (String message)
    {
        super(message);
    }
    public LibroNoValidoException()
    {
        super();
    }

}
