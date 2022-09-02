import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try (Scanner entrada = new Scanner (System.in)) {
      double pesfera1, pesfera2, pesfera3;
      
      System.out.println("ingrese peso de la esfera 1:");
      pesfera1 = entrada.nextDouble();
      System.out.println("ingrese peso de la esfera 2:");
      pesfera2 = entrada.nextDouble();
      System.out.println("ingrese peso de la esfera 3:");
      pesfera3 = entrada.nextDouble();

      if (pesfera1>pesfera2 && pesfera1>pesfera3){
        System.out.println("La esfera 1 es la mas pesada"); 
      }
      else if (pesfera2>pesfera1 && pesfera2>pesfera3){
        System.out.println("La esfera 2 es la mas pesada"); 
      }
      else if (pesfera3>pesfera1 && pesfera3>pesfera2){
        System.out.println("La esfera 3 es la mas pesada"); 
      }
    }

  }
}