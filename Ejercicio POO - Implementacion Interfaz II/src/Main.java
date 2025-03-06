public class Main {
    public static void main(String[] args) {
        // Crear un array de 5 figuras
        iFigura[] figuras = new iFigura[5];

        // Inicializar con diferentes figuras
        figuras[0] = new Rectangulo(5, 3);
        figuras[1] = new Circulo(4);
        figuras[2] = new Triangulo(6, 4);
        figuras[3] = new Rectangulo(7, 2);
        figuras[4] = new Circulo(2.5);

        int iIndice=0;

        for (iFigura figura : figuras) {
            iIndice++;
            System.out.println("Figura nº: "+iIndice+ " - " + figura);
            System.out.println("Perímetro: " + figura.getPerimetro());
            System.out.println("Área: " + figura.getArea());
            System.out.println("######################################");
        }
    }
}