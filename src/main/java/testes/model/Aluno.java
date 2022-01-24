package testes.model;

public class Aluno {

	private String nome;
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", turma=" + turma + ", itens=" + itens.getNumero1() + ", " 
				+ itens.getNumero2() + ", " 
				+ itens.getNumero3() + ", " 
				+ itens.getNumero4() + "]";
	}
	
	private String turma;
	public Itens itens;
	
	public Aluno(String nome, String turma) {
		this.nome = nome;
		this.turma = turma;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	
	
}
