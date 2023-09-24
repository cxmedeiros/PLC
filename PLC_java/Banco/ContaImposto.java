public class ContaImposto extends ContaAbstrata {

    public ContaImposto(String numeroInicial) {
      super(numeroInicial,0);
    }

    public void debitar(double valor) {
      super.setSaldo(getSaldo() - valor - (valor * 0.001));
    }

}
