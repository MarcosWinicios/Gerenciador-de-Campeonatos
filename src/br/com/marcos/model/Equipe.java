package br.com.marcos.model;

import java.util.ArrayList;

public class Equipe implements Participante{
	private String nome;
	private Jogador lider;
	private ArrayList<Jogador> integrantes = new ArrayList<Jogador>();
	private int pontuacao;
	
	public Equipe() {
		super();
	}

	public Equipe(String nome, Jogador lider, ArrayList<Jogador> integrantes, int pontuacao) {
		super();
		this.nome = nome;
		this.lider = lider;
		this.integrantes = integrantes;
		this.pontuacao = pontuacao;
	}
	
	public void addIntegrantes(Jogador jogador) {
		this.integrantes.add(jogador);
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

	public ArrayList<Jogador> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(ArrayList<Jogador> integrantes) {
		this.integrantes = integrantes;
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
