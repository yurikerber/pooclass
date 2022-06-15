package modelos;

/**
 *
 * @author yuri
 */
public class Carro {

    private String numer_chassi;
    private String cor;
    private Modelo modelo;
    private int ano_modelo;
    private int ano_fabricacao;

    public Carro() {

    }

    public Carro(String numer_chassi, String cor, Modelo modelo, int ano_modelo, int ano_fabricacao) {
        this.numer_chassi = numer_chassi;
        this.cor = cor;
        this.modelo = modelo;
        this.ano_modelo = ano_modelo;
        this.ano_fabricacao = ano_fabricacao;
    }

    public String getNumer_chassi() {
        return numer_chassi;
    }

    public void setNumer_chassi(String numer_chassi) {
        this.numer_chassi = numer_chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
//    public String getMarca() {
//        return marca;
//    }
//
//    public void setMarca(String marca) {
//        this.marca = marca;
//    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public int getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(int ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public int getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    @Override
    public String toString() {

        StringBuilder retorno = new StringBuilder();
        retorno.append("Chassi: ").append(this.numer_chassi);
        retorno.append("\nCor: ").append(this.cor);
        retorno.append(this.modelo);
        retorno.append("\nAno modelo: ").append(this.ano_modelo);
        retorno.append("\nAno Fabricação: ").append(ano_fabricacao);

        return retorno.toString();
    }
}
