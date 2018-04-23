package exercicio;

public class Losango implements ObjetoGeometrico {

    double calcularArea;
    double calcularPerimetro;

    public Losango(double diagonal1, double diagonal2) {
        calcularArea = (diagonal1 * diagonal2) / 2;
        if (diagonal1 > diagonal2) {
            calcularPerimetro = (diagonal1 / 2) * 4;
        } else {
            calcularPerimetro = (diagonal2 / 2) * 4;
        }
    }

    public double calcularArea(double diagonal1, double diagonal2) {
        calcularArea = (diagonal1 * diagonal2) / 2;

        return calcularArea;
    }

    public double calcularPerimetro(double diagonal1, double diagonal2) {
        if (diagonal1 > diagonal2) {
            calcularPerimetro = (diagonal1 / 2) * 4;
        } else {
            calcularPerimetro = (diagonal2 / 2) * 4;
        }

        return calcularPerimetro;
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
