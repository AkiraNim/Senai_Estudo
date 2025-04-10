package aula11_RoteiroDePratica;

import java.util.List;

public class PessoaFisica extends Pessoa implements IPessoa{
	protected String cpf;
	
	public PessoaFisica(int id, int idade, String nome, String cpf) {
	    super(id, idade, nome);
	    this.cpf = cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	@Override
	public List<Pessoa> cadastrarPessoa(int id, String nome, int idade, String cpf_cnpj, List<Pessoa> pessoas) {
	    pessoas.add(new PessoaFisica(id, idade, nome, cpf));
	    return pessoas;
	}
	
	@Override
	public void editar(List<Pessoa> pessoas, String nome, int id, int idade, String cpf) {
		for (Pessoa pessoa : pessoas) {
			
			if(pessoa instanceof PessoaFisica && pessoa.getId()==id) {
				int index = pessoas.indexOf(pessoa);
				
				PessoaFisica pessoaFisica = (PessoaFisica) pessoas.get(index);
				
				pessoaFisica.setNome(nome);
				pessoaFisica.setCpf(cpf);
				pessoaFisica.setIdade(idade);
				
			}
		}
	}
	
	@Override
	public String buscar(List<Pessoa> pessoas, String nome, int id, int idade, String cpf) {
		for (Pessoa pessoa : pessoas) {
			if(pessoas.get(id) instanceof PessoaFisica && pessoa.getId()==id) {
				int index = pessoas.indexOf(pessoa);
				
				PessoaFisica pessoaFisica = (PessoaFisica) pessoas.get(index);
		
				return "\nId: "+ pessoaFisica.getId()
				+"\nNome: "+ pessoaFisica.getNome()
				+ "\nIdade: "+pessoaFisica.getIdade()
				+"Cpf: "+pessoaFisica.getCpf();
			}
		}
		return "\nNão encontrado";
	}
}

	