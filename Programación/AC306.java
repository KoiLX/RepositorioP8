import java.util.Scanner;

public class AC306 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //se introducen 3 variables de número para poder darles los valores necesarios
        int N1 = sc.nextInt();
        int N2 = sc.nextInt(); 
        int N3 = sc.nextInt();
        System.out.println("Ingrese el primer número ");
        System.out.println("Ingrese el segundo número ");
        System.out.println("Ingrese el tercer número ");
        /*se utiliza un if para que los valores hagan 
        la función de que en el primero caso N1 sea el mayor, en el segundo N2 y en caso de que ninguno
        de los dos sea el mayor, sea N3*/
        if (N1 <= N2 && N1 <= N3 ) {
            System.out.println("el mayor de los 3 números es" + N1);
        }else if (N2 <= N1 + N3) {
            System.out.println("el número más grande de los 3 es el " + N2);
        
        }else{
            System.out.println("el número más grande es " + N3);
        }
    sc.close();
    }
}
