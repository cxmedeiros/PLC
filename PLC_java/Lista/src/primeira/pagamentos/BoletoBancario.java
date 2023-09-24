package primeira.pagamentos;

import primeira.cliente.ClienteBoleto;

import java.util.Scanner;

public class BoletoBancario implements FormaDePagamento{

    private ClienteBoleto[] clienteBoletos = new ClienteBoleto[]{
            new ClienteBoleto("aaaa"),
            new ClienteBoleto("cccc")
    };

    @Override
    public boolean autenticar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do boleto bancário: ");
        String codigo = scanner.nextLine();

        for (ClienteBoleto clienteBoleto : clienteBoletos) {
            if (codigo.equals(clienteBoleto.getCodigo()))
                return true;
        }
        return false;
    }

    @Override
    public void processarPagamento(double valor) {
        if (autenticar())
            System.out.println("Pagamento com boleto bancário no valor de " + valor +" processado com sucesso");
        else
            throw new RuntimeException("Pagamento não autorizado");
    }
}
