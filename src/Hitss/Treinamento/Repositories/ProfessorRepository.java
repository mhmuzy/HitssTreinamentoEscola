package Hitss.Treinamento.Repositories;

import Hitss.Treinamento.Classes.*;

public class ProfessorRepository extends PessoaRepository {
	public void ReceberAumento(Professor professor) {
		
		
		professor.Salario = professor.Salario + (professor.Salario * 0.10);
		
		System.out.println("");
		System.out.println("O Salário do Professor(a) " +  professor.Nome + "Foi aumentado 10% e nisso o salario foi para: R$ " + professor.Salario);
	}
}
