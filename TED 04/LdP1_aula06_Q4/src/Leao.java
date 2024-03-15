public class Leao extends Animal {
    private String detalhe;

    public Leao(String classe, String locomocao, String detalhe) {
        super(classe, locomocao);
        this.detalhe = detalhe;
    }

    public void exibirInformacoes() {
        System.out.println(classe);
        System.out.println(locomocao);
        System.out.println(detalhe);
    }
}
