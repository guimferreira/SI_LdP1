public class Produto {
    protected String nome;
    protected int estoque;
    protected double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void tipoDeRegistro() {
        System.out.println("DIGITE O CÓDIGO DA OPERAÇÃO:");
        System.out.println("[1] ADICIONAR ESTOQUE");
        System.out.println("[2] REGISTRAR VENDA");
    }

    public void exibirDisponivel() {
        System.out.println("Produto disponível: " + nome);
        System.out.println("Preço do produto - R$%.2f" + preco);
        System.out.println("Quantidade em estque: " + estoque + " unidades");
    }
}
