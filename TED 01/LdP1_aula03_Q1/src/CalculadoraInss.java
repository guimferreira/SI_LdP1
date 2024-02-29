public class CalculadoraInss {

    double inss;
    double salarioLiq;

    public void inss(double x) {
        inss = 0.15 * x;
        salarioLiq = x - inss;
        System.out.println("Dedução INSS: R$" + inss);
        System.out.println("Salário líquido: R$" + salarioLiq);
    }

}
