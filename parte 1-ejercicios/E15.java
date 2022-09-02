import java.util.Scanner;

public class E15 {
    
    public static void main(String[] args){
        
        try (Scanner sc = new Scanner (System.in)) {
            int A,B,C,D;
            //X= menor Y=mayor

            System.out.println("Peso esfera A:");
            A = sc.nextInt();

            System.out.println("Peso esfera B:");
            B = sc.nextInt();

            System.out.println("Peso esfera C:");
            C= sc.nextInt();

            System.out.println("Peso esfera D:");
            D = sc.nextInt();

            if ((A==B) && (A==C)){
                if (D>A){
                    System.out.println("La esfera D es diferente y de mayor peso");
                }else{
                    System.out.println("La esfera D es diferente y de menor peso");
                }
            }else{
                if ((A==B) && (A==D)){
                    if(C>A){
                        System.out.println("La esfera C es diferente y de mayor peso");
                    }else{
                        System.out.println("La esfera C es diferente y de menor peso");
                    }
                }else{
                    if ((A==C) && (A==D)){
                        if (B>D){
                            System.out.println("La esfera B es diferente y de mayor peso");
                        }else{
                            System.out.println("La esfera B es dirente y de menor peso");
                        }
                    }else{
                        if (A>B){
                            System.out.println("La esfera A es diferente y de mayor peso");
                        }else{
                            System.out.println("La esfera A es diferente y de menor peso");
                        }
                    }
                }
            }
        }
    }

 }

