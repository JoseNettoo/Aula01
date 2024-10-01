import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto(1, "Camisa", 100.00, 10);

        System.out.println("Digite a quantidade para vender: ");
        int quantidadeVendida = scanner.nextInt();

        System.out.println("Forma de pagamento (Pix, Espécie, Débito, Crédito): ");
        String formaPagamento = scanner.next();

        double valorTotal = produto.valor * quantidadeVendida;

        if (formaPagamento.equalsIgnoreCase("Pix") || formaPagamento.equalsIgnoreCase("Espécie")
                || formaPagamento.equalsIgnoreCase("Débito")) {
            valorTotal *= 0.95;
        }

        produto.vender(quantidadeVendida);

        System.out.println("Valor total: R$" + valorTotal);

        if (formaPagamento.equalsIgnoreCase("Espécie")) {
            System.out.println("Digite o valor pago: ");
            double valorPago = scanner.nextDouble();
            double troco = valorPago - valorTotal;
            System.out.println("Troco: R$" + troco);
        }

        scanner.close();
    }




























































}