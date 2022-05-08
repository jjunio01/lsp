package main;

/**
 * @author JJunio
 *
 */
public class ContaComum extends Conta {

	public ContaComum(double saldo) {
		super(saldo);
	}

	public void deposita(double valorDeposito) throws ValorInvalidoException {
		if (valorDeposito <= 0) {
			throw new ValorInvalidoException();
		}
		this.setSaldo(getSaldo() + valorDeposito);
	}

	public void rende() {
		this.setSaldo(getSaldo() * 1.1);
	}

	public double getSaldo() {
		return super.getSaldo();
	}
}
