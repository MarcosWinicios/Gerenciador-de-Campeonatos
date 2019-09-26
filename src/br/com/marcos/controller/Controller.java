package br.com.marcos.controller;

import java.util.ArrayList;

import br.com.marcos.model.*;

public class Controller {
	public Campeonato camp;
	public boolean tipoEquipes;
	
	public void iniciarCampeonato(String nomeCampeonato, String jogo, boolean tipoEquipes){
		this.camp = new Campeonato(nomeCampeonato, jogo);
		this.tipoEquipes = tipoEquipes;
	}
	
	public void inserirParticipante(Participante participante) {
		if((this.tipoEquipes && participante instanceof Equipe) || (!this.tipoEquipes && participante instanceof Jogador)) {
			this.camp.addParticipante(participante);
		}
	}
	
	public void removerParticipante(Participante participante) {
		if(participante instanceof Jogador && !this.tipoEquipes) {
			Jogador jogador = (Jogador)participante;
			for(int i = 0; i < this.camp.getParticipantes().size(); i++) {
				Jogador j = (Jogador)this.camp.getParticipantes().get(i);
				if(j.getNick().equals(jogador.getNick())) {
					this.camp.getParticipantes().remove(i);
				}
			}
		}
		else if(participante instanceof Equipe && this.tipoEquipes){
			Equipe equipe = (Equipe)participante;
			for(int i = 0; i < this.camp.getParticipantes().size(); i++) {
				Equipe e = (Equipe)this.camp.getParticipantes().get(i);
				if(e.getNome().equals(equipe.getNome())) {
					this.camp.getParticipantes().remove(i);
				}
			}
		}
	}
	
	public void removerParticipante(Equipe equipe, Jogador jogador) {
		 if(this.tipoEquipes){
			for(int i = 0; i < this.camp.getParticipantes().size(); i++) {
				Equipe e = (Equipe)this.camp.getParticipantes().get(i);
				if(e.getNome().equals(equipe.getNome())) {
					for(int j = 0; i < equipe.getIntegrantes().size(); j++) {
						if(equipe.getIntegrantes().get(j).getNick().equals(jogador.getNick())) {
							equipe.getIntegrantes().remove(j);
							this.camp.getParticipantes().remove(i);
							this.camp.getParticipantes().add(equipe);
						}
					}
				}
			}
		}
	}
	
	public void pontuarParticipante(Participante participante) {
		if(participante instanceof Jogador && !this.tipoEquipes) {
			Jogador jogador = (Jogador)participante;
			for(int i = 0; i < this.camp.getParticipantes().size(); i++) {
				Jogador j = (Jogador)this.camp.getParticipantes().get(i);
				if(j.getNick().equals(jogador.getNick())) {
					this.camp.getParticipantes().get(i).setPontuacao(participante.getPontuacao());
				}
			}
		}
		else if(participante instanceof Equipe && this.tipoEquipes){
			Equipe equipe = (Equipe)participante;
			for(int i = 0; i < this.camp.getParticipantes().size(); i++) {
				Equipe e = (Equipe)this.camp.getParticipantes().get(i);
				if(e.getNome().equals(equipe.getNome())) {
					this.camp.getParticipantes().get(i).setPontuacao(participante.getPontuacao());
				}
			}
		}
	}
	
	public void pontuarParticipante(Equipe equipe, Jogador jogador) {
		 if(this.tipoEquipes){
			for(int i = 0; i < this.camp.getParticipantes().size(); i++) {
				Equipe e = (Equipe)this.camp.getParticipantes().get(i);
				if(e.getNome().equals(equipe.getNome())) {
					for(int j = 0; j < e.getIntegrantes().size(); j++) {
						if(e.getIntegrantes().get(j).getNick().equals(jogador.getNick())) {
							e.getIntegrantes().get(j).setPontuacao(jogador.getPontuacao());
						}
					}
				}
			}
		}
	}
	
	public ArrayList<Participante> gerarRanking() {
		Participante participante1;
		Participante participante2;
		for (int i = 0; i < this.camp.getParticipantes().size(); i++) {
			for(int j = i + 1; j < this.camp.getParticipantes().size(); j++){
				if(this.camp.getParticipantes().get(i).getPontuacao() < this.camp.getParticipantes().get(j).getPontuacao()){
					participante1 = this.camp.getParticipantes().get(i);
					participante2 = this.camp.getParticipantes().get(j);
					this.camp.getParticipantes().set(i, participante2);
					this.camp.getParticipantes().set(j, participante1);
				}
			}
		}
		return this.camp.getParticipantes();
	}
	
	public Jogador melhorJogador() {
		Jogador jogador = new Jogador();
		if(!this.tipoEquipes) {
			for(int i = 0; i < this.camp.getParticipantes().size(); i++) {
				if(jogador.getPontuacao() < this.camp.getParticipantes().get(i).getPontuacao()) {
					jogador = (Jogador)this.camp.getParticipantes().get(i);
				}
			}
		}
		else if(this.tipoEquipes){
			for(int i = 0; i < this.camp.getParticipantes().size(); i++) {
				Equipe equipe = (Equipe)this.camp.getParticipantes().get(i);
				for(int j = 0; j < equipe.getIntegrantes().size(); j++) {
					if(jogador.getPontuacao() < equipe.getIntegrantes().get(j).getPontuacao()) {
						jogador = (Jogador)equipe.getIntegrantes().get(j);
					}
				}
			}
		}
		return jogador;
	}
	
	public Participante participanteVencedor() {
		Participante participante;
		if(this.tipoEquipes) {
			participante = new Equipe();
			for(int i = 0; i < this.camp.getParticipantes().size(); i++) {
				if(participante.getPontuacao() < this.camp.getParticipantes().get(i).getPontuacao()) {
					participante = this.camp.getParticipantes().get(i);
				}
			}
		}
		else {
			participante = new Jogador();
			for(int i = 0; i < this.camp.getParticipantes().size(); i++) {
				if(participante.getPontuacao() < this.camp.getParticipantes().get(i).getPontuacao()) {
					participante = this.camp.getParticipantes().get(i);
				}
			}
		}
		return participante;
	}
	
	public void inserirOrganizador(Organizador organizador) {
		this.camp.addOrganizador(organizador);
	}
	
	public void removerOrganizador(Organizador organizador) {
		for(int i = 0; i < this.camp.getOrganizadores().size(); i++) {
			if(organizador.getNome().equals(this.camp.getOrganizadores().get(i).getNome())) {
				this.camp.getOrganizadores().remove(i);
			}
		}
	}
	
	public ArrayList<Organizador> listarOrganizadores(){
		return this.camp.getOrganizadores();
	}
	
}
