import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero=1;
        int divisor=10;
        int sumatorio=0;
        while (numero!=0 && numero<1000000000 && numero>0){
            numero=sc.nextInt();
            divisor=10;
            while (numero>divisor){
                divisor=divisor*10;
            }
            divisor=divisor/10;
            sumatorio=numero;

            while (divisor>=10){
                sumatorio+=(numero/divisor);
                numero=numero/divisor;
                divisor=divisor/10;
            }
            sumatorio+=numero;

            System.out.println(sumatorio);
        }




    }
}