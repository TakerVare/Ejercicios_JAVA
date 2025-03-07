import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList<Actividad> listaActividades = new ArrayList<Actividad>();
        GestorParque Dinopolis = new GestorParque<>(new ArrayList<Dinosaurio>());
        creaActividadesGenericas(listaActividades);

        imprimeMenuInicial(listaActividades, Dinopolis);



    }

    public static void imprimeMenuInicial(ArrayList<Actividad> listaActividades, GestorParque p_parque)
    {
        int iMenu=0;
        Scanner scEntradaMenu = new Scanner(System.in);
        System.out.println("##################################");
        System.out.println("MENÚ DE GESTIÓN DEL PARQUE: ");
        System.out.println("----------------------------------");
        System.out.println("0. Salir");
        System.out.println("1. Añadir herbívoros y carnívoros al sistema.");
        System.out.println("2. Mostrar todos los dinosaurios con información detallada.");
        System.out.println("3. Listar dinosaurios por periodo.");
        System.out.println("4. Mostrar el dinosaurio más grande (atracción estrella).");
        System.out.println("5. Asignar dinosaurios a actividades.");
        System.out.println("6. Buscar dinosaurio por nombre.");
        System.out.println("----------------------------------");

        try{
            iMenu=scEntradaMenu.nextInt();
            switch (iMenu){
                case 0:
                    System.out.println("Adios.");
                    break;
                case 1:
                    imprimeMenuAltaDinosaurio(listaActividades, p_parque);
                    break;
                case 2:
                    imprimeListadoDetalladoDinosaurios(listaActividades, p_parque);
                    break;
                case 3:
                    listarDinosauriosPorPeriodo(listaActividades, p_parque);
                    break;
                case 4:
                    mostrarDinosaurioMasGrande(listaActividades, p_parque);
                    break;
                case 5:
                    //asignar dinosaurios a actividades
                    asignarDinosaurioAActividad(listaActividades, p_parque);
                    break;
                case 6:
                    imprimeBusquedaDinosaurioPorNombre(listaActividades, p_parque);
                default:
                    break;
            }

        }catch (Exception e){
            System.out.println("El valor introducido no es válido, por favor vuelva a intentarlo.");
        }finally{
            scEntradaMenu.nextLine();
        }



    }

    public static void imprimeMenuAltaDinosaurio(ArrayList<Actividad> listaActividades, GestorParque p_parque){
        System.out.println("##################################");
        System.out.println("MENÚ ALTA DE DINOSAURIO: ");
        System.out.println("----------------------------------");
        Scanner scEntradaAltaDinosaurio = new Scanner(System.in);
        char cTipo; //Carníoro 'C', Herbívoro 'H', Salir 'S'
        String sNombre;
        double dTamano;
        int iPeriodo =0;
        String sPeriodo;

        try{
            System.out.println("Ingrese el tipo de dinosaurio ('C' ó 'H') o introduzca 'S' para salir: ");
            cTipo=scEntradaAltaDinosaurio.next().charAt(0);
            scEntradaAltaDinosaurio.nextLine();
            if(cTipo!='S' && (cTipo=='C' || cTipo=='H')){
                System.out.println("Introduzca el nombre del dinosaurio: ");
                sNombre=scEntradaAltaDinosaurio.nextLine();
                System.out.println("Introduzca el tamaño del dinosaurio: ");
                dTamano=scEntradaAltaDinosaurio.nextDouble();
                scEntradaAltaDinosaurio.nextLine();
                //Como luego tengo que comparar por periodos, mejor que lo escriba yo de entre unas opciones dadas.
                System.out.println("Introduzca el periodo del dinosaurio: ");
                System.out.println("1. Cretácico");
                System.out.println("2. Jurásico");
                System.out.println("3. Triásico");
                iPeriodo=scEntradaAltaDinosaurio.nextInt();
                scEntradaAltaDinosaurio.nextLine();
                switch (iPeriodo){
                    case 1:
                        sPeriodo="Cretácico";
                        break;
                    case 2:
                        sPeriodo="Jurásico";
                        break;
                    case 3:
                        sPeriodo="Triásico";
                        break;
                    default:
                        System.out.println("Ya elijo yo... Jurásico");
                        sPeriodo="Jurásico";
                        break;
                }

                if(cTipo=='C'){ //Alta de un carnívoro
                    p_parque.altaDinosaurio(new Carnivoro(sNombre, dTamano, sPeriodo));
                }else { //Alta de un herbívoro
                    p_parque.altaDinosaurio(new Herbivoro(sNombre, dTamano, sPeriodo));
                }

            }else{
                System.out.println("El tipo de dinosaurio no corresponde a un tipo de dinosaurio válido.");
                imprimeMenuAltaDinosaurio(listaActividades, p_parque);
            }
        } catch (Exception e) {
            System.out.println("El valor introducido no es válido, por favor vuelva a intentarlo.");
        }finally{
            // De momento no lo uso pero lo dejo por si me sirviera más tarde.
        }

        imprimeMenuInicial(listaActividades, p_parque);
    }

    public static void imprimeListadoDetalladoDinosaurios(ArrayList<Actividad> listaActividades, GestorParque p_parque){
        System.out.println("##################################");
        System.out.println("LISTADO DETALLADO DE DINOSAURIOS: ");
        int iContador=0;
        for (Object dino: p_parque.getParque()){
            System.out.println("----------------------------------");
            System.out.println("Nº. "+iContador+" "+dino.toString());
            iContador++;
        }
        //System.out.println("##################################");

        imprimeMenuInicial(listaActividades, p_parque);

    }

    public static void listarDinosauriosPorPeriodo(ArrayList<Actividad> listaActividades, GestorParque p_parque)
    {
        System.out.println("##################################");
        System.out.println("LISTADO DE DINOSAURIOS POR PERIODO: ");
        System.out.println("----------------------------------");
        System.out.println("DINOSAURIOS DEL CRETÁCICO: ");
        for (Object dino: p_parque.getParque()){
            if(((Dinosaurio) dino).getPeriodo()=="Cretácico"){
                System.out.println(dino.toString());
                //System.out.println("----------------------------------");
            }
        }
        System.out.println("----------------------------------");
        System.out.println("DINOSAURIOS DEL JURÁSICO: ");
        for (Object dino: p_parque.getParque()){
            if(((Dinosaurio) dino).getPeriodo()=="Jurásico"){
                System.out.println(dino.toString());
                //System.out.println("----------------------------------");
            }
        }
        System.out.println("----------------------------------");
        System.out.println("DINOSAURIOS DEL TRIÁSICO: ");
        for (Object dino: p_parque.getParque()){
            if(((Dinosaurio) dino).getPeriodo()=="Triásico"){
                System.out.println(dino.toString());
                //System.out.println("----------------------------------");
            }
        }
        //System.out.println("##################################");
        imprimeMenuInicial(listaActividades, p_parque);
    }

    public static void mostrarDinosaurioMasGrande(ArrayList<Actividad> listaActividades, GestorParque p_parque){
        System.out.println("##################################");
        System.out.println("ATRACCIÓN ESTRELLA - EL DINOSAURIO MÁS GRANDE: ");
        System.out.println("----------------------------------");
        p_parque.ordenarPorTamano();
        Dinosaurio dinoMasGrande = (Dinosaurio) p_parque.getParque().get(0);
        //p_parque.ordenarPorTamano().get(1);
        System.out.println(dinoMasGrande.toString());
        System.out.println("----------------------------------");

        //System.out.println("##################################");
        imprimeMenuInicial(listaActividades, p_parque);
    }

    public static void imprimeBusquedaDinosaurioPorNombre(ArrayList<Actividad> listaActividades, GestorParque p_parque){
        System.out.println("##################################");
        System.out.println("BÚSQUEDA DE DINOSAURIO POR NOMBRE: ");
        System.out.println("----------------------------------");
        Scanner scEntradaBusquedaDinosaurio = new Scanner(System.in);
        String sNombre;

        try{
            System.out.println("Introduzca el nombre del dinosaurio: ");
            sNombre=scEntradaBusquedaDinosaurio.nextLine();
            Dinosaurio dino = p_parque.buscarDinosaurioPorNombre(sNombre);
            System.out.println("Se ha encontrado el dinosaurio: "+dino.toString());
        } catch (Exception e) {
            System.out.println("El valor introducido no es válido, o no existe ningún dinosaurio con ese nombre.");
        }finally{
            // De momento no lo uso pero lo dejo por si me sirviera más tarde.
        }

        imprimeMenuInicial(listaActividades, p_parque);
    }

    public static void asignarDinosaurioAActividad(ArrayList<Actividad> listaActividades, GestorParque p_parque) {
        Scanner scEntradaDinoActividades = new Scanner(System.in);
        int iActividad;
        int iDino;
        System.out.println("##################################");
        System.out.println("LISTADO DE DINOSAURIOS: ");
        int iContador=0;
        for (Actividad Activi: listaActividades){
            System.out.println("----------------------------------");
            System.out.println("Nº. "+iContador+" "+Activi.toString());
            iContador++;
        }
        System.out.println("Introduce el número de la actividad.");
        iActividad=scEntradaDinoActividades.nextInt();
        scEntradaDinoActividades.nextLine();

        System.out.println("##################################");
        System.out.println("LISTADO DE DINOSAURIOS: ");
        iContador=0;
        for (Object dino: p_parque.getParque()){
            System.out.println("----------------------------------");
            System.out.println("Nº. "+iContador+" "+dino.toString());
            iContador++;
        }
        System.out.println("Introduce el número de la actividad.");
        iDino=scEntradaDinoActividades.nextInt();
        scEntradaDinoActividades.nextLine();
        Dinosaurio dinoAuxRapido = (Dinosaurio) p_parque.getParque().get(0);

        try {
            listaActividades.get(iActividad).asignarDinosaurio((Dinosaurio) p_parque.getParque().get(iDino));

        }catch (Exception e){

        }

    }
    public static void creaActividadesGenericas(ArrayList<Actividad> listaActividades){
        listaActividades.add(new Actividad("Fotografía con dinosaurios", "Herbívoro"));
        listaActividades.add(new Actividad("Alimentación de herbívoros", "Herbívoro"));
        listaActividades.add(new Actividad("Alimentación de hojas", "Herbívoro"));
        listaActividades.add(new Actividad("Demostración de caza (simulada)", "Carnívoro"));
    }

}