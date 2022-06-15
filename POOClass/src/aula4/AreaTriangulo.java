package aula4;

public class AreaTriangulo {

    private double altura;
    private double base;

    public AreaTriangulo() {
    }

    public AreaTriangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    double calcularAreaTriangulo() {
        return (base * altura) / 2;
    }


}
