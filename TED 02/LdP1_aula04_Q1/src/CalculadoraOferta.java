public class CalculadoraOferta {

    private int quantidade;
    private double preco;

    public void setQuantidade (int quantidade) {
        this.quantidade = quantidade;
    }

    public void calcularPreco() {
        if (quantidade > 0 && quantidade < 12) {
            preco = 1.3 * quantidade;
            System.out.printf("Total da compra: R$%.2f%n", preco);
        } else if (quantidade >= 12) {
            preco = 1 * quantidade;
            System.out.printf("Total da compra: R$%.2f%n", preco);
        } else {
            System.out.println("Digite uma quantidade maior que zero.");
        }
    }

    public double getPreco() {
        return preco;
    }

}
