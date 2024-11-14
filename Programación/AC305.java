import java.util.Scanner;
public class AC305 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //definimos las variables TOT para calcular el precio total, PA para calcular el precio por alumno y NA para sacar el número de alumnos
        double TOT;
        double PA; 
        System.out.println("Introduzca cantidad de alumnos: ");
        int NA = sc.nextInt();
        /*Introducimos un if para que el programa sepa que si NA es mayor o igual que 100 y le damos el valor al NA y al 
        PA que nos dice el problema*/
        if (NA >= 100){
            PA = 65;
            TOT = PA * NA;
            System.out.println("el costo de la excursión es de " + PA + " y el total del viaje es " + TOT + "€");
        /* utilizamos else if para que siga calculando en caso de que entre un número entre el 50 y el 99 saque el PA y el NA de este caso y 
         * del siguiente caso que sea de 30 a 49 */
        }else if (NA >= 50 && NA < 99){
            PA = 70.5;
            TOT = PA * NA;
            System.out.println("el costo de la excursión es de " + PA + " y el total del viaje es " + TOT + "€");
        }else if (NA >= 30 && NA < 49){
            PA = 95;
            TOT = PA * NA;
            System.out.println("el costo de la excursión es de " + PA + " y el total del viaje es " + TOT + "€");
            //cerramos con el else que dirá si no cumple ninguna de las anteriores premisas el PA será de 400 euros
        }else{
            PA = 400;
            TOT = PA * NA;
            System.out.println("el costo de la excursión es de " + PA + " y el total del viaje es " + TOT + "€");
        sc.close();
        }
    }
}