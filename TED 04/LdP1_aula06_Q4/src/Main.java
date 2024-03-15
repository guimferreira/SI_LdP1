import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Leao leao = new Leao("Mamífero", "Patas", "Juba");
        Arara arara = new Arara();

        System.out.print("Digite a CLASSE da Arara: ");
        arara.setClasse(sc.nextLine());
        System.out.print("Digite a forma de LOCOMOÇÃO da Arara: ");
        arara.setLocomocao(sc.nextLine());
        System.out.print("Digite a QUANTIDADE DE OVOS da Arara: ");
        arara.setQtdeOvos(sc.nextLine());

        System.out.println("Informações do Leao:");
        leao.exibirInformacoes();
        System.out.println();
        System.out.println("Informações da Arara:");
        System.out.println(arara.getClasse());
        System.out.println(arara.getLocomocao());
        System.out.println(arara.getQtdeOvos());
    }
}
