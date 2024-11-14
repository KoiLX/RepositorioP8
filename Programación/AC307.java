import java.util.Scanner;
public class AC307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un número del mes");
        //solicitar un número del 1 al 12 para devolverle la estación equivalente
        int mes = sc.nextInt();
        switch (mes){
            case 1: System.out.println("Invierno");
                break;
            case 2: System.out.println("Invierno");
                break;
            case 3: System.out.println("Invierno");
                break;
            case 4: System.out.println("Primavera");
                break;
            case 5: System.out.println("Primavera");
                break;
            case 6: System.out.println("Primavera");
                break;
            case 7: System.out.println("Verano");
                break;
            case 8: System.out.println("Verano");
                break;
            case 9: System.out.println("Verano");
                break;
            case 10: System.out.println("Otoño");
                break;
            case 11: System.out.println("Otoño");
                break;
            case 12: System.out.println("Otoño");
                break;
            default: System.out.println("Mes no válido, introduzca uno del 1 al 12");
    /*utilizamos un switch de números para que cada caso suelte una opción en concreto y que en caso de
    mandar uno más grande responda que no es válido*/ 
    }
    sc.close();
}
}
