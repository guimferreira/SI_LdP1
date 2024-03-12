import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scnumber = new Scanner(System.in);
        Scanner scstring = new Scanner(System.in);
        SistemaBancario sb = new SistemaBancario();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        int tipoConta;
        int opCorrente;
        int opPoupanca;
        String repetir;

        System.out.println("NOME DO TITULAR:");
        sb.setTitular(scstring.nextLine());

        System.out.println("Olá, " + sb.getTitular());
        System.out.printf("Seu saldo inicial é R$%.2f%n", sb.getSaldo());

        do {
        System.out.println("Digite:\n[1] Conta Corrente\n[2] Conta Poupança");
        tipoConta = scnumber.nextInt();

            switch (tipoConta) {
                case 1: // Conta Corrente
                    System.out.println("Digite o código da operação:\n[1] Depositar\n[2] Sacar\n[3] Usar cheuqe especial\n[4] Exibir dados da conta");
                    opCorrente = scnumber.nextInt();
                    switch (opCorrente) {
                        case 1: // Depositar conta corrente
                            System.out.print("DIGITE O VALOR DO DEPÓSITO: R$");
                            cc.setDeposito(scnumber.nextDouble());
                            cc.depositar();
                            break;
                        case 2: // Sacar conta corrente
                            System.out.print("DIGITE O VALOR DO SAQUE: R$");
                            cc.setSaque(scnumber.nextDouble());
                            cc.sacar();
                            break;
                        case 3: // Usar cheque especial
                            System.out.print("DIGITE O VALOR DO SAQUE COM CHEQUE ESPECIAL: R$");
                            cc.setSaqueChequeEspecial(scnumber.nextDouble());
                            cc.usarChequeEspecial();
                            break;
                        case 4: // Exibir dados da conta
                            System.out.println("TITULAR: " + sb.getTitular());
                            System.out.printf("SALDO DA CONTA: R$%.2f%n", cc.getSaldo());
                            System.out.printf("SALDO DO CHEQUE ESPECIAL: R$%.2f%n", cc.getSaldoChequeEspecial());
                            break;
                        default:
                            System.out.println("OPÇÃO INVÁLIDA");
                            break;
                    }
                    break;
                case 2: // Conta Poupança
                    System.out.println("Digite o código da operação:\n[1] Depositar\n[2] Sacar\n[3] Calcular rendimento\n[4] Exibir dados da conta");
                    opPoupanca = scnumber.nextInt();
                    switch (opPoupanca) {
                        case 1: // Depositar conta poupança
                            System.out.print("DIGITE O VALOR DO DEPÓSITO: R$");
                            cp.setDeposito(scnumber.nextDouble());
                            cp.depositar();
                            break;
                        case 2: // Sacar conta poupança
                            System.out.print("DIGITE O VALOR DO SAQUE: R$");
                            cp.setSaque(scnumber.nextDouble());
                            cp.sacar();
                            break;
                        case 3: // Calcular rendimento
                            System.out.print("DIGITE O VALOR DA SELIC (%):");
                            cp.setSelic(scnumber.nextDouble());
                            cp.calcularRendimento();
                            break;
                        case 4: // Exibir dados da conta
                            System.out.println("TITULAR: " + sb.getTitular());
                            System.out.printf("SALDO DA POUPANÇA: R$%.2f%n", cp.getSaldo());
                            System.out.printf("RENDIMENTO DO MÊS: R$%.2f%n", cp.getRendimento());
                            break;
                        default:
                            System.out.println("OPÇÃO INVÁLIDA");
                            break;
                    }
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
            System.out.println("\nDeseja repetir a operação? [S/N]");
            repetir = scstring.nextLine();
        } while(repetir.equalsIgnoreCase("S"));
    }
}