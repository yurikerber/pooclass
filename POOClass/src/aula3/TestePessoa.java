package aula3;

import ferramentas.Entrada;

public class TestePessoa {

    public static void main(String[] args) {

        Pessoa objPessoa1 = new Pessoa();

        objPessoa1.setNome(Entrada.leiaString("Digite o nome da pessoa"));
        objPessoa1.setIdade(Entrada.leiaInt("Digite a idade do(a) " + objPessoa1.getNome()));
        objPessoa1.setAltura(Entrada.leiaDouble("Altura do(a) " + objPessoa1.getNome()));
        objPessoa1.setPeso(Entrada.leiaDouble("Peso do(a) " + objPessoa1.getNome()));

        Pessoa objPessoa2 = new Pessoa();

        objPessoa2.setNome(Entrada.leiaString("Digite o nome da pessoa"));
        objPessoa2.setIdade(Entrada.leiaInt("Digite a idade do(a) " + objPessoa2.getNome()));
        objPessoa2.setAltura(Entrada.leiaDouble("Altura do(a) " + objPessoa2.getNome()));
        objPessoa2.setPeso(Entrada.leiaDouble("Peso do(a) " + objPessoa2.getNome()));

        System.out.println(".: Pessoa 1 :.");
        System.out.println(objPessoa1.toString());
        System.out.println(".: Pessoa 2 :.");
        System.out.println(objPessoa2.toString());

        compararNomes(objPessoa1, objPessoa2);
        compararLetrasNomes(objPessoa1, objPessoa2);

        System.exit(0);
    }

    public static void compararNomes(Pessoa p1, Pessoa p2) {
        if (p1.getNome().equals(p2.getNome())) {
            System.out.println("Os nomes são exatamente iguais.");
        }
    }

    public static void compararLetrasNomes(Pessoa p1, Pessoa p2) {
        if (p1.getNome().length() > p2.getNome().length()) {
            System.out.println("A pessoa 1 tem o nome maior.");
        } else if (p2.getNome().length() > p1.getNome().length()) {
            System.out.println("A pessoa 2 tem o nome maior.");
        } else {
            System.out.println("Os dois nomes tem a mesma quantidade de caracteres.");
        }
    }
}
