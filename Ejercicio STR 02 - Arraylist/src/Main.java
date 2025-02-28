import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        //Crea una lista que contenga los días de la semana
        List listDias = new ArrayList<>();

        listDias.add("Lunes");
        listDias.add("Martes");
        listDias.add("Miércoles");
        listDias.add("Jueves");
        listDias.add("Viernes");
        listDias.add("Sábado");
        listDias.add("Domingo");

        //Inserta en la posición 4 el elemento «Juernes».
        listDias.add(4, "Juernes");
        //Copia esa lista a otra llamada listaDos
        List listaDos = new ArrayList<>(listDias);
        //Añade a listDias el contenido de listaDos
        for(Object item: listaDos){
            listDias.add(item);
        }
        //Muestra el contenido de las posiciones 3 y 4 de la lista original
        System.out.println("Imprimo la posición 3 de listDias");
        System.out.println(listDias.get(3));
        System.out.println("Imprimo la posición 4 de listDias");
        System.out.println(listDias.get(4));
        //Muestra el primer elemento y el último de la lista original.
        System.out.println("Imprimo la primera posición de listDias");
        System.out.println(listDias.get(0));
        System.out.println("Imprimo la última posición de listDias");
        System.out.println(listDias.get(listDias.size()-1));
        //Elimina el elemento que contenga «Juernes» de la lista y comprueba si elimina algo o no.

        int iContador=0;
        for(Object item: listDias){

            System.out.println("El item nº "+ iContador +" es: " +item.toString());
            iContador++;
        }
        System.out.println("################################");
        listDias.remove("Juernes");
        //Crea un iterador y muestra uno a uno los valores de la lista original
        iContador=0;
        for(Object item: listDias){
            System.out.println("El item nº "+ iContador +" es: " +item.toString());
            iContador++;
        }
        //Busca si existe en la lista un elemento que se denomine «Lunes»
        if(listDias.contains("Lunes")){
            System.out.println("Sí que existe el objeto 'Lunes'");
        }
        //Ordena la lista y muestra su contenido
        listDias.sort(Comparator.naturalOrder());
        iContador=0;
        for(Object item: listDias){
            System.out.println("El item nº "+ iContador +" es: " +item.toString());
            iContador++;
        }
        //Borra todos los elementos de la lista
        listDias.clear();




    }


}