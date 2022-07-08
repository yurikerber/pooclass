package modelos;

public class Questionario {

    private String pergunta;
    private String respostaA;
    private String respostaB;
    private String respostaC;
    private char respostaCorreta;

    public Questionario() {
    }

    public Questionario(String pergunta, String respostaA, String respostaB, String respostaC, char respostaCorreta) {
        this.pergunta = pergunta;
        this.respostaA = respostaA;
        this.respostaB = respostaB;
        this.respostaC = respostaC;
        this.respostaCorreta = respostaCorreta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getRespostaA() {
        return respostaA;
    }

    public void setRespostaA(String respostaA) {
        this.respostaA = respostaA;
    }

    public String getRespostaB() {
        return respostaB;
    }

    public void setRespostaB(String respostaB) {
        this.respostaB = respostaB;
    }

    public String getRespostaC() {
        return respostaC;
    }

    public void setRespostaC(String respostaC) {
        this.respostaC = respostaC;
    }

    public char getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(char respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    @Override
    public String toString() {

        StringBuilder pergunta = new StringBuilder();

        pergunta.append(this.getPergunta());
        pergunta.append("\n [1] ").append(this.getRespostaA());
        pergunta.append("\n [2] ").append(this.getRespostaB());
        pergunta.append("\n [3] ").append(this.getRespostaC());

        return pergunta.toString();
    }

}
