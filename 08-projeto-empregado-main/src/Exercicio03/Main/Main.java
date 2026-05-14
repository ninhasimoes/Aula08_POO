package Exercicio03.Main;

import Exercicio03.Bebida.Bebida;
import Exercicio03.ItemCardapio.ItemCardapio;
import Exercicio03.Prato.Prato;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    static DecimalFormat df = new DecimalFormat("R$0.00");
    public static void main(String[] args) {
        ArrayList<ItemCardapio> ic = new ArrayList<>();
        ic.add(new Prato("Parmegiana",45));
        ic.add(new Prato("Peixe frito",55));
        ic.add(new Bebida("Margarita",34,true));
        ic.add(new Bebida("Suco de Laranja",15,false));

        double total = 0;
        for (ItemCardapio i: ic){
            System.out.println("Nome: "+i.getNome());
            System.out.println("Valor calculado: "+df.format(i.calcularValor()));
            total += i.calcularValor();

        }
        System.out.println("Valor total: "+df.format(total));
    }
}
