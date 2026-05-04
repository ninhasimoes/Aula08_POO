package Exemplo01;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        //Quando n sabe a quant de dados fazemos um vetor dinamico
        //array redimensionavel
        ArrayList <Empregado> lista = new ArrayList<>();
        //com arraylist só se usa metodos, pois ele é um objeto
        //instanciando um objeto
        //overload - sobrecarga de metodos
        lista.add(new EmpregadoComissionado(1,"A",10,10));
        lista.add(new EmpregadoHorista(2,"B",10,10));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).nome);
            System.out.println(lista.get(i).matricula);
            System.out.println();
        }

        //funciona mais para array dinamica
        //for genérico
        for (Empregado e : lista){
            System.out.println(e);
            System.out.println(e.calcularSalario());
        }

    }
}
