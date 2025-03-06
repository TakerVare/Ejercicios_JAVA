import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Declaro el arrayList de legisladores
        ArrayList<Legislador> ladrones = new ArrayList<>();

        imprimeMenu(ladrones);

    }

    public static void imprimeMenu(ArrayList<Legislador> ladrones){
        int iMenu=-1;
        Scanner scEntradaMenu = new Scanner(System.in);

        do{
            System.out.println("MENÚ PRINCIPAL:");
            System.out.println("0. Salir");
            System.out.println("1. Introducir DIPUTADO");
            System.out.println("2. Introducir SENADOR");
            System.out.println("3. Listar Legisladores");
            try {
                iMenu = scEntradaMenu.nextInt();

                switch(iMenu)
                {
                    case 0: // 0. Salir
                        System.out.println("Adios");
                        break;
                    case 1: // 1. Introducir DIPUTADO
                        imprimeIntroducirDiputado(ladrones);
                        break;
                    case 2: // 2. Introducir SENADOR
                        imprimeIntroducirSenador(ladrones);
                        break;
                    case 3: // 3. Listar Legisladores
                        imprimirLegisadores(ladrones);
                        break;
                    default:
                        break;
                }

            }catch (Exception e) {
                System.out.println("El valor introducido no es válido. Por favor vuelve a intentarlo: ");
                imprimeMenu(ladrones);
            }finally {
                scEntradaMenu.nextLine();
            }

        }while (iMenu!=0);



    }

    public static void imprimeIntroducirDiputado(ArrayList<Legislador> ladrones){
        Scanner scEntradaDiputado = new Scanner(System.in);
        String sNombre;
        String sApellido;
        int iEdad;
        String sDocumento;
        String sProvinciaQueRepresenta;
        String sPartidoPolitico;
        int iNumeroDeAsiento;

        try {
            System.out.println("Introduce el nombre: ");
            sNombre=scEntradaDiputado.nextLine();
            System.out.println("Introduce los apellidos: ");
            sApellido=scEntradaDiputado.nextLine();
            System.out.println("Introduce la edad: ");
            iEdad=scEntradaDiputado.nextInt();
            scEntradaDiputado.nextLine();
            System.out.println("Introduce El número del documento de identidad: ");
            sDocumento=scEntradaDiputado.nextLine();
            System.out.println("Introduce la provincia que representa: ");
            sProvinciaQueRepresenta=scEntradaDiputado.nextLine();
            System.out.println("Introduce el partido al que pertenece: ");
            sPartidoPolitico=scEntradaDiputado.nextLine();
            System.out.println("Introduce El número el número de asiento: ");
            iNumeroDeAsiento=scEntradaDiputado.nextInt();

            ladrones.add(new Diputado(sNombre, sApellido, iEdad, sDocumento, sProvinciaQueRepresenta, sPartidoPolitico, iNumeroDeAsiento));

        }catch (Exception e) {
            System.out.println("El valor introducido no es válido. Por favor vuelve a intentarlo: ");
            imprimeIntroducirDiputado(ladrones);
        }finally {
            scEntradaDiputado.nextLine();
        }

    }

    public static void imprimeIntroducirSenador(ArrayList<Legislador> ladrones){
        Scanner scEntradaSenador = new Scanner(System.in);
        String sNombre;
        String sApellido;
        int iEdad;
        String sDocumento;
        String sProvinciaQueRepresenta;
        String sPartidoPolitico;
        int iNumeroDeAsiento;

        try {
            System.out.println("Introduce el nombre: ");
            sNombre=scEntradaSenador.nextLine();
            System.out.println("Introduce los apellidos: ");
            sApellido=scEntradaSenador.nextLine();
            System.out.println("Introduce la edad: ");
            iEdad=scEntradaSenador.nextInt();
            scEntradaSenador.nextLine();
            System.out.println("Introduce El número del documento de identidad: ");
            sDocumento=scEntradaSenador.nextLine();
            System.out.println("Introduce la provincia que representa: ");
            sProvinciaQueRepresenta=scEntradaSenador.nextLine();
            System.out.println("Introduce el partido al que pertenece: ");
            sPartidoPolitico=scEntradaSenador.nextLine();
            System.out.println("Introduce El número el número de asiento: ");
            iNumeroDeAsiento=scEntradaSenador.nextInt();

            ladrones.add(new Senador(sNombre, sApellido, iEdad, sDocumento, sProvinciaQueRepresenta, sPartidoPolitico, iNumeroDeAsiento));

        }catch (Exception e) {
            System.out.println("El valor introducido no es válido. Por favor vuelve a intentarlo: ");
            imprimeIntroducirSenador(ladrones);
        }finally {
            scEntradaSenador.nextLine();
        }

    }

    public static void imprimirLegisadores(ArrayList<Legislador> ladrones){
        for (Legislador legislador : ladrones){
            System.out.println("Este legislador trabaja en la cámara: "+legislador.getNombre());
            System.out.println(legislador.toString());
        }
    }

}