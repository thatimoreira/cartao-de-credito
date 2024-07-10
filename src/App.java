import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor do limie do cartão: R$");
        double limiteCartao = teclado.nextDouble();

        System.out.printf("Limite cartão: R$%.2f\n", limiteCartao);

        teclado.close();
    }
}
