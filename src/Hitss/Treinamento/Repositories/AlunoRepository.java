package Hitss.Treinamento.Repositories;

import Hitss.Treinamento.Classes.*;

public class AlunoRepository extends PessoaRepository {
	public void CancelarMatricula(Aluno aluno) {
		aluno.Status = "Cancelada";
		
		System.out.println("");
		System.out.println("O(A) Aluno(a) " + aluno.Nome + " está com a matrícula " + aluno.Status);
	}
}
