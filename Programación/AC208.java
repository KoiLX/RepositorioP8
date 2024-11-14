import java.util.Scanner;
public class AC208 {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("¿A qué sección del menú desea entrar?");
            String num = sc.next();
            System.out.println("Su selección es: " + num);
            sc.close();
            }
}
