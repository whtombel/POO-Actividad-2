import java.util.Scanner;

public class E21 {

    public static void main(String[] args){
        
        try (Scanner scanner = new Scanner (System.in)) {
            int Lado1,Lado2,Lado3,P,Sp;
            Float A;

            System.out.println("Introduce el Lado 1:");
            Lado1= scanner.nextInt();

            System.out.println("Introduce el Lado 2:");
            Lado2= scanner.nextInt();

            System.out.println("Introduce el Lado 3:");
            Lado3= scanner.nextInt();

            P = Lado1+Lado2+Lado3;
            Sp = P/2;
            A= (float) Math.sqrt(Sp*(Sp-Lado1)*(Sp-Lado2)*(Sp-Lado3));

            System.out.println("El perimetro del triangulo es: "+P);
            System.out.println("El semiperimetro del triangulo es: "+Sp);
            System.out.println("El perimetro del triangulo es: "+A);
        }

    }
}
    


