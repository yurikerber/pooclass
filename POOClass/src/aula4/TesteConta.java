package aula4;

import modelos.ContaBanco;

public class TesteConta {

    public static void main(String[] args) {

        ContaBanco objConta = new ContaBanco();
        ContaBanco objConta2 = new ContaBanco();

        //conta1
        objConta.setTitular("Yuri Kerber Fernandes");
        objConta.setConta("719900");
        objConta.setAgencia("7190");
        objConta.setSaldo(1700);
        objConta.setChequeEspecial(300);

        //conta2
        objConta2.setTitular("Juca Bala");
        objConta2.setConta("8182839");
        objConta2.setAgencia("7190");
        objConta2.setSaldo(2030.89);
        objConta2.setChequeEspecial(400);

        objConta.transferir(100, objConta2);

        System.out.println("");
        System.out.println(objConta);
        System.out.println("");
        System.out.println(objConta2);

        objConta.deposito(1000, true);
        System.out.println(objConta);

//        objConta.transferir(120, objConta2);
//
//        System.out.println("");
//        System.out.println(objConta);
//        System.out.println("");
//        System.out.println(objConta2);
//        System.out.println(objConta);
//        System.out.println(objConta2);
//        System.out.println("");
//
//        objConta.saque(1701);
//
//        System.out.println(objConta);
//        System.out.println(objConta2);
//        System.out.println("");
//
//        objConta.deposito(10000);
//        
//        System.out.println(objConta);
//        System.out.println(objConta2);
        System.exit(0);
    }

}
