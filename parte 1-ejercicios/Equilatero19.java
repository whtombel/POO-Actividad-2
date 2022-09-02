import java.util.Scanner; //Se importa Scanner para pedir informacion por la terminal

public class Equilatero19 {
    public static void main(String[] args) {
        try (//Creo una instancia para el Scanner y utilizarlo despues
        Scanner entrada = new Scanner(System.in)) {
            System.out.println("Ingrese el tamaño de un lado del triangulo equilatero: ");

            //Creo un objeto de triangulo y encuentro sus medidas con el input ingresado
            Triangulo Equilatero = new Triangulo();
            Equilatero.lado = entrada.nextDouble();
            Equilatero.perimetro = 3*(Equilatero.lado);
            Equilatero.altura = ((Equilatero.lado)*(Math.sqrt(3)))/2;
            Equilatero.area = (Equilatero.lado*Equilatero.altura)/2;
            
            //Imprimo en la terminal los resultados
            System.out.println("El lado de el triangulo es: " + Equilatero.lado);
            System.out.println("El perimetro de el triangulo es: " + Equilatero.perimetro);
            System.out.println("La altura de el triangulo es: " + Equilatero.altura);
            System.out.println("El area de el triangulo es: " + Equilatero.area);
        }
    }
}

//Creo la clase triangulo y 4 atributos del triangulo
class Triangulo {         
    double perimetro;
    double altura;
    double area;
    double lado;
}