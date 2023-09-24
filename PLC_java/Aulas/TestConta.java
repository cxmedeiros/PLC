class Conta {
    private String numero;
    private double saldo;

    public Conta (String numero) {
        this.numero = numero;
        saldo = 0;
    }

    public Conta (String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void creditar(double valor) {
       saldo = saldo + valor;
    }

//    public String creditar(double valor) {
//       saldo = saldo + valor;
//       return "";
//    }

    public String creditar(double valor, String origem) {
       saldo = saldo + valor;
       return origem;
    }

    public void debitar(double valor) {
       saldo = saldo - valor;
    }

    public double getSaldo() {
      return saldo;
    }
    public String getNumero() {
      return numero;
    }
}

class Referencia {
    public Conta redefine (Conta a) {
    Conta b = new Conta("567-8",55);
    a.creditar(100);
   
    System.out.println(a);
    a = b;
    b.creditar(100);
    System.out.println(a);
    System.out.println(b);

    a.creditar(100);
    System.out.println(a.getSaldo());
    return a;
  }
}

public class TestConta {
  public static void main(String[] args) {
    // Conta c = new Conta("123-X", 8.0);
    // System.out.println("Conta "+c.getNumero());
    // System.out.println(" saldo "+c.getSaldo());
    // System.out.println();
    // c.creditar(10.0);
    // c.debitar(5.0);
    // System.out.println("Conta "+c.getNumero());
    // System.out.println(" saldo "+c.getSaldo());

    Referencia r;
    r = new Referencia();
    Conta c = new Conta("123-4",12);
    c = r.redefine(c);

    System.out.println(c.getSaldo());
  }
}


