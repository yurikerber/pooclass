package aula4;

import modelos.ContaBanco;

public class TesteConta {

    public static void main(String[] args) {

        ContaBanco vetContas[] = new ContaBanco[5];

        ContaBanco objConta1 = new ContaBanco("7190", "13141516", "Yuri Kerber", 1800, 300, "51999999999");
        vetContas[0] = objConta1;
        ContaBanco objConta2 = new ContaBanco("7190", "14131218", "Juca Bala", 2600, 300, "519888888");
        vetContas[1] = objConta2;
        ContaBanco objConta3 = new ContaBanco("7190", "18191715", "Jonas Dhein", 1200, 300, "519777777");
        vetContas[2] = objConta3;
        ContaBanco objConta4 = new ContaBanco("7190", "14121514", "Luciano", 300, 300, "51966666666");
        vetContas[3] = objConta4;
        ContaBanco objConta5 = new ContaBanco("7190", "13161918", "Mariana", 403.50, 300, "519555555");
        vetContas[4] = objConta5;

        objConta1.transferenciaPix("519555555", 400, vetContas);
        objConta2.transferenciaPix("51966666666", 100, vetContas);

        System.out.println(objConta2);
        System.out.println(objConta4);
        
        System.exit(0);
    }

}
