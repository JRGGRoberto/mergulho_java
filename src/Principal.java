public class Principal {

  public static void main(String[] args) {
    Pessoa t = new Pessoa();
    t.nome = "Roberto";
    Conta minhaConta = new Conta(t, 234, 199);
    minhaConta.depositar(17_800);

    Pessoa t2 = new Pessoa();
    t2.nome = "Joelma";

    Conta suaConta = new Conta();
    suaConta.titular = t2;

    suaConta.depositar(30_300);
    suaConta.sacar(300, 10);

    System.out.println("Titular: " + minhaConta.titular.nome);
    System.out.println("Saldo: " + minhaConta.saldo);

    System.out.println("Titular: " + suaConta.titular.nome);
    System.out.println("Saldo: " + suaConta.saldo);
  }

}
