package Ejercicio;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {

        int iEntrada = seleccionaEjercicio();

        switch (iEntrada)
        {
            case 1:
                Ejercicio_1 eje1= new Ejercicio_1();
                eje1.imprimeEnunciado();
                eje1.Ejercicio();
                break;
            case 2:
                Ejercicio_2 eje2 = new Ejercicio_2();
                eje2.imprimeEnunciado();
                eje2.Ejercicio();
                break;
            case 3:
                Ejercicio_3 eje3 = new Ejercicio_3();
                eje3.imprimeEnunciado();
                eje3.Ejercicio();
                break;
            case 4:
                Ejercicio_4 eje4 = new Ejercicio_4();
                eje4.imprimeEnunciado();
                eje4.Ejercicio();
                break;
            case 5:
                Ejercicio_5 eje5 = new Ejercicio_5();
                eje5.imprimeEnunciado();
                eje5.Ejercicio();
                break;
            case 6:
                Ejercicio_6 eje6 = new Ejercicio_6();
                eje6.imprimeEnunciado();
                eje6.Ejercicio();
                break;
            case 7:
                break;
            default:
                break;

        }



    }

    public static int  seleccionaEjercicio(){
        System.out.println("Introduce el número de ejercicio: ");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        Scanner sEntradaMenu = new Scanner(System.in);
        int iSeleccion=0;
        try {
            iSeleccion = sEntradaMenu.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("No jodamos...");
            //throw new InputMismatchException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            sEntradaMenu.nextLine();
        }
        return iSeleccion;
    }
}