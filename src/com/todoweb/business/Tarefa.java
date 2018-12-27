package com.todoweb.business;

public class Tarefa {
	
	private int id_tarefa;
	private String nome;
	private String descricao;
	private int tipoTarefa;
	private String prazo;
	private String cor;
	
	public int getId_tarefa() {
		return id_tarefa;
	}
	public void setId_tarefa(int id_tarefa) {
		this.id_tarefa = id_tarefa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getTipoTarefa() {
		return tipoTarefa;
	}
	public void setTipoTarefa(int tipoTarefa) {
		this.tipoTarefa = tipoTarefa;
	}
	public String getPrazo() {
		return prazo;
	}
	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

}
