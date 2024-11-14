import java.util.Scanner;
public class AC210 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in); 
    System.out.print("Introduce días");

    int días = sc.nextInt();
    double año = días / 360;
    double mes = días / 30;
    double día = mes % 30;
   
    
    

    
    System.out.println(año);
    System.out.println(mes);
    System.out.println(día);
    sc.close();
}
    }
