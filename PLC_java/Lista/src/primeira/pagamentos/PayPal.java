package primeira.pagamentos;

import primeira.cliente.ClientePayPal;
import primeira.pagamentos.FormaDePagamento;

import java.util.Scanner;

public class PayPal implements FormaDePagamento {

    private ClientePayPal[] clientePayPals = new ClientePayPal[]{
            new ClientePayPal("aaaa", "bbbb"),
            new ClientePayPal("cccc", "dddd")
    };

    @Override
    public boolean autenticar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o login: ");
        String login = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        for (ClientePayPal clientePayPal : clientePayPals) {
            if (login.equals(clientePayPal.getLogin()) && senha.equals(clientePayPal.getSenha()))
                return true;
        }
        return false;
    }

    @Override
    public void processarPagamento(double valor) {
        if (autenticar())
            System.out.println("Pagamento com PayPal no valor de " + valor +" processado com sucesso");
        else
            throw new RuntimeException("Pagamento não autorizado");
    }
}
