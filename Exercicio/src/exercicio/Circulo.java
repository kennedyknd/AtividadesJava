package exercicio;

public class Circulo implements ObjetoGeometrico {

    double area;
    double perimetro;

    Circulo(double pi, double raio) {
        area = ((raio * raio) * pi);
        perimetro = raio * (2 * pi);
    }

    public double calcularArea(double pi, double raio) {
        area = ((raio * raio) * pi);
        return area;

    }

    public double calcularPerimetro(double pi, double raio) {
        perimetro = (2 * pi) * raio;
        return perimetro;

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
