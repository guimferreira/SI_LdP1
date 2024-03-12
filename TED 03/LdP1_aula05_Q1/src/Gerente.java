public class Gerente extends Funcionario {

    private String departamento;

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double calcularBonus() {
        return 0.1 * salario;
    }

    public void exibirGerente() {
        super.exibir();
        System.out.println("DEPARTAMENTO: " + departamento);
        System.out.printf("Bonificação de GERENTE: R$%.2f%n", calcularBonus());
    }
}
