//Lucas Henrique de Souza Santos CB3012212
//Nikolas Caldeira Rodrigues e Silva CB3012247

package br.com.tp02.produto.servlet;
	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;


	@WebServlet("/Creditos")
	public class Creditos extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h1>Instituto Federal de São Paulo - Cubatão</h1>");
			out.println("<h2>Disciplina SISTEMAS WEB I - TP02</h2>");
			out.println("<h1>Alunos:</h1>");
			out.println("<h2>Lucas Henrique de Souza Santos CB3012212</h2>");
			out.println("<h2>Nikolas Caldeira Rodrigues e Silva CB3012247</h2>");
			out.println();
			out.println("<a href='produto.html'>Inicio</a>");
			out.close();
		}
	}
	
