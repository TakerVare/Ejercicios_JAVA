public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605);
        Libro libro2 = new Libro("1984", "George Orwell", 1949);
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);

        // Agregar libros a la biblioteca
        Biblioteca.agregarLibro(libro1);
        Biblioteca.agregarLibro(libro2);
        Biblioteca.agregarLibro(libro3);

        // Listar libros
        System.out.println("Listar libros");
        Biblioteca.listarLibros();

        // Buscar y prestar un libro
        System.out.println("Buscar y prestar un libro");
        if(Biblioteca.prestarLibro("1984")){
            System.out.println("El libro se ha prestado correctamente.");
        }else{
            System.out.println("El libro NO se ha podido prestar.");
        }
        System.out.println("Listar libros");
        Biblioteca.listarLibros();

        // Intentar prestar el mismo libro
        System.out.println("Intentar prestar el mismo libro");
        if(Biblioteca.prestarLibro("1984")){
            System.out.println("El libro se ha prestado correctamente.");
        }else{
            System.out.println("El libro NO se ha podido prestar.");
        }

        // Devolver el libro
        System.out.println("Intentar prestar el mismo libro");
        if(Biblioteca.devolverLibro("1984")){
            System.out.println("El libro se ha prestado correctamente.");
        }else{
            System.out.println("El libro NO se ha podido prestar.");
        }
        Biblioteca.listarLibros();
    }
}
