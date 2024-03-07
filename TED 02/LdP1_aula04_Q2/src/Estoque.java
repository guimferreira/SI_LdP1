public class Estoque {

    private double estoqueAtual;
    private double estoqueMax;
    private double estoqueMin;


    public void setEstoqueAtual(double estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public void setEstoqueMax(double estoqueMax) {
        this.estoqueMax = estoqueMax;
    }

    public void setEstoqueMin(double estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    public void calculoEstoque() {
        double estoqueMed;
        if (estoqueMin < estoqueMax) {
            estoqueMed = (estoqueMax + estoqueMin) / 2;
            System.out.println("Estoque atual: " + estoqueAtual);
            System.out.println("Estoque médio: " + estoqueMed);
            if (estoqueAtual > estoqueMed || estoqueAtual == estoqueMed) {
                System.out.println("Não efetuar compra.");
            } else {
                System.out.println("Efetuar compra");
            }
        } else {
            System.out.println("Estoque mínimo não pode ser maior que o estoque máximo");
        }
    }

}
