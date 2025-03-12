import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int iEnvChicles=-1;
        int iRecomEnvolt=-1;
        int iChiclesComp=-1;
        int iChiclesComidos=-1;
        int iEnvoltRest=0;

        do{
            System.out.println("Introduzca el número de envoltorios para obtener el premio: ");
            //Leo
            iEnvChicles=sc.nextInt();
            sc.nextLine();
        }while (iEnvChicles<0);
        do{
            System.out.println("Introduzca la recompensa del premio: ");
            //Leo
            iRecomEnvolt=sc.nextInt();
            sc.nextLine();
        }while (iRecomEnvolt<0);
        do{
            System.out.println("Introduzca el número de chicles que ha comprado: ");
            //Leo
            iChiclesComp=sc.nextInt();
            sc.nextLine();
        }while (iChiclesComp<0);


        if(iEnvChicles>=iRecomEnvolt){
            System.out.println("Ruina");
        }else{
            //Chicles comidos
            iChiclesComidos=((iChiclesComp/iEnvChicles)*iRecomEnvolt)+iChiclesComp+((iChiclesComp/iEnvChicles)/iEnvChicles);
            iEnvoltRest=iChiclesComidos%iEnvChicles;
            System.out.println(iChiclesComidos+" "+iEnvoltRest);
        }


        //option 2
        boolean bContinuar = true;

        while (bContinuar)
        {
            int cambio = sc.nextInt();
            int oferta = sc.nextInt();
            int totalinicial = sc.nextInt();

            if(cambio == 0 && oferta == 0 && totalinicial==0){
                bContinuar = false;
            }
            if(bContinuar){
                if(oferta >= cambio)
                {
                    System.out.println("RUINA");

                }
            }

            int paraCanjear = totalinicial;
            int comido = totalinicial;

            int anterior = 0;
            boolean ruina = false;
            while(paraCanjear >0 cambio || ruina)
            {

            }
        }


    }
}