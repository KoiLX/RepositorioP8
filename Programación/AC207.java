import java.util.Scanner;

public class AC207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("introduce variable 1: ");
        System.out.println("introduce variable 2: ");

        String str = sc.next();
        String temp = str;
        String str2 = sc.next();
        //código para que los números se intercambien al escribirlos en terminal
        str = str2;
        str2 = temp;
        
        System.out.println(str + " " + str2);
        sc.close();


    }
}
