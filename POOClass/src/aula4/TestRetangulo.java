package aula4;

public class TestRetangulo {

    public static void main(String[] args) {

        AreaRetangulo objRetangulo = new AreaRetangulo();

        objRetangulo.setAltura(2.5);
        objRetangulo.setBase(5.6);

        System.out.println("Area: " + objRetangulo.calcularArea());

        System.exit(0);
    }
}
