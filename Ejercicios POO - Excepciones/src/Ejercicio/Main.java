package Ejercicio;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int iEntrada = seleccionaEjercicio();

        switch (iEntrada)
        {
            case 1:
                System.out.println("Ejercicio 1");
                Ejercicio_1 eje1= new Ejercicio_1();
                eje1.SolicitaNumero();
                break;
            case 2:

        }



    }

    public static int  seleccionaEjercicio(){
        System.out.println("Introduce el número de ejercicio: ");
        Scanner sEntradaMenu = new Scanner(System.in);
        int iSeleccion=0;
        try {
            iSeleccion = sEntradaMenu.nextInt();
        }catch (InputMismatchException e) {
            throw new InputMismatchException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            sEntradaMenu.nextLine();
        }
        return iSeleccion;
    }
}