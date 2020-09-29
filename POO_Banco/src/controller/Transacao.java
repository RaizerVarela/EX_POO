package controller;

import java.util.Date;

public class Transacao {

	private double valor;
	private Date data;
	
	public Transacao(double valor, Date data) {
		super();
		this.valor = valor;
		this.data = data;
	}

	public Date getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Transacao [valor=" + valor + ", data=" + data + "]";
	}
}
