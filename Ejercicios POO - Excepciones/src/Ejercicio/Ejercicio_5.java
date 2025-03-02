package Ejercicio;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_5 {

    /*
5. Implementa un programa con tres funciones:
   void imprimePositivo(int p): Imprime el valor p. Lanza una ‘Exception’ si p < 0
   void imprimeNegativo(int n): Imprime el valor n. Lanza una ‘Exception’ si p >= 0
   La función main para realizar pruebas. Puedes llamar a ambas funciones varias veces con distintos valores, hacer un bucle para pedir valores por teclado y pasarlos a las funciones, etc. Maneja las posibles excepciones.

     */


    private String enunciado  = "EJERCICIO 5 - Implementa un programa con tres funciones:\n" +
            "   void imprimePositivo(int p): Imprime el valor p. Lanza una ‘Exception’ si p < 0\n" +
            "   void imprimeNegativo(int n): Imprime el valor n. Lanza una ‘Exception’ si p >= 0\n" +
            "   La función main para realizar pruebas. Puedes llamar a ambas funciones varias veces con distintos valores, hacer un bucle para pedir valores por teclado y pasarlos a las funciones, etc. Maneja las posibles excepciones.";


    public void Ejercicio() {

        Scanner sEntrada = new Scanner(System.in);

        int n=0;

        do{
            System.out.println("Introduce un número para analizar. Introduce 0 para salir: ");
            try{
                n=sEntrada.nextInt();
                if (n > 0) {
                    imprimePositivo(n);
                } else if(n < 0) {
                    imprimeNegativo(n);
                }

            } catch (Exception e) {
                //throw new RuntimeException(e);
                System.out.println("El valor introducido no es válido. Por favor vuelve a intentarlo: ");
            }finally{
                sEntrada.nextLine();
            }

        }while (n!=0);
        System.out.println("Adios");

    }

    public static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("Valor no positivo");
        } else {
            System.out.println("El valor es positivo: " + p);
        }
    }

    public static void imprimeNegativo(int n) throws Exception {
        if (n > 0) {
            throw new Exception("Valor no negativo");
        } else {
            System.out.println("El valor es negativo: " + n);
        }
    }


    public void imprimeEnunciado() {
        System.out.println(this.enunciado);
    }

}
