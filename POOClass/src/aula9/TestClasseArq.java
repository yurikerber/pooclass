package aula9;

import ferramentas.Arquivo;

public class TestClasseArq {

    public static void main(String[] args) {

        Arquivo objArquivo = new Arquivo("nomes.txt");
        objArquivo.abrirEscrita();
        objArquivo.escreverLinha("salve");
        objArquivo.escreverLinha("salve");
        objArquivo.escreverLinha("família");
        objArquivo.fecharArquivo();
        
        objArquivo.abrirLeitura();
        String linha;
        do {
            linha = objArquivo.lerLinha();
            if ((linha != null)) {
                System.out.println(linha);
            }
        } while (linha != null);
        objArquivo.fecharArquivo();

        System.exit(0);
    }
}
