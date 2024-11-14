import java.util.Scanner;
public class AC309 {
    /**
     * @author Sergio Bailén Sampere
     * @version 1.0
     * Algoritmo para determinar, de N cantidades, cuántas son menores o iguales a cero y cuántas mayores a cero.
     * utilzamos las variables contador 
     * 
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int positivo = 0;
        int negativo = 0;
        System.out.println("introduce un número: ");
        double cant = sc.nextDouble();
        
       
        while (contador != cant){
            System.out.print("Introduzca un número: ");
            int tmpnum = 0;
            tmpnum = sc.nextInt();
            if (tmpnum > 0) {
                positivo++;
            }else{
                negativo++;
            }
                contador++;
        }
        
        System.out.println("has introducido " + positivo);
        System.out.println("has introducido " + negativo);
        sc.close();
        
    }
}