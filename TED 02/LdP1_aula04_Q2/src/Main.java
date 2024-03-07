import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String repetir;
        Scanner sc = new Scanner(System.in);
        Estoque estoque = new Estoque();

            do {
                System.out.println("Qual o estoque atual?");
                estoque.setEstoqueAtual(sc.nextInt());

                System.out.println("Qual o estoque máximo?");
                estoque.setEstoqueMax(sc.nextInt());

                System.out.println("Qual o estoque mínimo?");
                estoque.setEstoqueMin(sc.nextInt());

                estoque.calculoEstoque();

                System.out.println("Deseja realizar uma nova compra? [S/N]");
                repetir = sc.next();
            } while (repetir.equalsIgnoreCase("S"));
    }
}