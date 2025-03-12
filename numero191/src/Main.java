import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = 0;
        casos= sc.nextInt();
        //sc.nextLine();
        //Creo el array del tamaño de casos que me han dicho
        int[][] arryCasos = new int[casos][3];

        //relleno el array con los datos
        for(int i=0; i<arryCasos.length; i++){
            for (int j = 0; j<arryCasos[i].length; j++){
                arryCasos[i][j]= sc.nextInt();
            }
        }

        //Muestro le resultado
        int aux=0;
        for(int i=0; i<arryCasos.length; i++){
            for(int j = arryCasos[i][0]; j<3; j++){
                aux+= (arryCasos[i][1]-(arryCasos[i][2])*(arryCasos[i][0]-(arryCasos[i][0]-1)));
            }

            System.out.println(aux);
            aux=0;
        }





    }
}