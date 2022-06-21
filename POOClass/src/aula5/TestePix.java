package aula5;

import ferramentas.Entrada;
import modelos.ContaBanco;

public class TestePix {

    static ContaBanco vetContas[] = new ContaBanco[5];

    public static void main(String[] args) {

        ContaBanco objConta1 = new ContaBanco("xx", "111", "Yuri Kerber", 1800, 300, "11");
        vetContas[0] = objConta1;
        ContaBanco objConta2 = new ContaBanco("xx", "222", "Juca Bala", 2600, 300, "22");
        vetContas[1] = objConta2;
        ContaBanco objConta3 = new ContaBanco("xx", "333", "Jonas Dhein", 1200, 300, "33");
        vetContas[2] = objConta3;
        ContaBanco objConta4 = new ContaBanco("xx", "444", "Luciano", 300, 300, "44");
        vetContas[3] = objConta4;
        ContaBanco objConta5 = new ContaBanco("xx", "555", "Mariana", 403.50, 300, "55");
        vetContas[4] = objConta5;

        String contaOrigem = Entrada.leiaString("Digite a conta origem:");
        String contaDestino = Entrada.leiaString("Digite a chave PIX da conta para tranferir:");
        Double valorPix = Entrada.leiaDouble("Digite o valor:");

        ContaBanco objContaOrigem = localizarContaOrigem(contaOrigem);
        ContaBanco objContaDestino = localizarChavePix(contaDestino);

        objContaOrigem.transferirPix(objContaDestino, valorPix);

        System.out.println(objContaOrigem);
        System.out.println(objContaDestino);

        System.exit(0);
    }

    private static ContaBanco localizarContaOrigem(String contaOri) {
        for (int i = 0; i < vetContas.length; i++) {
	  if (vetContas[i].getConta().equals(contaOri)) {
	      return vetContas[i];
	  }
        }
        return null;
    }

    private static ContaBanco localizarChavePix(String contaDest) {
        for (int i = 0; i < vetContas.length; i++) {
	  if (vetContas[i].getChavePix().equals(contaDest)) {
	      return vetContas[i];
	  }
        }
        return null;
    }

}
