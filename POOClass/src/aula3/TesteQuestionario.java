package aula3;

import modelos.Questionario;
import ferramentas.Entrada;

public class TesteQuestionario {

    public static void main(String[] args) {

        Questionario vetorQuestoes[] = new Questionario[3];

        Questionario objQuestionario = new Questionario();

        objQuestionario.setPergunta("De que cor é o céu?");
        objQuestionario.setRespostaA("Azul");
        objQuestionario.setRespostaB("Amarelo");
        objQuestionario.setRespostaC("Vermelho");
        objQuestionario.setRespostaCorreta('1');

        vetorQuestoes[0] = objQuestionario;


        Questionario objQuestionario2 = new Questionario();

        objQuestionario2.setPergunta("Raiz quadrada de 64?");
        objQuestionario2.setRespostaA("12");
        objQuestionario2.setRespostaB("6");
        objQuestionario2.setRespostaC("8");
        objQuestionario2.setRespostaCorreta('3');

        vetorQuestoes[1] = objQuestionario2;


        Questionario objQuestionario3 = new Questionario();

        objQuestionario3.setPergunta("Qual é o sentido da vida?");
        objQuestionario3.setRespostaA("trás");
        objQuestionario3.setRespostaB("42");
        objQuestionario3.setRespostaC("arriba");
        objQuestionario3.setRespostaCorreta('2');

        vetorQuestoes[2] = objQuestionario3;


        realizarQuestoes(vetorQuestoes);
        
        System.exit(0);
    }

    public static void realizarQuestoes(Questionario vQ[]) {
        char resposta;
        int acertos = 0;
        for (int i = 0; i < vQ.length; i++) {
            resposta = Entrada.leiaChar(vQ[i].toString());
            if (vQ[i].getRespostaCorreta() == resposta) {
                System.out.println("Resposta CORRETA!");
                acertos++;
            } else {
                System.out.println("Errou feio!");
            }
        }
        System.out.println("Pontuação: " + acertos * 10 + ""
                + "\nAcertos : " + acertos + "/" + vQ.length);
    }

}
