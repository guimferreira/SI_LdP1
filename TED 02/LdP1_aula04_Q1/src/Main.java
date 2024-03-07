import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String repetir;

        Scanner sc = new Scanner(System.in);
        CalculadoraOferta co = new CalculadoraOferta();

        do {
            System.out.println("Digite a quantidade de maçãs:");
            co.setQuantidade(sc.nextInt());

            co.calcularPreco();

            System.out.println("Deseja realizar uma nova compra? [S/N]");
            repetir = sc.next();
        } while (repetir.equalsIgnoreCase("S"));

    }
}