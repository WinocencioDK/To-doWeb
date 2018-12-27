package com.todoweb.condao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.todoweb.business.Tarefa;

public class TarefaDAO {
	
	private Connection conn = ConexaoFactory.getConnection();
	
	public void AdicionarTarefa (Tarefa tar) {
		System.out.println("Adicionando no Banco");
		String sql = "insert into Tarefa (nm_tarefa) values ('" + tar.getNome() + "')";
		
		try {
			PreparedStatement preparador = conn.prepareStatement(sql);
			preparador.execute();
			preparador.close();
			System.out.println("Adicionado com sucesso");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public List<Tarefa> ApresentaTarefas() {
		
		String sql = "Select * from tarefa";
		
		List<Tarefa> tarefas = new ArrayList<Tarefa>();
		
		try {
			PreparedStatement preparador = conn.prepareStatement(sql);
			
			ResultSet resultado = preparador.executeQuery();
				
			while(resultado.next()) {
				Tarefa tarefa = new Tarefa(); //Obrigatorio estár dentro do escopo...
				
				tarefa.setId_tarefa(resultado.getInt("id_tarefa"));
				tarefa.setNome(resultado.getString("nm_tarefa"));
				tarefa.setDescricao(resultado.getString("ds_tarefa"));
				tarefa.setTipoTarefa(resultado.getInt("id_tipotarefa"));
				tarefa.setCor(resultado.getString("cor_tarefa"));
				tarefa.setPrazo(resultado.getString("prazo_tarefa"));
				
				tarefas.add(tarefa);
				
			}
				
			preparador.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return tarefas;
		
	}
	
}
