package br.com.marcos.model;

public class Organizador extends Pessoa {
	private String cargo;

	public Organizador(String cargo) {
		super();
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
		
}
