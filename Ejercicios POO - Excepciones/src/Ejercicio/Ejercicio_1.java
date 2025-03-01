package Ejercicio;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_1 {
    /*
1. Implementa un programa que pida al usuario un valor entero A utilizando un nextInt() (de Scanner) y
luego muestre por pantalla el mensaje “Valor introducido: ...”. Se deberá tratar la excepción
InputMismatchException que lanza nextInt() cuando no se introduce un entero válido. En tal caso se
mostrará el mensaje “Valor introducido incorrecto”.
     */
    private String enunciado  = "EJERCICIO 1 - Implementa un programa que pida al usuario un valor entero A utilizando un nextInt() (de Scanner) y\n" +
            "luego muestre por pantalla el mensaje “Valor introducido: ...”. Se deberá tratar la excepción\n" +
            "InputMismatchException que lanza nextInt() cuando no se introduce un entero válido. En tal caso se\n" +
            "mostrará el mensaje “Valor introducido incorrecto”.";
    Scanner sEntrada = new Scanner(System.in);
    int iA;

    public void Ejercicio() {

        try {
            System.out.println("Introduce un número entero");
            iA = sEntrada.nextInt();
            System.out.println("Valor introducido: "+iA);
        }catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
            //throw new InputMismatchException();
        } catch (Exception e) {

            e.printStackTrace();
        }
        finally{
            sEntrada.nextLine();

        }
    }

    public void imprimeEnunciado() {
        System.out.println(this.enunciado);
    }






}
