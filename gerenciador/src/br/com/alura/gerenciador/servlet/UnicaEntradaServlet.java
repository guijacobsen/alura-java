package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.AlteraEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.RemoveEmpresa;
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
			
			RemoveEmpresa acao = new RemoveEmpresa();
			acao.executa(request, response);
			
		} else if( paramAcao.equals("mostraEmpresa") ) {
			System.out.println("Mostrando empresa");
			
			MostraEmpresa acao = new MostraEmpresa();
			acao.executa(request, response);
		} else if( paramAcao.equals("alteraEmpresa") ) {
			System.out.println("Alterando empresa");
			
			AlteraEmpresa acao = new AlteraEmpresa();
			acao.executa(request, response);
		} else if( paramAcao.equals("novaEmpresa") ) {
			System.out.println("Nova empresa");
			
			NovaEmpresa acao = new NovaEmpresa();
			acao.executa(request, response);
		}
		
	}

}
