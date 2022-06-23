package modelos;

public class ContaBanco {

    private String agencia;
    private String conta;
    private String titular;
    private double saldo;
    private double chequeEspecial;
    private String chavePix;

    public ContaBanco() {
    }

    public ContaBanco(String agencia, String conta, String titular, double saldo, double chequeEspecial, String chavePix) {
        this.agencia = agencia;
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
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

        retorno.append("  Conta: ").append(this.conta);

        return retorno.toString();
    }

    public boolean saque(double saque, boolean status) {
        if (saque > (this.saldo + this.chequeEspecial)) {
            if (status) {
                System.out.println("Erro, valor de saque superior ao saldo!\n");
            }
            return false;
        } else {
            this.saldo -= saque;
            if (status) {
                System.out.println("Foi sacado: R$" + saque + "\n");
            }
            return true;
        }
    }

    public void deposito(double deposito, boolean status) {
        if (status) {
            System.out.println("Depositando: R$" + deposito + "\n");
            System.out.println("Foi depositado: R$" + deposito + "\n");
        }
        this.saldo += deposito;
    }

    public void transferir(double valorTrans, ContaBanco contaRecebe) {
        if (saque(valorTrans, false)) {
            contaRecebe.deposito(valorTrans, false);
            System.out.println("\nTranferido com sucesso: R$ " + valorTrans);
            System.out.println("--------------------------------------");
        } else {
            System.out.println("Erro na transferencia\n");
        }
    }

    public void transferirPix(ContaBanco pix, double valor) {
        transferir(valor, pix);
    }

}
