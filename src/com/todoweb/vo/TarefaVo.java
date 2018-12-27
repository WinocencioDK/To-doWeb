package com.todoweb.vo;

import java.util.ArrayList;
import java.util.List;

import com.todoweb.business.Tarefa;
import com.todoweb.condao.TarefaDAO;

public class TarefaVo {
	
	public List<Tarefa> getLista(){
		TarefaDAO tarefaDAO = new TarefaDAO();
		return tarefaDAO.ApresentaTarefas();
	}
}
