package aula07;

public class Pessoa {
	
	protected String nome;
	protected int idade;
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	
	

}
