package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		List<Empresa> empresas = banco.getEmpresas();
		
		PrintWriter out = response.getWriter();
		
//		String htmlList = "<ul>";
//		empresas.forEach(e -> {
//			htmlList += "<li>";
//				htmlList += "Nome: " + e;
//			htmlList += "</li>";
//		});
		
		System.out.println("Empresas : ");
		System.out.println(empresas);
		
		String htmlList = "<ul>";
		for( Empresa e : empresas ) {
			System.out.println(e.getNome());
			htmlList += "<li>";
				htmlList += "Nome: " + e.getNome();
			htmlList += "</li>";
		}
		htmlList += "</ul>";
		
		System.out.println(htmlList);
		
		out.println("<html>");
		out.println("<body>");
		out.println("Cadatro empresa: " + nomeEmpresa);
		out.println(htmlList);
		out.println("</body>");
		out.println("<html>");
		
	}

}
