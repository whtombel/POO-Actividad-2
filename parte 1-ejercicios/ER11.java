import java.util.Scanner;

public class ER11 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            //Se crean las variables y se agregan los valores por medio del Scanner
            double n1, n2, n3, mayor;
            System.out.println("Ingrese el primer valor: ");
            n1 = entrada.nextDouble();
            System.out.println("Ingrese el segundo valor: ");
            n2 = entrada.nextDouble();
            System.out.println("Ingrese el tercer valor: ");
            n3 = entrada.nextDouble();
            
            //Verifica cual de los 3 numeros es mayor para guardarlo en la variable mayor
            if ((n1>n2) && (n1>n3)) {
                mayor = n1;
            }
            else{
                if (n2>n3) {
                    mayor = n2;
                }
                else{
                    mayor = n3;
                }
            }

            //Se imprime el mayor de los 3 numeros
            System.out.println("El mayor valor entre "+n1+", "+n2+", "+n3+" es: "+ mayor);
        }
    }


}
