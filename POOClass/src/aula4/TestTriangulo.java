package aula4;

public class TestTriangulo {

    public static void main(String[] args) {

        AreaTriangulo triangulo = new AreaTriangulo();
        
        triangulo.setAltura(10);
        triangulo.setBase(10);
        
        System.out.println("Área: " + triangulo.calcularAreaTriangulo());
        
        System.exit(0);
    }
}

/*

*/