package Exercicio02.Conta;

public abstract class Conta {
    protected int numero;
    protected double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar (double valor){
        saldo +=valor;
    }
    public double getSaldoDisponivel(){
        return saldo;
    }

}
