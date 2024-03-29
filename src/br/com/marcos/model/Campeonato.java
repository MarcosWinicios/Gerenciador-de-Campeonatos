package br.com.marcos.model;
import java.util.ArrayList;

public class Campeonato {
	private String nome;
	private String jogo;
	private ArrayList<Participante> participantes = new ArrayList<Participante>();
	private ArrayList<Organizador> organizadores = new ArrayList<Organizador>();
	private Participante vencedor;
	
	public Campeonato() {
		
	}
	
	public Campeonato(String nome, String jogo) {
		this.nome = nome;
		this.jogo = jogo;
	}
	
	public void addParticipante(Participante participante) {
		this.participantes.add(participante);		
	}
	
	public void addOrganizador(Organizador organizador) {
		this.organizadores.add(organizador);		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getJogo() {
		return jogo;
	}
	public void setJogo(String jogo) {
		this.jogo = jogo;
	}
	
	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(ArrayList<Participante> participantes) {
		this.participantes = participantes;
	}
	
	public ArrayList<Organizador> getOrganizadores() {
		return organizadores;
	}
	public void setOrganizadores(ArrayList<Organizador> organizadores) {
		this.organizadores = organizadores;
	}
	
	public Participante getVencedor() {
		return vencedor;
	}
	public void setVencedor(Participante vencedor) {
		this.vencedor = vencedor;
	}
}
