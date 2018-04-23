package exercicio;

public class Triangulo implements ObjetoGeometrico {

    double calcularArea;
    double calcularPerimetro;

    Triangulo(double base, double altura, double diagonal) {
        calcularArea = (base * altura) / 2;
        calcularPerimetro = base + altura + diagonal;
    }

    public double calcularArea(double base, double altura) {
        calcularArea = (base * altura) / 2;
        return calcularArea;
    }

    @Override
    public double calcularPerimetro(double base, double altura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularArea(double base, double altura, double diagonal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularPerimetro(double base, double altura, double diagonal) {
        calcularPerimetro = base + altura + diagonal;

        return calcularPerimetro;
    }

}
