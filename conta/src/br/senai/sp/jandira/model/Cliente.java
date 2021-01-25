package br.senai.sp.jandira.model;

public class Cliente{
	String nome;
	String cpf;
	String telefone;
	String cep;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getCep() {
		return this.cep;
	}
	
}