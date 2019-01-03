
// nao pode instanciar a classe
public abstract class Funcionario {
		
	private String nome;
	private String cpf;

	private double salario;

	// metodo sem corpo, nao ha implementacao
	public abstract double getBonificacao();
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
}
