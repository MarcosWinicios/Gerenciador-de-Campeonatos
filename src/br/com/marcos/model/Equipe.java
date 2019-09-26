package br.com.marcos.model;

import java.util.List;

public class Equipe implements Participante{
	private String nome;
	private Jogador lider;
	private List<Jogador> integrandes;
	private int pontuacao;
	
	public Equipe() {
		super();
	}

	public Equipe(String nome, Jogador lider, List<Jogador> integrandes, int pontuacao) {
		super();
		this.nome = nome;
		this.lider = lider;
		this.integrandes = integrandes;
		this.pontuacao = pontuacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Jogador getLider() {
		return lider;
	}

	public void setLider(Jogador lider) {
		this.lider = lider;
	}

	public List<Jogador> getIntegrandes() {
		return integrandes;
	}

	public void setIntegrandes(List<Jogador> integrandes) {
		this.integrandes = integrandes;
	}
	@Override
	public int getPontuacao() {
		return pontuacao;
	}
	@Override
	public void setPontuacao(int pontos) {
		this.pontuacao = pontos;
	}

}
