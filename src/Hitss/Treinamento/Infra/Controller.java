package Hitss.Treinamento.Infra;

import java.util.Scanner;
import Hitss.Treinamento.Classes.*;

public class Controller {

	public void Play() {
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
			
			int[] matricula = new int[5];
			matricula[1] = 1;
			matricula[2] = 2;
			matricula[3] = 3;
			matricula[4] = 4;
			
			String[] nome = new String[5];
			nome[1] = "João Medeiros";
			nome[2] = "César Alencar";
			
			break;

		default:
			break;
		}
	}
}
