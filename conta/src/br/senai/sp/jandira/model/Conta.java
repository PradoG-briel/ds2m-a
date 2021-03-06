package br.senai.sp.jandira.model;

public class Conta {
	
	private String tipo;
	private double saldo;
	private String numero;
	private boolean ativa;
	private double chequeEspecial;
	private Cliente titular;
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public void setTipo(String tipo) {
		if(tipo.equals("Corrente") || tipo.equals("Poupança")) {
			this.tipo = tipo;
		}
		else {
			System.out.println("Tipo invalido");
		}
	}
	
	public void depositar(double valorDeposito) {
		
		if (valorDeposito < 0) {
			System.out.println("Valor inv�lido!!!");
		} else {
			saldo += valorDeposito;
		}
		
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
//	public void setTitular(String titular) {
//		this.titular = titular;
//	}
//	
//	public String getTitular() {
//		return this.titular;
//	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void isAtiva(Boolean ativa) {
		this.ativa = ativa;
	}
	
	public void setChequeEspecial(Double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public void mostrarSaldoDaConta() {
		System.out.println("Saldo: " + saldo);
		System.out.println("Saldo + Limite: " + (saldo + chequeEspecial));
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void sacar(double valorDoSaque) {
		
		if ((saldo + chequeEspecial) >= valorDoSaque) {
			saldo -= valorDoSaque;
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
		
	}
	
	public void transferir() {
		
	}
}
