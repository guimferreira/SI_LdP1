import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        Produto produto = new Produto();
        Televisao tv = new Televisao();
        Smartphone phone = new Smartphone();

        int selecaoProduto, entradaSaida, quantidadeVenda;
        String repetir;

        do {
            System.out.println("DIGITE O CÓDIGO DO PRODUTO:");
            System.out.println("[ 1 ] TELEVISÃO");
            System.out.println("[ 2 ] SMARTPHONE");
            selecaoProduto = scn.nextInt();

            switch (selecaoProduto) {
                case 1:
                    produto.tipoDeRegistro();
                    entradaSaida = scn.nextInt();

                    switch (entradaSaida) {
                        case 1:
                            System.out.print("Nome do produto: ");
                            tv.setNome(scs.nextLine());
                            System.out.print("Quantidade no estoque: ");
                            tv.setEstoque(scn.nextInt());
                            System.out.print("Preço unitário do produto: ");
                            tv.setPreco(scn.nextDouble());
                            break;

                        case 2:
                            System.out.println("Produto disponível: " + tv.getNome());
                            System.out.printf("Preço do produto - R$%.2f%n", tv.getPreco());
                            System.out.println("Quantidade em estque: " + tv.getEstoque() + " unidades\n");

                            System.out.println("Deseja comprar quantas unidades?");
                            quantidadeVenda = scn.nextInt();
                            if (quantidadeVenda < tv.estoque || quantidadeVenda == tv.estoque) {
                                System.out.printf("VALOR DA COMPRA: R$%.2f%n", (quantidadeVenda * tv.preco));
                                tv.setEstoque(tv.estoque - quantidadeVenda);
                            } else {
                                System.out.println("QUANTIDADE INDISPONÍVEL.");
                            }
                    }

                    case 2:
                    produto.tipoDeRegistro();
                    entradaSaida = scn.nextInt();

                    switch (entradaSaida) {
                        case 1:
                            System.out.print("Nome do produto: ");
                            phone.setNome(scs.nextLine());
                            System.out.print("Quantidade no estoque: ");
                            phone.setEstoque(scn.nextInt());
                            System.out.print("Preço unitário do produto: ");
                            phone.setPreco(scn.nextDouble());
                            break;

                        case 2:
                            System.out.println("Produto disponível: " + phone.getNome());
                            System.out.printf("Preço do produto - R$%.2f%n", phone.getPreco());
                            System.out.println("Quantidade em estque: " + phone.getEstoque() + " unidades\n");

                            System.out.println("Deseja comprar quantas unidades?");
                            quantidadeVenda = scn.nextInt();
                            if (quantidadeVenda < phone.estoque || quantidadeVenda == phone.estoque) {
                                System.out.printf("VALOR DA COMPRA: R$%.2f%n", (quantidadeVenda * phone.preco));
                                phone.setEstoque(tv.estoque - quantidadeVenda);
                            } else {
                                System.out.println("QUANTIDADE INDISPONÍVEL.");
                            }
                    }

            }

            System.out.println("\nDeseja cadastrar outra operação? [S/N]");
            repetir = scs.nextLine();
        } while(repetir.equalsIgnoreCase("S"));
    }
}