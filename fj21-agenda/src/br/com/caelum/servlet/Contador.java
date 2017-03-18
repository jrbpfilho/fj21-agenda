package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/contador")
public class Contador extends HttpServlet {
	private int contador = 0; // variavel de instancia
	@Override
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("Iniciando a servlet");
	}
	
	public void destroy() {
		super.destroy();
		System.out.println("Destruindo a servlet");
		
	}
	
	protected void service(HttpServletRequest request,
						HttpServletResponse response)
						throws ServletException, IOException {
		contador++; //a cada requisiçãp a mesma variavel é incrementada
		
		// recebe o writer
		PrintWriter out = response.getWriter();
		
		// escreve o texto
		out.println("<html>");
		out.println("<body>");
		out.println("Contador agora é: " + contador);
		out.println("</body>");
		out.println("</html>");
		
	}
	

}
