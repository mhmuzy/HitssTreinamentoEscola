package Hitss.Treinamento.Infra;

import java.awt.image.ConvolveOp;
import java.util.Scanner;
import Hitss.Treinamento.Classes.*;
import Hitss.Treinamento.Repositories.*;

public class Controller {

	public void Play() {
			
	try {
		
		System.out.println("");
		System.out.println("Digite a opção desejada:");
		System.out.println("");
		System.out.println("----------------------------------------------");
		System.out.println("(1) - Fazer Aniversário o(a) Aluno(a)");
		System.out.println("(2) - Fazer Aniversário o(a) Funcionário(a)");
		System.out.println("(3) - Fazer Aniversário o(a) Professor(a)");
		System.out.println("(4) - Cancelar a Matrícula do(a) Aluno(a)");
		System.out.println("(5) - Desligar Funcionário(a)");
		System.out.println("(6) - Aumentar o Salário do(a) Professor(a)");
		System.out.println("----------------------------------------------");
		System.out.println("");

		Scanner teclado = new Scanner(System.in);
		int opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1:
			try {
					
			int[] matricula = new int[5];
			matricula[1] = 1;
			matricula[2] = 2;
			matricula[3] = 3;
			matricula[4] = 4;
			
			String[] nome = new String[5];
			nome[1] = "João Medeiros";
			nome[2] = "César Alencar";
			nome[3] = "Gabriela Barros";
			nome[4] = "Letícia Queiroz";
			
			int[] idade = new int[5];
			idade[1] = 17;
			idade[2] = 18;
			idade[3] = 18;
			idade[4] = 17;
			
			String[] sexo = new String[5];
			sexo[1] = "Masculino";
			sexo[2] = "Masculino";
			sexo[3] = "Feminino";
			sexo[4] = "Feminino";
			
			String[] curso = new String[5];
			curso[1] = "Jornalismo";
			curso[2] = "Medicina";
			curso[3] = "Jornalismo";
			curso[4] = "Medicina";
			
			String[] status = new String[5];
			status[1] = "Ativo";
			status[2] = "Ativo";
			status[3] = "Ativo";
			status[4] = "Ativo";
			
			System.out.println("");
			System.out.println("Digite a Matrícula do(a) Aluno(a):");
			System.out.println("");
			int Matricula = teclado.nextInt();
			
			if (Matricula == matricula[Matricula]) {
				Aluno aluno = new Aluno();
				aluno.Matricula = matricula[Matricula];
				aluno.Nome = nome[Matricula];
				aluno.Idade = idade[Matricula];
				aluno.Sexo = sexo[Matricula];
				aluno.Curso = curso[Matricula];
				aluno.Status = status[Matricula];
				
				System.out.println("");
				AlunoRepository rep = new AlunoRepository();
				 int idadeNiver = rep.FazerAniversario(aluno.Idade);
				System.out.println("O(A) Aluno(a) " + aluno.Nome + " Fez Aniversário, está com " + idadeNiver + " anos");
				
			}else {
				System.out.println("");
				System.out.println("Nenhum(a) Aluno(a) Encontado.");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Nenhum(a) Aluno(a) Encontado.");
			}
			
			break;
		case 2:
			try {
				
				int[] matricula = new int[5];
				matricula[1] = 1;
				matricula[2] = 2;
				matricula[3] = 3;
				matricula[4] = 4;
				
				String[] nome = new String[5];
				nome[1] = "Carlos Alberto";
				nome[2] = "Jonas Ribeiro";
				nome[3] = "Ana Carolina";
				nome[4] = "Jessica Aguiar";
				
				int[] idade = new int[5];
				idade[1] = 35;
				idade[2] = 36;
				idade[3] = 27;
				idade[4] = 29;
				
				String[] sexo = new String[5];
				sexo[1] = "Masculino";
				sexo[2] = "Masculino";
				sexo[3] = "Feminino";
				sexo[4] = "Feminino";
				
				String[] setor = new String[5];
				setor[1] = "Secretário";
				setor[2] = "Inspetor";
				setor[3] = "Moça do café";
				setor[4] = "Diretora";
				
				String[] trabalhando = new String[5];
				trabalhando[1] = "Ativo(a) na empresa";
				trabalhando[2] = "Ativo(a) na empresa";
				trabalhando[3] = "Ativo(a) na empresa";
				trabalhando[4] = "Ativo(a) na empresa";
				
				System.out.println("");
				System.out.println("Digite a Matrícula do(a) Funcionário(a):");
				System.out.println("");
				int Matricula = teclado.nextInt();
				
				if (Matricula == matricula[Matricula]) {
					Funcionario funcionario = new Funcionario();
					funcionario.Matricula = matricula[Matricula];
					funcionario.Nome = nome[Matricula];
					funcionario.Idade = idade[Matricula];
					funcionario.Sexo = sexo[Matricula];
					funcionario.Setor = setor[Matricula];
					funcionario.Trabalhando = trabalhando[Matricula];
					
					System.out.println("");
					AlunoRepository rep = new AlunoRepository();
					 int idadeNiver = rep.FazerAniversario(funcionario.Idade);
					System.out.println("O(A) Funcionário(a) " + funcionario.Nome + " Fez Aniversário, está com " + idadeNiver + " anos");
					
				}else {
					System.out.println("");
					System.out.println("Nenhum(a) Aluno(a) Encontado.");
				}
				} catch (Exception e) {
					System.out.println("");
					System.out.println("Nenhum(a) Aluno(a) Encontado.");
				}
				
			break;
		case 3:
			try {
				
				int[] matricula = new int[5];
				matricula[1] = 1;
				matricula[2] = 2;
				matricula[3] = 3;
				matricula[4] = 4;
				
				String[] nome = new String[5];
				nome[1] = "Jorge Luiz";
				nome[2] = "Marcelo Costa";
				nome[3] = "Isabel Queroz";
				nome[4] = "Thamara Lopez";
				
				int[] idade = new int[5];
				idade[1] = 24;
				idade[2] = 27;
				idade[3] = 30;
				idade[4] = 23;
				
				String[] sexo = new String[5];
				sexo[1] = "Masculino";
				sexo[2] = "Masculino";
				sexo[3] = "Feminino";
				sexo[4] = "Feminino";
				
				String[] especialidade = new String[5];
				especialidade[1] = "Professor de Medicina";
				especialidade[2] = "Professor de Jornalismo";
				especialidade[3] = "Professor de Química";
				especialidade[4] = "P`rofessor de Física";
				
				double[] salario = new double[5];
				salario[1] = 2000.00;
				salario[2] = 1500.00;
				salario[3] = 1800.00;
				salario[4] = 1300.00;
				
				System.out.println("");
				System.out.println("Digite a Matrícula do(a) Professor(a):");
				System.out.println("");
				int Matricula = teclado.nextInt();
				
				if (Matricula == matricula[Matricula]) {
					 Professor professor = new Professor();
					professor.Matricula = matricula[Matricula];
					professor.Nome = nome[Matricula];
					professor.Idade = idade[Matricula];
					professor.Sexo = sexo[Matricula];
					professor.Especialidade = especialidade[Matricula];
					professor.Salario = salario[Matricula];
					
					System.out.println("");
					AlunoRepository rep = new AlunoRepository();
					 int idadeNiver = rep.FazerAniversario(professor.Idade);
					System.out.println("O(A) Professor(a) " + professor.Nome + " Fez Aniversário, está com " + idadeNiver + " anos");
					
				}else {
					System.out.println("");
					System.out.println("Nenhum(a) Aluno(a) Encontado.");
				}
				} catch (Exception e) {
					System.out.println("");
					System.out.println("Nenhum(a) Aluno(a) Encontado.");
				}
				
			break;
		case 4:
			try {
					
			int[] matricula = new int[5];
			matricula[1] = 1;
			matricula[2] = 2;
			matricula[3] = 3;
			matricula[4] = 4;
			
			String[] nome = new String[5];
			nome[1] = "João Medeiros";
			nome[2] = "César Alencar";
			nome[3] = "Gabriela Barros";
			nome[4] = "Letícia Queiroz";
			
			int[] idade = new int[5];
			idade[1] = 17;
			idade[2] = 18;
			idade[3] = 18;
			idade[4] = 17;
			
			String[] sexo = new String[5];
			sexo[1] = "Masculino";
			sexo[2] = "Masculino";
			sexo[3] = "Feminino";
			sexo[4] = "Feminino";
			
			String[] curso = new String[5];
			curso[1] = "Jornalismo";
			curso[2] = "Medicina";
			curso[3] = "Jornalismo";
			curso[4] = "Medicina";
			
			String[] status = new String[5];
			status[1] = "Ativo";
			status[2] = "Ativo";
			status[3] = "Ativo";
			status[4] = "Ativo";
			
			System.out.println("");
			System.out.println("Digite a Matrícula do(a) Aluno(a):");
			System.out.println("");
			int Matricula = teclado.nextInt();
			
			if (Matricula == matricula[Matricula]) {
				Aluno aluno = new Aluno();
				aluno.Matricula = matricula[Matricula];
				aluno.Nome = nome[Matricula];
				aluno.Idade = idade[Matricula];
				aluno.Sexo = sexo[Matricula];
				aluno.Curso = curso[Matricula];
				aluno.Status = status[Matricula];
				
				System.out.println("");
				AlunoRepository rep = new AlunoRepository();
				 rep.CancelarMatricula(aluno);
				
			}else {
				System.out.println("");
				System.out.println("Nenhum(a) Aluno(a) Encontado.");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Nenhum(a) Aluno(a) Encontado.");
			}
			
			break;
		case 5:
			try {
				
				int[] matricula = new int[5];
				matricula[1] = 1;
				matricula[2] = 2;
				matricula[3] = 3;
				matricula[4] = 4;
				
				String[] nome = new String[5];
				nome[1] = "Carlos Alberto";
				nome[2] = "Jonas Ribeiro";
				nome[3] = "Ana Carolina";
				nome[4] = "Jessica Aguiar";
				
				int[] idade = new int[5];
				idade[1] = 35;
				idade[2] = 36;
				idade[3] = 27;
				idade[4] = 29;
				
				String[] sexo = new String[5];
				sexo[1] = "Masculino";
				sexo[2] = "Masculino";
				sexo[3] = "Feminino";
				sexo[4] = "Feminino";
				
				String[] setor = new String[5];
				setor[1] = "Secretário";
				setor[2] = "Inspetor";
				setor[3] = "Moça do café";
				setor[4] = "Diretora";
				
				String[] trabalhando = new String[5];
				trabalhando[1] = "Ativo(a) na empresa";
				trabalhando[2] = "Ativo(a) na empresa";
				trabalhando[3] = "Ativo(a) na empresa";
				trabalhando[4] = "Ativo(a) na empresa";
				
				System.out.println("");
				System.out.println("Digite a Matrícula do(a) Funcionário(a):");
				System.out.println("");
				int Matricula = teclado.nextInt();
				
				if (Matricula == matricula[Matricula]) {
					Funcionario funcionario = new Funcionario();
					funcionario.Matricula = matricula[Matricula];
					funcionario.Nome = nome[Matricula];
					funcionario.Idade = idade[Matricula];
					funcionario.Sexo = sexo[Matricula];
					funcionario.Setor = setor[Matricula];
					funcionario.Trabalhando = trabalhando[Matricula];
					
					System.out.println("");
					FuncionarioRepository rep = new FuncionarioRepository();
					 rep.MudarTrabalho(funcionario);
				}else {
					System.out.println("");
					System.out.println("Nenhum(a) Aluno(a) Encontado.");
				}
				} catch (Exception e) {
					System.out.println("");
					System.out.println("Nenhum(a) Aluno(a) Encontado.");
				}
				
			break;
		case 6:
			try {
				
				int[] matricula = new int[5];
				matricula[1] = 1;
				matricula[2] = 2;
				matricula[3] = 3;
				matricula[4] = 4;
				
				String[] nome = new String[5];
				nome[1] = "Jorge Luiz";
				nome[2] = "Marcelo Costa";
				nome[3] = "Isabel Queroz";
				nome[4] = "Thamara Lopez";
				
				int[] idade = new int[5];
				idade[1] = 24;
				idade[2] = 27;
				idade[3] = 30;
				idade[4] = 23;
				
				String[] sexo = new String[5];
				sexo[1] = "Masculino";
				sexo[2] = "Masculino";
				sexo[3] = "Feminino";
				sexo[4] = "Feminino";
				
				String[] especialidade = new String[5];
				especialidade[1] = "Professor de Medicina";
				especialidade[2] = "Professor de Jornalismo";
				especialidade[3] = "Professor de Química";
				especialidade[4] = "P`rofessor de Física";
				
				double[] salario = new double[5];
				salario[1] = 2000.00;
				salario[2] = 1500.00;
				salario[3] = 1800.00;
				salario[4] = 1300.00;
				
				System.out.println("");
				System.out.println("Digite a Matrícula do(a) Professor(a):");
				System.out.println("");
				int Matricula = teclado.nextInt();
				
				if (Matricula == matricula[Matricula]) {
					 Professor professor = new Professor();
					professor.Matricula = matricula[Matricula];
					professor.Nome = nome[Matricula];
					professor.Idade = idade[Matricula];
					professor.Sexo = sexo[Matricula];
					professor.Especialidade = especialidade[Matricula];
					professor.Salario = salario[Matricula];
					
					System.out.println("");
					ProfessorRepository rep = new ProfessorRepository();
					 rep.ReceberAumento(professor);
					
				}else {
					System.out.println("");
					System.out.println("Nenhum(a) Aluno(a) Encontado.");
				}
				} catch (Exception e) {
					System.out.println("");
					System.out.println("Nenhum(a) Aluno(a) Encontado.");
				}
				
			break;
		default:
			System.out.println("");
			System.out.println("Opção inválida.");
			break;
		}

	} catch (Exception e) {
		System.out.println("");
		System.out.println("Erro: " + e.getMessage());
	}	
	}
}
