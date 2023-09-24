package primeira.pagamentos;

import primeira.cliente.ClienteCartao;

import java.util.Scanner;

public class CartaoCredito implements FormaDePagamento{

    private ClienteCartao[] clienteCartaos = new ClienteCartao[]{
            new ClienteCartao("aaaa", "bbbb"),
            new ClienteCartao("cccc", "dddd")
    };

    @Override
    public boolean autenticar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha do cartão: ");
        String senha = scanner.nextLine();

        System.out.print("Digite o código de segurança: ");
        String codigoSeguranca = scanner.nextLine();

        for (ClienteCartao clienteCartao : clienteCartaos) {
            if (senha.equals(clienteCartao.getSenha()) && codigoSeguranca.equals(clienteCartao.getCodigoSeguranca()))
                return true;
        }
        return false;
    }

    @Override
    public void processarPagamento(double valor) {
        if (autenticar())
            System.out.println("Pagamento com cartão de crédito no valor de " + valor +" processado com sucesso");
         else
            throw new RuntimeException("Pagamento não autorizado");
    }
}
