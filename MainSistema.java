package SistemaPonto;

import java.util.Scanner;

public class MainSistema {

	public static void main(String[] args) throws InterruptedException {

		Scanner leia = new Scanner(System.in);

		int op = 0;
		int tentativa = 0;

		while (op != 99) {

			// busca funções do Adm
			if (Validador.getAdm() == true) {
				Lacos.LacoAdm();
			}

			// busca funções do usuario
			if (Validador.getUsuarioOK() == true) {
				Lacos.LacoFun();
			}
			if (tentativa == 0) {
			System.out.print("Carregando.");	
			Thread.sleep(1000);
			System.out.print(".");	
			Thread.sleep(1000);
			System.out.print(".");	
			Thread.sleep(1000);
			System.out.print(".");	
			Thread.sleep(1000);
			System.out.print(".");	
			Thread.sleep(1000);
			System.out.print(".");	
			Thread.sleep(1000);
			System.out.println(".");	
			Thread.sleep(1000);
			System.out.println("Digite sua matricula ou 99 para sair ");
			Thread.sleep(500);
			Validador.setUsuario(leia.nextInt());
			Validador.validadorMatricula();
			op = Validador.getUsuario();
			tentativa = 1;
			}
			else {
				System.out.println("Matricula não encontrada.\nDigite uma matricula valida ou 99 para sair ");
				Thread.sleep(500);
				Validador.setUsuario(leia.nextInt());
				Validador.validadorMatricula();
				op = Validador.getUsuario();
			}
		}
	}
}