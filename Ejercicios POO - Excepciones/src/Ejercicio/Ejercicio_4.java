package Ejercicio;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio_4
{
    /*
4. Implementa un programa que cree un vector de enteros de tamaño N (número aleatorio entre 1 y 100)
con valores aleatorios entre 1 y 10. Luego se le preguntará al usuario qué posición del vector quiere mostrar por pantalla,
repitiéndose una y otra vez hasta que se introduzca un valor negativo. Maneja todas las posibles excepciones..
     */
    private String enunciado  = "EJERCICIO 4 - Implementa un programa que cree un vector de enteros de tamaño N (número aleatorio entre 1 y 100) \n" +
            "con valores aleatorios entre 1 y 10. Luego se le preguntará al usuario qué posición del vector quiere mostrar por pantalla, \n" +
            "repitiéndose una y otra vez hasta que se introduzca un valor negativo. Maneja todas las posibles excepciones..";


    public void Ejercicio() {

        Scanner sEntrada = new Scanner(System.in);
        Random random = new Random();
        int iDimensionArray = random.nextInt(100)+1;
        int[] arryInt = new int[iDimensionArray];

        for (int i = 0; i < arryInt.length; i++) {
            arryInt[i]=(random.nextInt(10)+1);

        }

        int iIndex=0;

        do{
            System.out.println("¿Qué posición del array quieres mostrar? Introduce un número negativo para salir: ");
            try{
                iIndex=sEntrada.nextInt();
                System.out.println("La posicion: "+iIndex+" del array es: "+arryInt[iIndex]);
            } catch (Exception e) {
                //throw new RuntimeException(e);
                System.out.println("El valor introducido no es válido. Por favor vuelve a intentarlo: ");
            }finally{
                sEntrada.nextLine();
            }

        }while (iIndex>=0);
        System.out.println("Adios");

    }

    public void imprimeEnunciado() {
        System.out.println(this.enunciado);
    }

}
