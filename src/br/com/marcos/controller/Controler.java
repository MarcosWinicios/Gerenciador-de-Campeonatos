package br.com.marcos.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.marcos.model.*;

public class Controler {
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
					for(int j = 0; i < equipe.getIntegrandes().size(); j++) {
						if(equipe.getIntegrandes().get(j).getNick().equals(jogador.getNick())) {
							equipe.getIntegrandes().remove(j);
							this.camp.getParticipantes().remove(i);
							this.camp.getParticipantes().add(equipe);
						}
					}
				}
			}
		}
	}
	
}
