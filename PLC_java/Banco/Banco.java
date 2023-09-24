public class Banco {
  private Conta[] contas;
  private int indice;  

  public Banco() {
  contas = new Conta[10];
  indice = 0;
  }

  public void cadastrarConta(Conta c) {
    contas[indice] = c;
    indice = indice + 1;
  }

public Conta procurarConta(String numero) { 
   int i = 0; 
   boolean achou = false;
   Conta resposta = null;
   while ((! achou) && (i < indice)) {
      if (contas[i].getNumero().equals(numero)) {
         achou = true;
         resposta = contas[i];
      } else { 
         i = i + 1;
   }  }
   if (!achou) 
      throw new RuntimeException("Não achou");
   return resposta;
}

public void debitarConta(String numero, double valor) {
  Conta c;
  c = this.procurarConta(numero); 
  c.debitar(valor); 
  }
public void creditarConta(String numero, double valor) {
  Conta c;
  c = this.procurarConta(numero); 
  c.creditar(valor); 
  }

public void transferir(String conta1,String conta2, double valor) {
  Conta c1,c2;
  c1 = this.procurarConta(conta1); 
  c2 = this.procurarConta(conta2); 
  c1.debitar(valor); 
  c2.creditar(valor); 
  }

public void renderJuros(String numero) {
  Conta c;
  c = this.procurarConta(numero); 
    if (c instanceof Poupanca) {
      ((Poupanca) c).renderJuros(0.01);
    }
  }

public void renderBonus(String numero) {
  Conta c;
  c = this.procurarConta(numero); 
    if (c instanceof ContaEspecial) {
      ((ContaEspecial) c).renderBonus();
    }
  }
}

