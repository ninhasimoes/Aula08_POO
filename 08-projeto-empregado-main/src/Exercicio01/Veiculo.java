package Exercicio01;

public abstract class Veiculo {
    protected String placa;
    protected String marca;

    public Veiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
