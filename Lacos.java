package SistemaPonto;

import java.util.Scanner;

public class Lacos {

	// menu adm
	public static void LacoAdm() throws InterruptedException {
		Scanner leia = new Scanner(System.in);
		
		int op;
		int senha = 12345;
		int senhaAdm;
		System.out.println("\n\t\t\tOlá, " + Validador.getMatricula().get(Validador.getUsuario()));
		System.out.println("Entre com a sua senha:");
		senhaAdm = leia.nextInt();
		while (senhaAdm != senha) {
			System.out.println("Senha incorreta. Entre com a sua senha novamente:");
			senhaAdm = leia.nextInt();
		}

		if (senhaAdm == senha) {
			do {
				System.out.println("\n(1) Remover Funcionario");
				Thread.sleep(500);
				System.out.println("\n(2) Adicionar Funcionario");
				Thread.sleep(500);
				System.out.println("\n***********************************************************************");
				Thread.sleep(500);
				System.out.println("\n(3) Funcionarios cadastrados");
				Thread.sleep(500);
				System.out.println("\n(4) Sair do sistema");
				Thread.sleep(500);
				System.out.println("\nDigite a sua opção: ");
				Thread.sleep(500);

				op = leia.nextInt();

				switch (op) {
				case 1:

					System.out.println("--------------------------------------------------------------------\n");
					Thread.sleep(500);
					System.out.println("Qual o nome do funcionario que você deseja remover: ");
					Thread.sleep(500);
					Validador.setRemover(leia.next());
					Validador.remover();
					System.out.println("--------------------------------------------------------------------\n");
					Thread.sleep(500);

					break;
				case 2:

					System.out.println("--------------------------------------------------------------------");
					Thread.sleep(500);
					System.out.println("Qual o nome do funcionario que você deseja adicionar: ");
					Thread.sleep(500);
					Validador.setAdd(leia.next());
					Validador.add();
					System.out.println("--------------------------------------------------------------------");
					Thread.sleep(500);

					break;
				case 3:
					System.out.println("--------------------------------------------------------------------");
					Thread.sleep(500);
					Validador.lista();
					System.out.println("--------------------------------------------------------------------");
					Thread.sleep(500);
					break;

				case 4:
					System.out.println("Saindo do sistema.");
					Thread.sleep(500);
					Validador.setAdm(false);
					break;
				default:
					System.out.println("Dados inválidos. . .");
					Thread.sleep(500);
				}

			} while (op != 4);
		}
	}

	// menu funcionario
	public static void LacoFun() throws InterruptedException {
		Scanner leia = new Scanner(System.in);
		System.out.println("\n\t\t\tOlá, " + Validador.getMatricula().get(Validador.getUsuario()));
		int op;
		do {
			System.out.println("\n(1) Iniciar jornada de trabalho");
			Thread.sleep(500);
			System.out.println("\n(2) Encerrar jornada de trabalho");
			Thread.sleep(500);
			System.out.println("\n***********************************************************************");
			Thread.sleep(500);
			System.out.println("\n(3) Iniciar pausa");
			Thread.sleep(500);
			System.out.println("\n(4) Encerrar pausa");
			Thread.sleep(500);
			System.out.println("\n(5) Sair do sistema");
			Thread.sleep(500);
			System.out.println("\nDigite a sua opção: ");
			Thread.sleep(500);

			op = leia.nextInt();

			switch (op) {
			case 1:

				System.out.println("--------------------------------------------------------------------\n");
				Thread.sleep(500);
				ControlePonto.IniciarJ();
				System.out.println("--------------------------------------------------------------------\n");
				Thread.sleep(500);

				break;
			case 2:

				System.out.println("--------------------------------------------------------------------");
				Thread.sleep(500);
				ControlePonto.EncerrarJ();
				System.out.println("--------------------------------------------------------------------");
				Thread.sleep(500);

				break;

			case 3:

				System.out.println("--------------------------------------------------------------------");
				Thread.sleep(500);
				ControlePonto.IniciarPausa();
				System.out.println("--------------------------------------------------------------------");
				Thread.sleep(500);
				break;

			case 4:

				System.out.println("--------------------------------------------------------------------");
				Thread.sleep(500);
				ControlePonto.EncerrarPausa();
				System.out.println("--------------------------------------------------------------------");
				Thread.sleep(500);
				break;

			case 5:
				if (ControlePonto.getJornada() == true) {
					System.out.println("\n\nVocê esta em uma jornada, encerre antes de sair do sistema.\n");
					Thread.sleep(500);
					op = 6;
				} else {
					System.out.println("Tenha um excelente descanso\n");
					Thread.sleep(500);
					Validador.setUsuarioOK(false);
				}
				break;
			default:
				System.out.println("Dados inválidos. . .");
				Thread.sleep(500);
			}

		} while (op != 5);

	}
}
