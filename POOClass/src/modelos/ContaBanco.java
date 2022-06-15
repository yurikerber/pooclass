package modelos;

public class ContaBanco {

    private String agencia;
    private String conta;
    private String titular;
    private double saldo;

    public ContaBanco() {
    }

    public ContaBanco(String agencia, String conta, String titular, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {

        StringBuilder retorno = new StringBuilder();

        retorno.append("Titular: ").append(this.titular);
        retorno.append("\nAgência: ").append(this.agencia);
        retorno.append("\nNúmero da conta: ").append(this.conta);
        retorno.append("\nSaldo: R$").append(this.saldo);

        return retorno.toString();
    }

    public void saque(double saque) {
        System.out.println("Sacando: R$" + saque + "\n");

        if (saque > this.saldo) {
            System.out.println("Erro, valor de saque superior ao saldo!\n");
        } else {
            this.saldo -= saque;
            System.out.println("Foi sacado: R$" + saque + "\n");
        }
    }

    public void deposito(double deposito) {
        System.out.println("Depositando: R$" + deposito + "\n");

        this.saldo += deposito;
        System.out.println("Foi depositado: R$" + deposito + "\n");
    }

    public void transferir(double valorTrans, ContaBanco contaRecebe) {
        if (valorTrans < this.saldo) {
            this.saldo -= valorTrans;
            contaRecebe.saldo += valorTrans;
            System.out.println("\nTranferido com sucesso: R$ " + valorTrans);
        } else {
            System.out.println("Erro na transferencia\n");
        }
    }

}
