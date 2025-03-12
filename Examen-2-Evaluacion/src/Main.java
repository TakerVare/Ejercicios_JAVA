import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Persona> listadoPersonas = new ArrayList<Persona>();
        listadoPersonas.add(new Persona("Guillermo", "01/05/1989", "España", 15));
        listadoPersonas.add(new Persona("Antón", "01/05/1979", "España", 15));
        //Creo el arraylist de Vacunódromos
        ArrayList<Vacunodromo> listadoVacunodromos = new ArrayList<Vacunodromo>();
        /*
    Casa Grande{
        TipoVacuna = Sputnik,
        Rango Edad Maximo = -1 (No hay)
        Rango Edad Minimo = 80
   }*/
        listadoVacunodromos.add(new Vacunodromo("Casa Grande", "Sputnik", 5));
        /*
        Clínico{
        TipoVacuna = AstraZeneka,
        Rango Edad Maximo = -1 (No hay)
        Rango Edad Minimo = 70
   }*/
        listadoVacunodromos.add(new Vacunodromo("Clínico", "AstraZeneka", 4));
        /*
       Hospital Militar{
        TipoVacuna = Janssen,
        Rango Edad Maximo = -1 (No hay)
        Rango Edad Minimo = 60
   }*/
        listadoVacunodromos.add(new Vacunodromo("Hospital Militar", "Janssen", 3));
        /*
       Quirón{
        TipoVacuna = pzer,
        Rango Edad Maximo = -1 (No hay)
        Rango Edad Minimo = 50
   }
   */
        listadoVacunodromos.add(new Vacunodromo("Quirón", "pzer", 4));
        /*
       Montpellier{
        TipoVacuna = Moderna,
        Rango Edad Maximo = 49 (No hay)
        Rango Edad Minimo = 10
   }
     */
        listadoVacunodromos.add(new Vacunodromo("Montpellier", "Moderna", 2));

        //Creo el gestionador de citas para repartir pacientes
        GestorCitas gestionador = new GestorCitas(listadoPersonas);


        for (Persona posiblePaciente: gestionador.getListaDeEspera()){
            if (posiblePaciente.getFechaNacimiento().before("01/01/2015")){ //Eso es lo que
                //Creo una instancia Afiliado
                //Aleatoriamente decido si quiere vacunarse o no
                //Comparo el la edad de las personas y la capacidad del Vacunodromo y lo asigno al que corresponda
            }
        }


    }
}