import java.util.Scanner;

public class ER7 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            //Creamos las variables y se les agregan valores con el Scanner
            double a, b;
            System.out.println("Introduce el valor del primer numero: ");
            a = entrada.nextDouble();
            System.out.println("Introduce el valor del segundo numero: ");
            b = entrada.nextDouble();

            //Se compara cual de los 2 numeros es mayor
            if (a>b) {
                System.out.println(a + " es mayor que " + b);
            }
            else{
                System.out.println(a + " es menor que " + b);
            }
        }
    }
}

