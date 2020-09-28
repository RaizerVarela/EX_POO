package aplicacoes;

public class Conta {

	private double valorConta;

	public Conta() {
		
	}
	
	public Conta(double valorConta) {
		this.valorConta = valorConta;
	}
	
	public void deposito(double valorDeposito) {
		valorConta += valorDeposito;
	}
	
	public void saque(double valorSaque) {
		if(!disponibilidade(valorSaque)) {
			System.out.println("Valor requisitado maior que o valor existente em conta!");
		} else{
			valorConta -= valorSaque;
		}
	}
	
	public double getValorConta() {
		return valorConta;
	}

	private boolean disponibilidade(double valorSaque) {
		return valorConta >= valorSaque;
	}
}
