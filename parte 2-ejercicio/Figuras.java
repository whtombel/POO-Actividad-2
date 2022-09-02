class Círculo {

    int radio; // Define el radio de un círculo

    Círculo(int radio) {
        this.radio = radio;
    }

    //cálculo area del circulo
    double calcularArea() {
    return Math.PI*Math.pow(radio,2);
    }

    //perímetro del circulo
    double calcularPerímetro() { 
    return 2*Math.PI*radio;
    }
    
}

class Rectángulo {
    int base; // Base del rectangulo
    int altura; // Altura del rectangulo

    Rectángulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
    }
    // Calcula el area del rectangulo
    double calcularArea() {
    return base * altura;
    }
    // Calcula el perimetro del rectangulo
    double calcularPerímetro() {
    return (2 * base) + (2 * altura);
    }
}

class Cuadrado {
    
    //definicion de variable lado
    int lado; 
    
    public Cuadrado(int lado) {
    this.lado = lado;
    }
    //area del cuadrado
    double calcularArea() {
    return lado*lado;
    }
    //perimetro del cuadrado
    double calcularPerímetro() {
    return (4*lado); 

    }
}

class Rombo{
    int lado;
    int diagMayor;
    int diagMenor;

    public Rombo(int lado, int diagMayor, int diagMenor){
        this.diagMayor = diagMayor;
        this.lado = lado;
        this.diagMenor = diagMenor;
    }
    //area del Rombo
    double calcularArea(){
        return ((diagMayor*diagMenor)/2);
    }
    //Perimetro del rombo
    double calcularPerímetro(){
        return (4*lado);
    }
}

class Trapecio{
    int altura;
    int baseMayor;
    int baseMenor;
    int lado;

    public Trapecio(int altura, int baseMayor, int baseMenor, int lado){
        this.altura = altura;
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.lado = lado;
    }

    double calcularArea(){
        return(((baseMayor+baseMenor)/2)+altura);
    }

    double calcularPerímetro(){
        return (baseMayor+baseMenor+lado+lado);
    }
}

class TriánguloRectángulo {
    int base; // define la base de un triángulo rectángulo
    int altura; //  define la altura de un triángulo rectángulo

    // define la base y la altura del triangulo
    public TriánguloRectángulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
    }

    //calculo del area
    double calcularArea() {
    return (base * altura / 2);
    }

    //perímetro del triangulo
    double calcularPerímetro() {
    return (base + altura + calcularHipotenusa()); 
    } // calculo la hipotenusa

    //calculo hipotenusa del triangulo
    double calcularHipotenusa() {
    return Math.pow(base*base + altura*altura, 0.5);
    }

    // Determina tipo de triangulo 
    void determinarTipoTriángulo() {
    if ((base == altura) && (base == calcularHipotenusa()) && (altura== calcularHipotenusa()))
        System.out.println("Es un triángulo equilátero"); //lados iguales  
    else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
        System.out.println("Es un triángulo escaleno"); //lados diferentes
    else
        System.out.println("Es un triángulo isósceles"); // isoceles por descarte 
    }
}

public class Figuras {
    public static void main(String[] args) {
        
        Círculo figura1 = new Círculo(2);
        Rectángulo figura2 = new Rectángulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TriánguloRectángulo figura4 = new TriánguloRectángulo(3,5);
        Rombo figura5 = new Rombo(5, 8, 4);
        Trapecio figura6 = new Trapecio(4, 8, 6, 5);
        
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerímetro());

        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerímetro());
        
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerímetro());

        System.out.println();
        System.out.println("El área del rombo es = " + figura5.calcularArea());

        System.out.println("El perímetro del rombo es = " + figura5.calcularPerímetro());
        
        System.out.println();
        System.out.println("El área del trapecio es = " + figura6.calcularArea());

        System.out.println("El perímetro del trapecio es = " + figura6.calcularPerímetro());
        
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerímetro());
        
        figura4.determinarTipoTriángulo();
        System.out.println();
    }
}

       