package Exemplo01;

public class EmpregadoComissionado extends Empregado {
    double totalDeVendas;
    double comissao;

    public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
        super(matricula, nome);
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }

    public double calcularSalario() {
        return totalDeVendas * comissao / 100;
    }

    @Override //neste ponto nos estamos sob-escrevendo um metodo
    public String toString() {
        return "Exemplo01.EmpregadoComissionado{" +
                "totalDeVendas=" + totalDeVendas +
                ", comissao=" + comissao +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}
