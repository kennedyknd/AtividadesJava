package exercicio;

public class FormasGeometricas {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(9, 5);
        System.out.println("==============");
        System.out.println("Área Retângulo");
        System.out.println(retangulo.area);
        System.out.println("Perímetro Retângulo");
        System.out.println(retangulo.perimetro + "\n");

        Quadrado quadrado = new Quadrado(5);
        System.out.println("=============");
        System.out.println("Área Quadrado");
        System.out.println(quadrado.area);
        System.out.println("Perímetro Quadrado");
        System.out.println(quadrado.perimetro);
        
        Losango losango = new Losango(10,5);
        System.out.println("=============");
        System.out.println("Área Losango");
        System.out.println(losango.calcularArea);
        System.out.println("Perímetro Losango");
        System.out.println(losango.calcularPerimetro);

        Trapezio trapezio = new Trapezio(10,5,7);
        System.out.println("=============");
        System.out.println("Área Trapézio");
        System.out.println(trapezio.calcularArea);
        System.out.println("Perímetro Trapézio");
        System.out.println(trapezio.calcularPerimetro);
        
        Triangulo triangulo = new Triangulo(10,5,7);
        System.out.println("=============");
        System.out.println("Área Triângulo");
        System.out.println(triangulo.calcularArea);
        System.out.println("Perímetro Triângulo");
        System.out.println(triangulo.calcularPerimetro);
        
        Circulo circulo = new Circulo(3.14, 6);
        System.out.println("=============");
        System.out.println("Área Círculo");
        System.out.println(circulo.calcularArea);
        System.out.println("Perímetro Círculo");
        System.out.println(circulo.calcularPerimetro);
    }

}
