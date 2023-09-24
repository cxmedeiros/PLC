public class Banco {
    private Conta[] contas;
    private int indice;
    private PoupancaD[] poupancas;
    private int indiceP;

    public Banco() {
       contas = new Conta [10];
       indice = 0;
    }

    public void ca1dastrarConta(Cconta c) {
       contas[indice] = c;
       indice++;
    }

    public void cadastrarPoupanca(PoupancaD p) {}

    public void creditarPoupanca(String numero,double valor) {}

    public Conta procurarConta (String numero) {
    int i = 0;
        boolean achou = false;
        Conta resposta = null;
        while ((!achou) && (i < indice)) {
            if (contas[i].getNumero().equals(numero)) {
                achou = true;
                resposta = contas[i];
            } else {
                i++;
            }

        }
        if (! achou)
            throw new RuntimeException("Não Achou!");
        return resposta;
    }

    public void debitarConta(String numero,double valor) {

        Conta c;
        c = this.procurarConta(numero);
        c.debitar(valor);
    }
    public void creditarConta(String numero,double valor) {

        Conta c;
        c = this.procurarConta(numero);
        c.creditar(valor);
    }
}



