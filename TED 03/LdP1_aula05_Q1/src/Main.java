import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scs = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();
        Diretor diretor = new Diretor();

        int opcao;
        String repetir;

        do {
            System.out.println("Escolha o cargo do funcionário:");
            System.out.println("[ 1 ] FUNCIONÁRIO");
            System.out.println("[ 2 ] GERENTE");
            System.out.println("[ 3 ] DIRETOR");
            opcao = scn.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do FUNCINÁRIO :");
                    funcionario.setNome(scs.nextLine());
                    System.out.print("Digite o salário do FUNCINÁRIO: R$");
                    funcionario.setSalario(scn.nextDouble());

                    System.out.println();
                    funcionario.exibir();
                    break;

                case 2:
                    System.out.print("Digite o nome do GERENTE :");
                    gerente.setNome(scs.nextLine());
                    System.out.print("Digite o salário do GERENTE: R$");
                    gerente.setSalario(scn.nextDouble());
                    System.out.print("Digite o departamento do GERENTE: ");
                    gerente.setDepartamento(scs.nextLine());

                    System.out.println();
                    gerente.exibirGerente();
                    break;

                case 3:
                    System.out.print("Digite o nome do DIRETOR: ");
                    diretor.setNome(scs.nextLine());
                    System.out.print("Digite o salário do DIRETOR: R$");
                    diretor.setSalario(scn.nextDouble());
                    System.out.print("Digite a quantidade de ações do DIRETOR: ");
                    diretor.setAcoes(scn.nextInt());

                    System.out.println();
                    diretor.exibirDiretor();
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
            System.out.println();
            System.out.print("DESEJA ADICIONAR OUTRO FUNCIONÁRIO [S/N]? ");
            repetir = scs.nextLine();
        } while(repetir.equalsIgnoreCase("S"));
    }
}