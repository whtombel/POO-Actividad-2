import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try (Scanner entrada = new Scanner (System.in)) {
        double ventasd1, ventasd2, ventasd3, salario, totalv, porcentajev, salariod1, salariod2, salariod3;

        System.out.println("ingrese ventas del departamento 1:");
        ventasd1 = entrada.nextDouble();
        System.out.println("ingrese ventas del departamento 2:");
        ventasd2= entrada.nextDouble();
        System.out.println("ingrese ventas del departamento 3:");
        ventasd3= entrada.nextDouble();
        System.out.println("ingrese el salario:");
        salario= entrada.nextDouble();

        totalv = ventasd1 + ventasd2 + ventasd3;
        porcentajev = 0.33 * totalv;

        if (ventasd1>porcentajev){
          salariod1= salario + salario*0.2;
        }
        else {
          salariod1 = salario;
        }

        if (ventasd2>porcentajev){
            salariod2= salario + salario*0.2;
          }
          else {
            salariod2 = salario;
          }
          if (ventasd3>porcentajev){
            salariod3 = salario + salario*0.2;
          }
          else {
            salariod3 = salario;
          }
      
          System.out.println("salario vendedores depto 1: " + salariod1 + " ,salario vendedores depto 2: " + salariod2 + " ,salario vendedores depto 3: " + salariod3);
    }

    


    
  }
}