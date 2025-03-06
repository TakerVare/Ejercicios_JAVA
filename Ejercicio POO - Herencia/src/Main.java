public class Main {
    public static void main(String[] args) {
        // Creo algunos inmuebles para probar
        Piso piso1 = new Piso("Avenida Me la invento, 13, 3A", 85, 5, 200000, 3);
        Piso piso2 = new Piso("Calle Desengaño, 21, 1B", 70, 20, 180000, 1);

        Local local1 = new Local("Calle Nueva 5", 40, 10, 150000, 1);
        Local local2 = new Local("Avenida PNo tengo imaginación 18", 60, 25, 220000, 5);

        // Muestro la información de los inmuebles
        System.out.println(piso1.toString());
        System.out.println("################################");
        System.out.println(piso2.toString());
        System.out.println("################################");
        System.out.println(local1.toString());
        System.out.println("################################");
        System.out.println(local2.toString());
    }
}