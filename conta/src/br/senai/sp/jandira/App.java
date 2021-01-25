package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		
		Conta contaAna = new Conta();
		Conta contaDoJoao = new Conta();
		
//		contaAna.setTitular("Ana Gomes");
		contaAna.setNumero("111-98");
		contaAna.setTipo("Corrente");
		contaAna.isAtiva(true);
		contaAna.setChequeEspecial(200.00);
		contaAna.depositar(100);
		contaAna.mostrarSaldoDaConta();
		contaAna.depositar(30);
		contaAna.mostrarSaldoDaConta();
		contaAna.sacar(50);
		contaAna.mostrarSaldoDaConta();
		contaAna.sacar(500);
		contaAna.mostrarSaldoDaConta();
		contaAna.sacar(50);
		contaAna.mostrarSaldoDaConta();
		contaAna.sacar(80);
		contaAna.mostrarSaldoDaConta();
		contaAna.depositar(100);
		contaAna.mostrarSaldoDaConta();

		double valorSaldo= contaAna.getSaldo();
		System.out.println("****" + contaAna.getSaldo());
		
//		System.out.println(contaAna.getTitular());
		System.out.println(contaAna);
		
		
		Cliente cliente = new Cliente();

		
		
	}
}
