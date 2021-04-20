package Hitss.Treinamento.Repositories;

import Hitss.Treinamento.Classes.*;

public class FuncionarioRepository extends PessoaRepository {
	public void MudarTrabalho(Funcionario funcionario) {
		funcionario.Trabalhando = "Desligado(a) da Empresa";
		
		System.out.println("");
		System.out.println("O(A) Funcionário " + funcionario.Nome + " acabou de ficar: " + funcionario.Trabalhando);
	}
}
