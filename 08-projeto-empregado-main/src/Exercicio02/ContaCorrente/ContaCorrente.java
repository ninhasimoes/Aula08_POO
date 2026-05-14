package Exercicio02.ContaCorrente;

import Exercicio02.Conta.Conta;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    @Override
    public double getSaldoDisponivel() {
        return super.getSaldoDisponivel() + limite;
    }

    @Override
    public String toString() {
        return super.toString()+ " |Limite: R$ " + limite + "|";
}
    }
