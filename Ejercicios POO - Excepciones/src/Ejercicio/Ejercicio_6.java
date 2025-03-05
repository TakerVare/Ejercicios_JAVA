package Ejercicio;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_6 {

    /*
    6. Implementa una clase Gato con los atributos nombre y edad, un constructor con parámetros, los getters y setters,
    además de un metodo imprimir() para mostrar los datos de un gato. El nombre de un gato debe tener al menos 3 caracteres
    y la edad no puede ser negativa. Por ello, tanto en el constructor como en los setters, deberás comprobar que los valores
     sean válidos y lanzar una ‘Exception’ si no lo son. Luego, haz una clase principal con main para hacer pruebas: instancia
     varios objetos Gato y utiliza sus setters, probando distintos valores (algunos válidos y otros incorrectos). Maneja las excepciones.

         */
    private String enunciado  = "EJERCICIO 6 - Implementa una clase Gato con los atributos nombre y edad, un constructor con parámetros, los getters y setters, \n" +
            "    además de un metodo imprimir() para mostrar los datos de un gato. El nombre de un gato debe tener al menos 3 caracteres \n" +
            "    y la edad no puede ser negativa. Por ello, tanto en el constructor como en los setters, deberás comprobar que los valores\n" +
            "     sean válidos y lanzar una ‘Exception’ si no lo son. Luego, haz una clase principal con main para hacer pruebas: instancia \n" +
            "     varios objetos Gato y utiliza sus setters, probando distintos valores (algunos válidos y otros incorrectos). Maneja las excepciones.";


    public void Ejercicio() throws Exception{
        Scanner sEntrada = new Scanner(System.in);
        Gato gato1 = new Gato("Nala", 5);

        System.out.println("Gato 1:");
        gato1.imprimir();

        System.out.println("Introduce el nombre del nuevo gato: ");
        String nombre = sEntrada.nextLine();
        System.out.println("Introduce la edad del nuevo gato: ");
        int edad = sEntrada.nextInt();
        sEntrada.nextLine();


        Gato gato2 = new Gato(nombre, edad);

        System.out.println("Gato 2:");
        gato2.imprimir();


    }

    public void imprimeEnunciado() {
        System.out.println(this.enunciado);
    }
}
