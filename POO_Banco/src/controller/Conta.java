package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Conta {
	
	private double saldo;
	private String numero;
	private String senha;
	private List<Transacao> historico;
	
	public Conta() {
		
	}

	public Conta(String numero, String senha) {
		historico = new ArrayList<>();
		this.numero = numero;
		this.senha = senha;
		this.saldo = new Random().nextDouble() * 5000;
	}
	
	public String getSenha() {
		return senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void efetuarSaque(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			Transacao saque = new Saque(valor, getDataAtual());
			historico.add(saque);
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void efetuarDeposito(double valor) {
		saldo += valor;
		Transacao deposito = new Deposito(valor, getDataAtual());
		historico.add(deposito);
	}
	
	public boolean efetuarPagamento(String boleto, double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			Transacao pagamento = new Pagamento(valor, getDataAtual(), boleto);
			historico.add(pagamento);
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}
	
	public List<Transacao> extrato(Date inicio, Date fim) {
		List<Transacao> extrato = new ArrayList<>();
		for (Transacao transacao : historico) {
			if (transacao.getData().after(inicio) && transacao.getData().before(fim)) {
				extrato.add(transacao);
			}
		}
		return extrato;
	}
	
	private Date getDataAtual() {
		return new Date();
	}
}
