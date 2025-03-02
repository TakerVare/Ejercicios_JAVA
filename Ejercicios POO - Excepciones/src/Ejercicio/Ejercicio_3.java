package Ejercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_3
{
    /*
    3. Implementa un programa que cree un vector tipo double de tamaño 5 y luego, utilizando un bucle, pida cinco valores por teclado y los introduzca en el vector.
    Tendrás que manejar la/las posibles excepciones y seguir pidiendo valores hasta rellenar completamente el vector.
     */
    private String enunciado  = "EJERCICIO 3 - Implementa un programa que cree un vector tipo double de tamaño 5 y luego, utilizando un bucle, pida cinco valores por teclado y los introduzca en el vector.\n" +
            "    Tendrás que manejar la/las posibles excepciones y seguir pidiendo valores hasta rellenar completamente el vector.";
    Scanner sEntrada = new Scanner(System.in);
    double[] arryDouble = new double[5];
    int iIndice =0;

    public void Ejercicio() {
        rellenarArray();

    }

    private void rellenarArray() {
        //Voy a utilizar un while en lugar de un for para tener mayor control sobre el índice y así poder obligar a que se rellene todo el array
        while (iIndice < arryDouble.length) {
            try{
                System.out.println("Introduce un número: ");
                arryDouble[iIndice] = sEntrada.nextDouble();
                iIndice++;
            }catch (InputMismatchException ime) {
                System.out.println("Capturado error: InputMismatchException");
                System.out.println("Valor introducido incorrecto");

            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
            finally{
                sEntrada.nextLine();

            }
        }


    }
    public void imprimeEnunciado() {
        System.out.println(this.enunciado);
    }


}
