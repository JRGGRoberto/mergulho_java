package jrggroberto.banco.app;

import jrggroberto.banco.modelo.Pessoa;
import jrggroberto.banco.modelo.CaixaEletronico;
import jrggroberto.banco.modelo.ContaEspecial;
import jrggroberto.banco.modelo.ContaInvestimento;

public class Principal {

  public static void main(String[] args) {
    Pessoa titular = new Pessoa();
    titular.setNome("Roberto");
    titular.setDocumento(123);

    Pessoa titular2 = new Pessoa();
    titular2.setNome("Joelma");
    titular2.setDocumento(861);

    ContaInvestimento minhaConta = new ContaInvestimento(titular, 234, 199);
    ContaEspecial suaConta = new ContaEspecial(titular2, 235, 2001, 1000);

    minhaConta.depositar(15_000);
    minhaConta.sacar(1_000);
    minhaConta.creditarRendimentos(0.8);
    
    suaConta.depositar(15_000);
    suaConta.sacar(15_500);

    CaixaEletronico caixaEletronico = new CaixaEletronico();

    minhaConta.debitarTarifaMensal();
    suaConta.debitarTarifaMensal();

    caixaEletronico.imprimirSaldo(minhaConta);
    System.out.println();
    caixaEletronico.imprimirSaldo(suaConta);
  }

}
