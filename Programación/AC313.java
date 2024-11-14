import java.util.Scanner;
public class AC313 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

        do {    System.out.println("Elige una opción del menú");
        num = sc.nextInt();
            switch (num) {
                case 1:
                System.out.println("Has elegido la primera opción.");
                    break;
            
                case 2:
                System.out.println("Has elegido la segunda opción.");
                    break;
                
                case 3:
                System.out.println("Has elegido la tercera opción");
                    break;
                
                case 4:
                System.out.println("Has elegido la opción 4");
                    break;

                default:
                System.out.println("El número proporcionado no coincide con los que hay en el menú, por favor, introduce un número del 1 al 4");
                    break;
            }
        }while(num != 4);
            System.out.println("saliendo del programa...");
           sc.close(); 
}
    
}
