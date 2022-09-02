import java.util.Scanner;

public class ER13 {
    public static void main(String[] args) {
        try (
            //Se crean 2 sacaner para los 2 tipo de datos en las variables
            Scanner entrada = new Scanner(System.in)) {
            try (
                Scanner colo = new Scanner(System.in)) {
                double valcomp, valpag, pdes;
                String color;

                //Se pide el valor de la compra y el color de la bolita que pueden ser blanco, verde, amarillo, azul, rojo
                System.out.println("Ingrese el valor de su compra: ");
                valcomp = entrada.nextDouble();
                System.out.println("Ingrese el color de la bolita: ");
                color = colo.nextLine();
                
                //Dependiendo del color seleccionado se le aplica un descuento diferente
                if (color.equals("blanco")) {
                    pdes = 0;
                } else {
                    if (color.equals("verde")) {
                        pdes = 0.1;
                    } else {
                        if (color.equals("amarillo")) {
                            pdes = 0.25;
                        } else {
                            if (color.equals("azul")) {
                                pdes = 0.5;
                            } else {
                                pdes = 1;
                            }
                        }
                    }
                }

                //Se calcula y se imprime el valor a pagar despues de aplicar el descuento tambien se imprime el color y porcentaje de descuento 
                valpag = valcomp - (pdes*valcomp);
                System.out.println("Color: "+ color);
                System.out.println("pdes: " + pdes);
                System.out.println("El cliente debe pagar: $"+valpag);
            }
        }  
    }
    
}
