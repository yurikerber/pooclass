package aula3;

public class Pessoa {

    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {

        StringBuilder retorno = new StringBuilder();

        retorno.append("Nome: ").append(this.nome);
        retorno.append("\nIdade: ").append(this.idade);
        retorno.append("\nAltura: ").append(this.altura);
        retorno.append("\nPeso: ").append(this.peso);

        return retorno.toString();
    }

}
