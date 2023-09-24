public class Conta extends ContaAbstrata {

    public Conta(String numeroInicial) {
      super(numeroInicial);
    }

    public void debitar(double valor) {
       super.setSaldo(super.getSaldo() - valor); }

}
