package primeira;

import primeira.pagamentos.BoletoBancario;
import primeira.pagamentos.CartaoCredito;
import primeira.pagamentos.PayPal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - cartão de crédito");
        System.out.println("2 - boleto bancário");
        System.out.println("3 - PayPal");
        System.out.println("Escolha a forma de pagamento pelo número: ");
        int input = scanner.nextInt();

        switch (input) {
            case 1 -> {
                CartaoCredito cartaoCredito = new CartaoCredito();
                cartaoCredito.processarPagamento(30);
            }
            case 2 -> {
                BoletoBancario boletoBancario = new BoletoBancario();
                boletoBancario.processarPagamento(40);
            }
            case 3 -> {
                PayPal payPal = new PayPal();
                payPal.processarPagamento(50);
            }
            default -> throw new InputMismatchException("escolha inválida");
        }
    }
}