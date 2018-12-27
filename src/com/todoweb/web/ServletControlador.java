package com.todoweb.web;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todoweb.business.Tarefa;
import com.todoweb.condao.TarefaDAO;

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
		
		Tarefa tar = new Tarefa();
		TarefaDAO tarD = new TarefaDAO();
		
		tar.setNome(request.getParameter("nomeTarefa"));
		System.out.println("Recebido");
		if(tar.getNome().length() < 10 || tar.getNome().length() > 60) {
			response.sendRedirect("index.jsp?err=fail");
		}else
		{
			tarD.AdicionarTarefa(tar);
			//String uri = “servlets/ServletLeitor”; 
			//RequestDispatcher dispatcher = request.getRequestDispatcher(uri); 
			//dispatcher.forward(request, response); 
			
			response.sendRedirect("index.jsp?err=sucess");
		}
		tarD.ApresentaTarefas();//ver se o Response, não é um return da vida
		//Retornar para o index.jsp com o err e com o obj Tarefas...
	}
}
