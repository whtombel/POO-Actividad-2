import java.util.Scanner;

public class E23 {
    
    public static void main(String[] args){
        
        try (Scanner scanner = new Scanner (System.in)) {
            int A,B,C;
            float X1,X2;

            System.out.println("Introduce el coeficiente de segundo grado:");
            A= scanner.nextInt();

            System.out.println("Introduce el coeficiente de primer grado:");
            B= scanner.nextInt();

            System.out.println("Introduce el termino independiente:");
            C= scanner.nextInt();

            X1 = (float)((-(B)+(Math.sqrt((B*B)-4*A*C)))/(2*A));
            X2 = (float)((-(B)-(Math.sqrt((B*B)-4*A*C)))/(2*A));


            System.out.println("El resultado de X1 es: "+X1);
            System.out.println("El resultado de X2 es: "+ X2 );
        }
    }
}