public class RepositorioContasArray implements RepositorioContas {
    private ContaAbstrata[] contas;
    private int indice;

    public RepositorioContasArray() {
        contas = new ContaAbstrata[10];
        indice = 0;
    }

    public void inserir(ContaAbstrata conta) {
        contas[indice] = conta;
        indice = indice + 1;
    }

    public ContaAbstrata procurar(String numero) {
        int i = 0;
        boolean achou = false;
        ContaAbstrata resposta = null;
        while ((!achou) && (i < indice)) {
            if (contas[i].getNumero().equals(numero)) {
                achou = true;
                resposta = contas[i];
            } else {
                i = i + 1;
            }
        }
        if (!achou)
            throw new RuntimeException("Não achou");
        return resposta;
    }

    public void remover(String numero) {
        int i = 0;
        boolean achou = false;
        while ((!achou) && (i < indice)) {
            if (contas[i].getNumero().equals(numero)) {
                achou = true;
                contas[i] = contas[indice - 1];
                contas[indice - 1] = null;
                indice = indice - 1;
            } else {
                i = i + 1;
            }
        }
        if (!achou)
            throw new RuntimeException("Não achou");
    }

    public void atualizar(ContaAbstrata conta) {
        int i = 0;
        boolean achou = false;
        while ((!achou) && (i < indice)) {
            if (contas[i].getNumero().equals(conta.getNumero())) {
                achou = true;
                contas[i] = conta;
            } else {
                i = i + 1;
            }
        }
        if (!achou)
            throw new RuntimeException("Não achou");
    }

    public boolean existe(String numero) {
        int i = 0;
        boolean achou = false;
        while ((!achou) && (i < indice)) {
            if (contas[i].getNumero().equals(numero)) {
                achou = true;
            } else {
                i = i + 1;
            }
        }
        return achou;
    }
}