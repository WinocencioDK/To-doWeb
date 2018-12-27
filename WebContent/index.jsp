<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <head>
        <title>Meu Todo em Java</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    </head>
    <title>TO-DO</title>
    <body>
    	<jsp:useBean id="tarefa" class="com.todoweb.vo.TarefaVo"/>
    	
        <div class="container">
            <div class="jumbotron">
                <h1>To-Do</h1>
                <h2>Gerencie suas tarefas</h2>
            </div>
            
            <form class="form-inline" action="ServletControlador" method="post">
                <label for="tarefa"  class="mr-sm-2">Tarefa:</label>
                <input type="text" name="nomeTarefa" class="form-control mb-2 mr-sm-2" minlength=10 maxlength="60" required>
                <button type="submit" class="btn btn-success mb-2">+</button>    
            </form>
            
            <br>
            <br>
            
            <c:forEach var="tarefa" items="${tarefa.lista}">
				            
            	<div class="card">
  					<div class="card-body">
    					${tarefa.nome}
    					<button type="button" class="btn btn-outline-success">Finalizar</button>
    					<button type="button" class="btn btn-outline-danger">Excluir</button>
    					
  					</div>
				</div>
				<br>
            
            </c:forEach>
        </div>
    </body>
</html>