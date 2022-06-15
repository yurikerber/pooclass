package modelos;

/**
 *
 * @author yuri
 */
public class Aluno {

    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void fazAniversario() {
        idade++;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura + ", Peso: " + peso);
    }
}
