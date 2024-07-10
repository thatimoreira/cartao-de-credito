import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nInforme o valor do limite do cartão: R$");
        double limiteCartao = teclado.nextDouble();

        CartaoDeCredito cartao = new CartaoDeCredito(limiteCartao);

        int sair = 1;
        while (sair != 0) {
            System.out.print("\nDescrição da compra: ");
            String descricao = teclado.next();

            System.out.print("Valor da compra: R$");
            double valor = teclado.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso!\n");
                System.out.println("Escolha uma das opções:");
                System.out.println("SAIR - 0");
                System.out.println("CONTINUAR - 1");
                sair = teclado.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("\n\n************* COMPRAS REALIZADAS *************\n");
        for (Compra c: cartao.getCompras()) {
            System.out.println(c.getDescricao() + "........... R$" + c.getValor());
        }

        System.out.printf("\nSALDO ATUAL: R$%.2f\n\n", cartao.getSaldo());

        teclado.close();
    }
}
