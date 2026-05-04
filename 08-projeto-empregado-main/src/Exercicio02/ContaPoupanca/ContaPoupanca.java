package Exercicio02.ContaPoupanca;

import Exercicio02.Conta.Conta;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(int numero, double saldo, double taxaRendimento) {
        super(numero, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double aplicarRendimento(){
        return saldo += saldo * taxaRendimento;
    }
}
