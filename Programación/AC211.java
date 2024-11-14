import java.util.Scanner;
public class AC211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        System.out.print("Introduce el lado del triangulo");

        //aplicamos las fórmulas para calcular el área
        int numero = sc.nextInt();
        double lado = numero;
        double altura = lado * (Math.sqrt(3)) / 2;
        double área = (lado * altura) / 2;

        System.out.println("El área es: " + área);
        sc.close();

        }
}
