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
