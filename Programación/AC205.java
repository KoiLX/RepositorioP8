public class AC205 {
    public static void main(String[] args) {
        //área de un cuadrado
        int lado = 5;
        lado *= 5;
        System.out.println("el área de un cuadrado es igual al cuadrado de sus lados, por lo tanto: " + lado + "cm");
        //perimetro de un rectángulo
        int longitud = 8;
        int altura = 4;
        longitud += altura;
        longitud *= 2;
        System.out.println("el perímetro se calcula multiplicando por 2 la suma de longitud y alura, por lo tanto:" + longitud + "cm");

        //altura ya es un valor por lo tanto lo he puesto en ingles ya que el diminutivo sería "h"
        //área de un triangulo
        int base = 18;
        int heigh = 15;
        base *= heigh;
        System.out.println("el perímetro de un triangulo se calcula multiplicando base(b) por altura(h) y luego multiplicandolo por 1/2, por lo tanto: " + base / 2 + "cm");

        //radio de un circulo
        double area = 7.5;
        area *= area;
        System.out.println("el área del circulo es igual a pi por el área al cuadrado, por lo tanto: " + area * 3.14159 + "cm^2");
    }
}
