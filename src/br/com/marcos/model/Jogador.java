package br.com.marcos.model;

public class Jogador extends Pessoa implements Participante{
	private int pontuacao;
	private String nick;
	
	public Jogador() {
		super();
	}

	public Jogador(int pontuacao, String nick) {
		super();
		this.pontuacao = pontuacao;
		this.nick = nick;
	}

	@Override
	public void calcularPontos() {
		// TODO Auto-generated method stub
	} 
	
	public int getPontuacao() {
		return pontuacao;
	}
	
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	public String getNick() {
		return nick;
	}
	
	public void setNick(String nick) {
		this.nick = nick;
	}
}
