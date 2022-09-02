import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try (Scanner entrada = new Scanner (System.in)) {
      int numhoras, valhoran,hextrast,mayor8, salario;
      String nombre;

      
      System.out.println("ingrese el nombre:");
      nombre = entrada.next();
      System.out.println("ingrese numero de horas trabajadas:");
      numhoras = entrada.nextInt();
      System.out.println("ingrese el valor hora normal trabajada:");
      valhoran = entrada.nextInt();

      if (numhoras>40){
        hextrast=numhoras-40;
          if (hextrast>8){
            mayor8=hextrast-8;
            salario= 40*valhoran + 16*valhoran + mayor8*3*valhoran;
          }  
          else {
            salario = 40*valhoran+ 2*hextrast*valhoran; 
          }
      }  
      else{
        salario=numhoras*valhoran;
      }

      System.out.println("El trabajador "+nombre+ " devengo: $"+salario);
    }
        
  }
}