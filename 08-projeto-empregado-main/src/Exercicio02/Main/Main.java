package Exercicio02.Main;

import Exercicio02.Conta.Conta;
import Exercicio02.ContaCorrente.ContaCorrente;
import Exercicio02.ContaPoupanca.ContaPoupanca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conta>c=new ArrayList<>();

        c.add(new ContaCorrente(1,200,500));
        c.add(new ContaPoupanca(2,12000,0.03));

        for (Conta i: c){
            i.depositar(100);
            System.out.println(i);
            System.out.println("Saldo Disponivel: "+i.getSaldoDisponivel());
            if (i instanceof ContaPoupanca){
                ((ContaPoupanca) i).aplicarRendimento();
                System.out.println("Rendimento aplicado! Novo saldo: " + i.getSaldoDisponivel());
            }

        }


    }
}
