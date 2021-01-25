package br.senai.sp.jandira.model;
//import br.senai.sp.jandira.model.Cliente;
public class App2 {

	public static void main(String[] args) {
		// criação do cliente
		Cliente pedro = new Cliente();
		pedro.setNome("Pedro Alvarez Cabral");
		pedro.setCpf("55555555588");
		pedro.setTelefone("(11)40028922");
		pedro.setCep("06385023");
		
		//criar da conta do pedro
		Conta contaPedro = new Conta();
		contaPedro.setTitular(pedro);
		contaPedro.depositar(100);
		contaPedro.setNumero("2222-2");
		
		System.out.println(contaPedro.getTitular().getTelefone());
		System.out.println(contaPedro.getTitular().getNome());
		contaPedro
	}
}
