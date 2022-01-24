package testes;

import testes.model.Aluno;
import testes.model.Itens;

public class Centro {

	public static void main(String args[]) {

		Aluno aluno = new Aluno("Lucas", "4B");
		aluno.itens = new Itens(2, 6, 2, 7);
		System.out.println(aluno.toString());

		
		Double media = aluno.itens.CalculaMedia(aluno.itens.getNumero1(), aluno.itens.getNumero2(),
				aluno.itens.getNumero3(), aluno.itens.getNumero4());

		System.out.println("media: " + media);

		boolean result = aluno.itens.Resultado(media);

		if (result == true) {
			System.out.println("Parabéns " + aluno.getNome() + "(" + aluno.getTurma() + ")" + "!! você foi aprovado!");
		} else {
			System.out.println(aluno.getNome() + "(" + aluno.getTurma() + ")" + " infelizmente você foi reprovado!");
		}

		
	}
}
