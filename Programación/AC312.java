import java.util.Scanner;
public class AC312 {
    /**
     * @author Sergio Bailén Sampere
     * @version 1.0
     * Escribe un programa que pida que se introduzcan dos números 
     * enteros N1 y N2 por teclado y muestre los números pares que hay entre ellos. 
     * N1 debe ser menor que N2. Si no es así se mostrará un mensaje indicándolo y se vuelven a introducir.
     * Se solicita por terminal que se introduzcan 2 números enteros. 
     * Utilza un if para que si se introduce un N1 que es mayor a N2 imprima un código de error. 
     * Después se usa el for para darle el valor de N1 a i, y que en caso de que sea mayor o igual que N2
     * se le sume 1 a la variable i. Por último se introduce dentro del for un if para que haga la operación
     * para sacar los pares y lo suelte por la terminal.
     * @param args
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("introduce un número entero");
    int N1 = sc.nextInt();
    System.out.println("introduce otro número entero");
    int N2 = sc.nextInt();
    if (N1 >= N2){
        System.out.println("El primer número tiene que ser menor el segundo, vuelve a introducirlos. ");
    }
        for(int i = N1; i <= N2; i++ ){
            if (i % 2 == 0){
                System.out.println(i);
            }
            
       sc.close();
        }
   
    }
}