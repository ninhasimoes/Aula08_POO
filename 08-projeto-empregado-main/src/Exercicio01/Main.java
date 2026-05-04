package Exercicio01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<>();

        lista.add(new Carro("CTR5SK6","TOYOTA",4));
        lista.add(new Carro("PLT5ZG4","JAGUAR",2));
        lista.add(new Moto("HJR8AI9","HYUNDAI",4));

        for (Veiculo e : lista){
            System.out.println(e);
        }
    }
}
