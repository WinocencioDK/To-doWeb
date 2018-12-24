package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entidades.Tarefa;

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
	
	
}
