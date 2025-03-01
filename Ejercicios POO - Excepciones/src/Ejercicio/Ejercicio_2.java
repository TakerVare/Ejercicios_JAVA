package Ejercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_2 {

    /*
    Implementa un programa que pida dos valores int A y B utilizando un nextInt() (de Scanner), calcule A/B y muestre
    el resultado por pantalla. Se deberán tratar de forma independiente las dos posibles excepciones,
    InputMismatchException y ArithmeticException, mostrando en cada caso un mensaje de error diferente en cada caso.
    */
    private String enunciado  = "EJERCICIO 2 - Implementa un programa que pida dos valores int A y B utilizando un nextInt() (de Scanner), calcule A/B y muestre\n" +
            "    el resultado por pantalla. Se deberán tratar de forma independiente las dos posibles excepciones,\n" +
            "    InputMismatchException y ArithmeticException, mostrando en cada caso un mensaje de error diferente en cada caso.";
    Scanner sEntrada = new Scanner(System.in);
    int iA;
    int iB;

    public void Ejercicio() {
        pedirNumeros();
        System.out.println(dividir(iA, iB));
    }

    public void pedirNumeros() {
        try {
            System.out.println("Introduce un número entero para la variable A:");
            iA = sEntrada.nextInt();
            System.out.println("Valor introducido: "+iA);
            sEntrada.nextLine();
            System.out.println("Introduce un número entero para la variable B:");
            iB = sEntrada.nextInt();
            System.out.println("Valor introducido: "+iB);
        }catch (InputMismatchException e) {
            System.out.println("Capturado error: InputMismatchException");
            System.out.println("Valor introducido incorrecto");
            //throw new InputMismatchException();
        } catch (Exception e) {

            e.printStackTrace();
        }
        finally{
            sEntrada.nextLine();

        }
    }

    public double dividir(int a, int b) {
        double res=0;
        try{
            res = (double) a / b;
        }catch (ArithmeticException ae) {
            System.out.println("Capturado error: ArithmeticException");
            System.out.println("Estás intentando dividir por cero");
            //throw new RuntimeException(ae);

        } catch (Exception e) {
            throw new RuntimeException(e);

        }
        finally{
            return res;
        }
    }

    public void imprimeEnunciado() {
        System.out.println(this.enunciado);
    }


}
