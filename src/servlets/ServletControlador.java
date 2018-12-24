package servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Tarefa;
import persistencia.TarefaDAO;

/**
 * Servlet implementation class ServletControlador
 */
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	/*public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Recebendo Requisição");
		Tarefa tar = new Tarefa();
		
		tar.setNome(request.getParameter("nomeTarefa"));
		System.out.println("Recebido");
		/*if(tar.getNome().length() < 10 || tar.getNome().length() < 60) {
			//Redirecionar devolta com mensagem de Erro
		}else
		{*/
		System.out.println("Enviando para o Banco");
			TarefaDAO tarD = new TarefaDAO();
			tarD.AdicionarTarefa(tar);
			
			//String uri = “servlets/ServletLeitor”; 
			//RequestDispatcher dispatcher = request.getRequestDispatcher(uri); 
			//dispatcher.forward(request, response); 
			response.sendRedirect("index.html");
		//}
	}

}
