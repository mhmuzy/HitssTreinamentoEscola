package Hitss.Treinamento.Infra;

import java.util.Scanner;
import Hitss.Treinamento.Classes.*;

public class Controller {

	public void Play() {
		System.out.println("");
		System.out.println("Digite a op��o desejada:");
		System.out.println("");
		System.out.println("----------------------------------------------");
		System.out.println("(1) - Fazer Anivers�rio o(a) Aluno(a)");
		System.out.println("(2) - Fazer Anivers�rio o(a) Funcion�rio(a)");
		System.out.println("(3) - Fazer Anivers�rio o(a) Professor(a)");
		System.out.println("(4) - Cancelar a Matr�cula do(a) Aluno(a)");
		System.out.println("(5) - Desligar Funcion�rio(a)");
		System.out.println("(6) - Aumentar o Sal�rio do(a) Professor(a)");
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
			nome[1] = "Jo�o Medeiros";
			nome[2] = "C�sar Alencar";
			
			break;

		default:
			break;
		}
	}
}
