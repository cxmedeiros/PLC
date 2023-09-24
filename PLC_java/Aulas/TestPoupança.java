public class Poupanca extends Conta {

    public Poupanca (String n) {
        super(n);
    }
    public void renderJuros(double taxa) {
        this.creditar(this.getSaldo() * taxa);
    }
}

//assinatura
public class PoupancaD {

    public PoupancaD (String n) {}
    public void creditar(double valor) {}
    public void debitar(double valor) {}
    public String getNumero() {}
    public double getSaldo() {}
    public void renderJuros(double taxa) {}

}

//descrição
public class PoupancaD {
    private String numero;
    private double saldo;

    public void creditar (double valor) {

        saldo = saldo + valor;

    } 
    public void renderJuros(double taxa) {

      this.creditar(saldo * taxa);

    }

}


