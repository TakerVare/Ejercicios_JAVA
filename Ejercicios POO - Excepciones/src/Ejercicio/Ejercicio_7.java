package Ejercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_7 {

    /*
    7. Crea una copia del programa anterior y modifica el main para hacer lo siguiente:
   Crea un ArrayList<Gato>. Luego, utilizando un bucle, pide al usuario que introduzca los
   datos de 5 gatos: utiliza un Scanner para pedir los datos, instancia el objeto y guárdalo en el ArrayList.
   Por último, imprime la información de los gatos.
   Maneja las posibles excepciones de modo que en el ArrayList solo almacenemos objetos Gato válidos y el bucle
   se repita hasta crear y almacenar correctamente 5 gatos.

         */
    private String enunciado  = "EJERCICIO 7 - Crea una copia del programa anterior y modifica el main para hacer lo siguiente:\n" +
            "   Crea un ArrayList<Gato>. Luego, utilizando un bucle, pide al usuario que introduzca los \n" +
            "   datos de 5 gatos: utiliza un Scanner para pedir los datos, instancia el objeto y guárdalo en el ArrayList. \n" +
            "   Por último, imprime la información de los gatos.\n" +
            "   Maneja las posibles excepciones de modo que en el ArrayList solo almacenemos objetos Gato válidos y el bucle \n" +
            "   se repita hasta crear y almacenar correctamente 5 gatos.";


    public void Ejercicio() throws Exception{
        Scanner sEntrada = new Scanner(System.in);
        ArrayList<Gato> colonia = new ArrayList<Gato>();
        int iIndice=0;
        String sMemoriaNombre;
        int iMemoriaEdad;

        while(iIndice<5)
        {
            try{
                System.out.println("Introduce un el nombre del gato número "+(iIndice+1)+": ");
                sMemoriaNombre=sEntrada.nextLine();
                System.out.println("Introduce la edad del gato número "+(iIndice+1)+": ");
                iMemoriaEdad=sEntrada.nextInt();
                colonia.add(new Gato(sMemoriaNombre,iMemoriaEdad));
                iIndice++;
            }
            catch (Exception e) {
                System.out.println("El valor introducido no es válido. Por favor vuelve a intentarlo: ");
            }
            finally{
                sEntrada.nextLine();

            }

        }

        imprimeCamada(colonia);

    }

    private void imprimeCamada(ArrayList<Gato> colonia) {
        int iContador=0;
        for (Gato gato : colonia) {
            iContador++;
            System.out.println("Gato nº "+iContador);
            gato.imprimir();
        }
    }

    public void imprimeEnunciado() {
        System.out.println(this.enunciado);
    }

}
