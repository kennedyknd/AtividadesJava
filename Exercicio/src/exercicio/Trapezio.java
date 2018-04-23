package exercicio;

public class Trapezio implements ObjetoGeometrico {

    double area;
    double calcularPerimetro;

    Trapezio(double baseMaior, double baseMenor, double altura){
    area = ((baseMaior + baseMenor) * altura) / 2;
    calcularPerimetro = baseMaior + baseMenor + (altura * 2);
    }
    public double calcularArea(double baseMaior, double baseMenor, double altura) {
        area = ((baseMaior + baseMenor) * altura) / 2;
        return area;
    }

    public double calcularPerimetro(double baseMaior, double baseMenor, double altura) {
        calcularPerimetro = baseMaior + baseMenor + (altura * 2);
        return calcularPerimetro;
    }

    public double calcularArea(double base, double altura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularPerimetro(double base, double altura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
