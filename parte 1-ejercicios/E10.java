import java.util.Scanner;

public class E10 {

    public static void main(String[] args){
        
        try (Scanner sc = new Scanner (System.in)) {
            String Name;
            int Ins,Pat,Es;
            float Matricula;

            System.out.println("Nombre:");
            Name= sc.nextLine();

            System.out.println("Número de inscripción:");
            Ins= sc.nextInt();

            System.out.println("Valor del patrimonio:");
            Pat= sc.nextInt();

            System.out.println("Estrato social:");
            Es= sc.nextInt();

            if ((Pat > 2000000) && (Es > 3)){
                Matricula = (float) (Pat*0.03)+50000;
            } else{
                Matricula = 50000;
            }

            System.out.println("Número de inscripción: "+Ins);
            System.out.println("Nombre: "+Name);
            System.out.println("Valor Pago de matrícula: "+ Matricula);
        }

    }
}