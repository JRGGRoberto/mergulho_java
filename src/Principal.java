public class Principal {

  public static void main(String[] args) {
    Pessoa t = new Pessoa();
    t.setNome("Roberto");
    Conta minhaConta = new Conta(t, 234, 199);
    minhaConta.depositar(17_800);
    Pessoa t2 = new Pessoa();
    t2.setNome("Joelma");

    Conta suaConta = new Conta();
    suaConta.setTitular(t2);


    suaConta.depositar(30_300);
    suaConta.sacar(300, 10);

    System.out.println("Titular: " + minhaConta.getTitular().getNome());
    System.out.println("Saldo: " + minhaConta.getSaldo());

    System.out.println("Titular: " + suaConta.getTitular().getNome());
    System.out.println("Saldo: " + suaConta.getSaldo());
  }

}
