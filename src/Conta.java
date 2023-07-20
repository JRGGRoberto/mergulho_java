import java.util.Objects;

public class Conta {
  public int agencia;
  public int numero;
  public double saldo;
  public Pessoa titular;

  Conta(){

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
