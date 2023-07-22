package jrggroberto.banco.app;

import jrggroberto.banco.modelo.Conta;
import jrggroberto.banco.modelo.ContaInvestimento;
import jrggroberto.banco.modelo.Pessoa;

public class Principal {

  public static void main(String[] args) {
    Pessoa titular = new Pessoa();
    titular.setNome("Roberto");
    titular.setDocumento(123);

    Pessoa titular2 = new Pessoa();
    titular2.setNome("Joelma");
    titular2.setDocumento(861);

    ContaInvestimento minhaConta = new ContaInvestimento(titular, 234, 199);
    Conta suaConta = new Conta(titular2, 235, 2001);

    minhaConta.depositar(15_000);
    minhaConta.sacar(1_000);
    minhaConta.creditarRendimentos(0.8);
    
    suaConta.depositar(38_300);
    suaConta.sacar(300);

    System.out.println("Titular: " + minhaConta.getTitular().getNome());
    System.out.println("Saldo: " + minhaConta.getSaldo());

    System.out.println("Titular: " + suaConta.getTitular().getNome());
    System.out.println("Saldo: " + suaConta.getSaldo());
  }

}
