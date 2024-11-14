import java.util.Scanner;
public class AC310 {
    /** @author Sergio Bailén Sampere
     * @version 1.0
     * Da por terminal el número de filas y numero de ordenadores por clase
     * contador variable es = a 1, mientras que sea menor que 10 suma 1 y pasa al siguiente for
     * el numero de filas variable es = a 1, mientrass que sea menor que 6 suma 1, por lo tanto 
     * el numero de filas y ordenadores en formato "1.1"
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de filas");
        int filas = sc.nextInt();

        for (int contador = 1; contador <= 6; contador++){
            for (filas = 1; filas <= 6; filas++);
            System.out.println(filas + "." + contador);
        }
    sc.close();

    }
}
