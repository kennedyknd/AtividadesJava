package exercicio;

public class Quadrado extends Retangulo implements ObjetoGeometrico {

    public Quadrado(double lado) {
        super(lado, lado);
    }

    public double calcularArea(double lado) {return area;
    }

   
    public double calcularPerimetro(double lado) {
        return perimetro;
    }

}
