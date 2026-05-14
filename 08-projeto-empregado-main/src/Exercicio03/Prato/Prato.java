package Exercicio03.Prato;

import Exercicio03.ItemCardapio.ItemCardapio;

public class Prato extends ItemCardapio {
    public Prato(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularValor() {
        return precoBase*1.10;
    }

}
