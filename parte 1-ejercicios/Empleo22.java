import java.util.Scanner; //Se importa el scanner para pedir la información al empleado

public class Empleo22 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            //Creo un objeto persona y pido por input su nombre
            Empleado Persona = new Empleado();
            System.out.println("Ingrese su nombre y apellido: ");
            Persona.nombre = Entrada.nextLine();

            //Pido por input el salario por hora del empleado
            System.out.println("Ingrese su salario por hora: ");
            Persona.salario_hora = Entrada.nextDouble();

            //Pido por input las horas que trabaja el empleado al mes
            System.out.println("Ingrese las horas que trabaja al mes: ");
            Persona.horas_trabajo_mes = Entrada.nextDouble();

            //Con la informacion anterior calculo el salario mensual del empleado
            Persona.salario_mes = (Persona.salario_hora*Persona.horas_trabajo_mes);

            if (Persona.salario_mes>=450000) {//Si el empleado gana mas de $450.000 mensual se muestra su nombre y su salrio mensual
                System.out.println("Muchas gracias " + Persona.nombre + ", su salario mensual es de: " + Persona.salario_mes);
            }
            else{//Si el empreado no gana mas de $450.000 mensual se imprime su nombre
                System.out.println("Muchas gracias " + Persona.nombre);
            }
        }
    }
}

//Creo una clase Empleado y le asigno 4 atributos
class Empleado{
    String nombre;
    double salario_hora;
    double horas_trabajo_mes;
    double salario_mes;

}
