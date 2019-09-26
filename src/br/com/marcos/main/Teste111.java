package br.com.marcos.main;

import br.com.marcos.controller.Controller;
import br.com.marcos.model.*;

public class Teste111 {
	public static Controller ctr = new Controller();
	
	public static void main(String[] args) {
		ctr.iniciarCampeonato("Campeonato de FREE FIRE", "FREE FIRE", false);
		Jogador j1 = new Jogador();
		j1.setNick("Aldebarã");
		j1.setNome("Marcos2");
		Jogador j2 = new Jogador();
		j2.setNick("Marcos");
		j2.setNome("Marcos3");
		Jogador j3 = new Jogador();
		j3.setNick("Lucas");
		j3.setNome("Lucas");
		ctr.inserirParticipante(j1);
		ctr.inserirParticipante(j2);
		ctr.inserirParticipante(j3);
		j1.setPontuacao(100);
		j2.setPontuacao(50);
		j3.setPontuacao(250);
		ctr.pontuarParticipante(j1);
		ctr.pontuarParticipante(j2);
		ctr.pontuarParticipante(j3);
		for(Participante p : ctr.gerarRanking()) {
			System.out.println(p.getPontuacao());
		}
		System.out.println("\n");
		ctr.removerParticipante(j1);
		for(Participante p : ctr.gerarRanking()) {
			System.out.println(p.getPontuacao());
		}
	}
}
