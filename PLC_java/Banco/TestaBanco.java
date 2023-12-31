public class TestaBanco {
  public static void main(String[] args) {
    Conta conta;

//    conta = new Poupanca("22.342-7"); 
//    conta.creditar(10);
//    ((Poupanca) conta).renderJuros(0.01);
//    System.out.println(conta.getSaldo());

//    conta = new Conta("21.342-7"); 
//    conta.creditar(10);
//    ((Poupanca) conta).renderJuros(0.01);
//    System.out.println(conta.getSaldo());

    Banco banco;
    banco = new Banco();

    conta = new ContaEspecial("21.342-7");
    banco.cadastrarConta(conta);
    banco.cadastrarConta(new Poupanca("32.234-4"));
    banco.cadastrarConta(new Conta("47.465-2"));

    banco.creditarConta("21.342-7", 200.00); 
    banco.creditarConta("32.234-4", 200.00); 
    banco.creditarConta("47.465-2", 200.00); 
    banco.debitarConta("21.342-7", 100.00); 
    banco.debitarConta("32.234-4", 100.00); 
    banco.debitarConta("47.465-2", 100.00); 
    banco.renderJuros("21.342-7"); 
    banco.renderJuros("32.234-4"); 
    banco.renderJuros("47.465-2"); 
    System.out.print("saldo da conta 21.342-7 = ");
    System.out.println(conta.getSaldo());
    banco.renderBonus("21.342-7"); 
    banco.renderBonus("32.234-4"); 
    banco.renderBonus("47.465-2"); 
    banco.transferir("32.234-4","47.465-2",50); 

    System.out.print("saldo da conta 21.342-7 = ");
    System.out.println(banco.procurarConta("21.342-7").getSaldo());
    System.out.print("saldo da conta 32.234-4 = ");
    System.out.println(banco.procurarConta("32.234-4").getSaldo());
    System.out.print("saldo da conta 47.465-2 = ");
    System.out.println(banco.procurarConta("47.465-2").getSaldo());
  } 
}
