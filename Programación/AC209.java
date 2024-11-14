import java.util.Scanner;

public class AC209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        System.out.println("Escribe tu primer apellidos");
        System.out.println("Escribe tu segundo apellido");

        //asignamos el apellido a las variable
        String primerApellido = sc.nextLine();
        String segundoApellido = sc.nextLine();

        //creamos una variable temporal e intercambiamos los valores
        String tmp = primerApellido;
        primerApellido = segundoApellido; 
        segundoApellido = tmp;

        System.out.println(primerApellido + " " + segundoApellido);
        sc.close();
    }
}
