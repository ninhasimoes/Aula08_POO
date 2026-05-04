package Exercicio01;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String placa, String marca, int cilindradas) {
        super(placa, marca);
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindradas=" + cilindradas +
                "\t"+super.toString();
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
