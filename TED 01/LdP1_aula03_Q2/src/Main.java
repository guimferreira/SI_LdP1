import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Scanner scs = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);

        String rep;

        System.out.println("Bem-vindo a calculadora de média do aluno!");
        do {
            System.out.print("Insira a 1ª nota do aluno: ");
            aluno.n1 = scn.nextDouble();
            System.out.print("Insira a 2ª nota do aluno: ");
            aluno.n2 = scn.nextDouble();
            System.out.print("Insira a 3ª nota do aluno: ");
            aluno.n3 = scn.nextDouble();

            aluno.mediaCalc();
            if (aluno.media >= 70) {
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO");
            }

            System.out.print("Deseja inserir as notas de um outro aluno? (Digite 'S' para Sim ou 'N' para Não) ");
            rep = scs.nextLine();
        } while(rep.equalsIgnoreCase("S"));

        System.out.println("Obrigado por usar o programa!");
    }
}