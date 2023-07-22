package jrggroberto.banco.modelo;
import java.util.Objects;

public class ContaEspecial extends Conta {

  private double valorLimete;

  public ContaEspecial(Pessoa titular, int agencia, int numero, double valorLimete){
    super(titular, agencia, numero);
    Objects.requireNonNull(titular);
    this.valorLimete = valorLimete;
  }


  public double getValorLimete() {
    return this.valorLimete;
  }

  public void setValorLimete(double valorLimete) {
    this.valorLimete = valorLimete;
  }

  @Override
  public double getSaldoDisponivel(){

    return getSaldo() + valorLimete;
  }


  
}
