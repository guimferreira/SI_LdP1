import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Funcionario func = new Funcionario();
        CalculadoraInss inss = new CalculadoraInss();
        Scanner scn = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        System.out.print("Matrícula do funcionário: ");
        func.mat = scs.nextLine();
        System.out.print("Nome do funcionário: ");
        func.nome = scs.nextLine();
        System.out.print("Salário bruto do funcionário: ");
        func.salarioBruto = scn.nextInt();

        System.out.println();
        System.out.println("Matricula: " + func.mat);
        System.out.println("Nome completo: " + func.nome);
        System.out.println("Salário Bruto: R$" + func.salarioBruto);
        inss.inss(func.salarioBruto);

    }
}