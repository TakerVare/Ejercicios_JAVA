Escribe una aplicación para trabajar con figuras. La aplicación deberá poder gestionar rectángulos, círculos y triángulos. Todos los tipos de figuras implementarán un interfaz Figura que contendrá dos métodos para calcular el perímetro y el área de la figura:
-double getPerimetro();
-double getArea();

Los atributos que tendrá cada tipo de figura son:
-Triángulo: base y altura
-Rectángulo: base y altura
-Círculo: radio
Estos atributos se inicializarán a través del constructor de cada clase.

Crear una clase principal. Crear un método main que:
-Genere un array de 5 figuras que contenga varios ejemplares de rectángulos, círculos y triángulos.
-Recorra el array y muestre el perímetro y el área de cada figura.