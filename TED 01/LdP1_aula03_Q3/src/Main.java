import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);

        int operacao, rep;
        double n1, n2;

        do {
            System.out.println("""
                DIGITE:
                [1] Soma
                [2] Subtração
                [3] Divisão
                [4] Mutiplicação
                """);
            operacao = sc.nextInt();
            switch (operacao) {
                case 1:
                    System.out.print("Número 1: ");
                    n1 = sc.nextInt();
                    System.out.print("Número 2: ");
                    n2 = sc.nextInt();
                    System.out.println(c.somar(n1, n2));
                    break;
                case 2:
                    System.out.print("Número 1: ");
                    n1 = sc.nextInt();
                    System.out.print("Número 2: ");
                    n2 = sc.nextInt();
                    System.out.println(c.subtracao(n1, n2));
                    break;
                case 3:
                    System.out.print("Dividendo: ");
                    n1 = sc.nextInt();
                    System.out.print("Divisor: ");
                    n2 = sc.nextInt();
                    System.out.println(c.divi(n1, n2));
                    break;
                case 4:
                    System.out.print("Número 1: ");
                    n1 = sc.nextInt();
                    System.out.print("Número 2: ");
                    n2 = sc.nextInt();
                    System.out.println(c.multip(n1, n2));
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println("Deseja repetir alguma operação? [SIM digite 0]");
            rep = sc.nextInt();
        } while(rep == 0);
    }
}