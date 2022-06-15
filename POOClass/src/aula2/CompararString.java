package aula2;

/**
 *
 * @author yuri
 */
public class CompararString {

    public static void main(String[] args) {

        String nome1 = "Yuri";
        String nome2 = "YURI";

        
        if (nome1.equals(nome2)) {
            System.out.println("O texto é exatamente igual.");
        } else if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("O texto é igual contendo capitalização diferente.");
        } else {
            System.out.println("Os nome são diferentes.");
        }
    }
}
