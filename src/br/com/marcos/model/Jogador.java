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
	public int getPontuacao() {
		return pontuacao;
	}
	@Override
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
