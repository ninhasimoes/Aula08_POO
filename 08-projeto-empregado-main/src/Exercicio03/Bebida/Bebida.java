package Exercicio03.Bebida;

import Exercicio03.ItemCardapio.ItemCardapio;

public class Bebida extends ItemCardapio {
    private boolean alcoolica;

    public Bebida(String nome, double precoBase, boolean alcoolica) {
        super(nome, precoBase);
        this.alcoolica = alcoolica;
    }

    @Override
    public double calcularValor() {
        return alcoolica ? precoBase * 1.20 : precoBase;
    }
}
