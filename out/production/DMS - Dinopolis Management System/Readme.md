Introducción
¡Ahora gestionas el parque temático Dinópolis! Pero la complejidad del parque ha crecido, así que necesitas reestructurar tu programa utilizando herencia, interfaces, y genéricos.

Requisitos:
1. Clase Base y Herencia:
- Define una clase abstracta Dinosaurio con propiedades comunes:
    + nombre (String)
    + tamaño (double): Tamaño en metros.
    + periodo (String): Ejemplo: Jurásico, Cretácico.
- Añade métodos abstractos como rugir(), que cada subclase implementará de manera distinta.
- Crea dos subclases: Herbivoro y Carnivoro.
2. Interface:
- Crea una interfaz Interactivo con métodos como:
    + mostrarInformacion() para imprimir datos del dinosaurio.
    + atraccionEstrella() que destaca a los dinosaurios más populares en el parque.
3. Genéricos:
- Usa una clase genérica GestorParque<T> para manejar listas de dinosaurios.
- Implementa métodos genéricos para:
    + Añadir un dinosaurio al sistema.
    + Buscar dinosaurios por periodo.
    + Obtener los dinosaurios más grandes.
4. Funcionalidades:
- Construye un menú en consola para:
    + Añadir herbívoros y carnívoros al sistema.
    + Mostrar todos los dinosaurios con información detallada.
    + Listar dinosaurios por periodo.
    + Mostrar el dinosaurio más grande (atracción estrella).

¡Que viva Dinópolis y su parque lleno de código jurásico! 


PARTE II - Ejercicios Estructuras: El parque está en peligro

Ahora el parque está lleno de visitantes, y los dinosaurios necesitan interactuar con las actividades del parque. Los alumnos tendrán que implementar: para gestionar errores en el sistema.Nuevas funcionalidades relacionadas con las actividades y los dinosaurios.
Crea una excepción personalizada llamada DinosaurioNoEncontradoException para manejar casos en los que no se encuentre un dinosaurio por su nombre.
Crea otra excepción, ActividadInvalidaException, para gestionar actividades no válidas dentro del parque.
Implementa una clase Actividad que represente las actividades dentro del parque (por ejemplo: "Fotografía con dinosaurios", "Alimentación de herbívoros", etc.).
Los dinosaurios interactuarán con ciertas actividades según su tipo:
pueden participar en actividades como "Alimentación de hojas".
tienen actividades como "Demostración de caza (simulada)".
Si se intenta asignar un herbívoro a una actividad de carnívoros (o viceversa), lanza una ActividadInvalidaException.
Añadir opciones al menú para asignar dinosaurios a actividades y gestionar las excepciones.
Incluir una opción para buscar un dinosaurio por nombre (que lanza DinosaurioNoEncontradoException si no existe).
Introducir un límite en el número de actividades por día. Si se supera, lanza una excepción genérica IllegalStateException con un mensaje claro.

// Ejemplo de Excepción Personalizada
class DinosaurioNoEncontradoException extends Exception {
public DinosaurioNoEncontradoException(String mensaje) {
super(mensaje);
}
}

// Ejemplo de Uso
public Dinosaurio buscarDinosaurioPorNombre(String nombre) throws DinosaurioNoEncontradoException {
for (Dinosaurio dino : listaDinosaurios) {
if (dino.getNombre().equalsIgnoreCase(nombre)) {
return dino;
}
}
throw new DinosaurioNoEncontradoException("¡Dinosaurio con nombre '" + nombre + "' no encontrado!");
}



class Actividad {
private String nombre;
private String tipoPermitido; // "Herbívoro" o "Carnívoro"

    public Actividad(String nombre, String tipoPermitido) {
        this.nombre = nombre;
        this.tipoPermitido = tipoPermitido;
    }

    public void asignarDinosaurio(Dinosaurio dino) throws ActividadInvalidaException {
        if ((dino instanceof Herbivoro && !tipoPermitido.equals("Herbívoro")) ||
            (dino instanceof Carnivoro && !tipoPermitido.equals("Carnívoro"))) {
            throw new ActividadInvalidaException("¡Actividad no válida para este tipo de dinosaurio!");
        }
        System.out.println("¡" + dino.getNombre() + " ha sido asignado a la actividad '" + nombre + "'!");
    }
}
