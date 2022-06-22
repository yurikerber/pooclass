package aula5;

public class TestDebug {

    public static void main(String[] args) {

        int a = 123;
        String b = "123";

        if (Integer.parseInt(b) == a) {
	  System.out.println("igual");
        } else {
	  System.out.println("diferentes");
        }

        if (b.equals(String.valueOf(a))) {
	  System.out.println("igual");
        } else {
	  System.out.println("diferentes");
        }

        try {
	  int vet[] = new int[2];
	  vet[2] = 10;
        } catch (Exception ex) {
	  System.out.println("ERRO: " + ex);
        }

        System.exit(0);
    }

}
