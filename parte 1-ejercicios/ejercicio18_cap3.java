import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try (Scanner entrada = new Scanner (System.in)) {
      int codigo;
      String nombre;
      double numhorast, valhorast, porcentajerf,salbruto, salneto;

      System.out.println("ingrese el nombre:");
      nombre = entrada.next();
      System.out.println("ingrese codigo:");
      codigo = entrada.nextInt();
      System.out.println("ingrese numero de horas trabajadas al mes:");
      numhorast = entrada.nextDouble();
      System.out.println("ingrese el valor de la hora:");
      valhorast = entrada.nextDouble();
      System.out.println("ingrese porcentaje retencion en la fuente:");
      porcentajerf = entrada.nextDouble();

      salbruto = valhorast * numhorast;
      salneto = salbruto - (salbruto*(porcentajerf/100));

      System.out.println("codigo del empleado: " + codigo);
      System.out.println("nombre: " + nombre);

      System.out.println("salario bruto: " + salbruto);
      System.out.println("salario neto: " + salneto);
    }   
  }
}