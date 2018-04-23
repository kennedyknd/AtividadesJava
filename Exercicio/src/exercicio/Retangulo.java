package exercicio;

public class Retangulo implements ObjetoGeometrico {

    double area;
    double perimetro;

    public double calcularArea(double base, double altura) {
        area = base * altura;
        return area;
    }

    public double calcularPerimetro(double base, double altura) {
        perimetro = 2 * (base + altura);
        return perimetro;
    }

    Retangulo(double base, double altura) {

        area = base * altura;
        perimetro = 2 * (base + altura);
    }

    @Override
    public double calcularArea(double base, double altura, double diagonal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularPerimetro(double base, double altura, double diagonal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
