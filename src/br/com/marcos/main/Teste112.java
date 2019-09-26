package br.com.marcos.main;

import br.com.marcos.controller.Controller;
import br.com.marcos.model.*;

public class Teste112 {
	public static Controller ctr = new Controller();
	public static void main(String[] args) {
		ctr.iniciarCampeonato("Campeonato de FREE FIRE", "FREE FIRE", true);
		
		Jogador j1 = new Jogador();
		j1.setNick("Aldebarã");
		j1.setNome("Marcos2");
		Jogador j2 = new Jogador();
		j2.setNick("Pagasus");
		j2.setNome("Marcos3");
		Jogador j3 = new Jogador();
		j3.setNick("Frazao");
		j3.setNome("Julia");
		
		Equipe eqp1 = new Equipe();
		eqp1.setNome("Los_grandes");
		eqp1.addIntegrantes(j1);
		eqp1.addIntegrantes(j2);
		eqp1.addIntegrantes(j3);
		
		Jogador j4 = new Jogador();
		j4.setNick("MARCOS");
		j4.setNome("Marcos3");
		Jogador j5 = new Jogador();
		j5.setNick("O_gato");
		j5.setNome("Joel");
		Jogador j6 = new Jogador();
		j6.setNick("Mozin");
		j6.setNome("Lia");
		
		Equipe eqp2 = new Equipe();
		eqp2.setNome("RobadoreDeKill");
		eqp2.addIntegrantes(j4);
		eqp2.addIntegrantes(j5);
		eqp2.addIntegrantes(j6);
		
		Jogador j7 = new Jogador();
		j7.setNick("So_lamento");
		j7.setNome("Lucas");
		Jogador j8 = new Jogador();
		j8.setNick("I-Love-Palmeiras");
		j8.setNome("Adriano");
		Jogador j9 = new Jogador();
		j9.setNick("Rigo");
		j9.setNome("Rangel");
		
		Equipe eqp3 = new Equipe();
		eqp3.setNome("HackeamosOJogo");
		eqp3.addIntegrantes(j7);
		eqp3.addIntegrantes(j8);
		eqp3.addIntegrantes(j9);
		
		ctr.inserirParticipante(eqp1);
		ctr.inserirParticipante(eqp2);
		ctr.inserirParticipante(eqp3);
		
		j1.setPontuacao(245);
		j2.setPontuacao(345);
		j3.setPontuacao(110);
		j4.setPontuacao(100);
		j5.setPontuacao(50);
		j6.setPontuacao(95);
		j7.setPontuacao(40);
		j8.setPontuacao(22);
		j9.setPontuacao(250);
		ctr.pontuarParticipante(eqp1, j1);
		ctr.pontuarParticipante(eqp1, j2);
		ctr.pontuarParticipante(eqp1, j3);
		ctr.pontuarParticipante(eqp2, j4);
		ctr.pontuarParticipante(eqp2, j5);
		ctr.pontuarParticipante(eqp2, j6);
		ctr.pontuarParticipante(eqp3, j7);
		ctr.pontuarParticipante(eqp3, j8);
		ctr.pontuarParticipante(eqp3, j9);
		eqp1.setPontuacao(3120);
		eqp2.setPontuacao(1234);
		eqp3.setPontuacao(2450);
		ctr.pontuarParticipante(eqp1);
		ctr.pontuarParticipante(eqp2);
		ctr.pontuarParticipante(eqp3);
		
		for(Participante p : ctr.gerarRanking()) {
			System.out.println(p.getPontuacao());
		}
		System.out.println("------------------");
		ctr.removerParticipante(eqp2);
		for(Participante p : ctr.gerarRanking()) {
			System.out.println(p.getPontuacao());
		}
		System.out.println("------------------");
		System.out.println(ctr.melhorJogador().getNome());
	}
}
