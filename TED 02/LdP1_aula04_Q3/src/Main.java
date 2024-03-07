import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Triangulo tri = new Triangulo();

        System.out.println("Digite o 1º lado:");
        tri.setLado1(sc.nextDouble());
        System.out.println("Digite o 2º lado:");
        tri.setLado2(sc.nextDouble());
        System.out.println("Digite o 3º lado:");
        tri.setLado3(sc.nextDouble());

        tri.verificacao();

        if (tri.getX() == 1) {
            System.out.println("Lado 1" + tri.getLado1());
            System.out.println("Lado 2" + tri.getLado2());
            System.out.println("Lado 3" + tri.getLado3());
            tri.tipoTriangulo();
        }
    }
}