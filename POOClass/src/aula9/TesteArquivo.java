package aula9;

import java.io.*;
import ferramentas.*;

public class TesteArquivo {

    public static void main(String[] args) {
        try {
            //Criar e registrar arquivo;
            FileWriter fileWriter = new FileWriter("nomes.txt");
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
            bufferWriter.write("VTF\n");
            bufferWriter.write("Marcolas\n");
            bufferWriter.write("PQP\n");
            bufferWriter.close();
            fileWriter.close();

            //Ler arquivo;
            FileReader fileReader = new FileReader("nomes.txt");
            BufferedReader bufferReader = new BufferedReader(fileReader);

            String linha;
            do {
                linha = bufferReader.readLine();
                if ((linha != null)) {
                    System.out.println(linha);
                }
            } while (linha != null);

        } catch (IOException ex) {
            Globais.exibirMensagem("Erro: " + ex.getMessage());
        }
        System.exit(0);
    }

}
