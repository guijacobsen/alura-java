package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
		
		if( paramAcao.equals("listaEmpresas") ) {
			System.out.println("Listando empresas");
			
			ListaEmpresas acao = new ListaEmpresas();
			acao.executa(request, response);
			
		} else if( paramAcao.equals("removeEmpresa") ) {
			System.out.println("Removendo empresa");
		} else if( paramAcao.equals("mostraEmpresa") ) {
			System.out.println("Mostrando empresa");
		}
		
	}

}
