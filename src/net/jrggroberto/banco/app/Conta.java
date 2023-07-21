package jrggroberto.banco.app;
import java.util.Objects;

public class Conta {
  private int agencia;
  private int numero;
  private double saldo;
  private Pessoa titular;

  Conta(){
    
  }

  public int getAgencia() {
    return agencia;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public Pessoa getTitular() {
    return titular;
  }

  public void setTitular(Pessoa titular) {
    this.titular = titular;
  }

  Conta(Pessoa titular, int agencia, int numero){
    Objects.requireNonNull(titular);

    this.titular = titular;
    this.agencia = agencia;
    this.numero = numero;

  }
  void depositar(double valor){
    if(valor <= 0){
      throw new IllegalArgumentException("Valor deve ser maior que zeo");
    }
    saldo =+ valor;
  }

  void sacar(double valor){
    if(saldo - valor < 0){
      throw new IllegalStateException("Saldo insuficiente");
    } else {
      saldo -= valor;
    }
  }

  void sacar( double valor, double taxaSaque){
    sacar(valor + taxaSaque);
  }
}
