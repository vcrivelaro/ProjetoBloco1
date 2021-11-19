package SistemaPonto;

import java.util.ArrayList;

public class Validador {

	// declaração de variaveis
	private static boolean usuarioOK = false;
	private static boolean adm = false;
	private static int usuario;
	private static String senha;
	private static int id = 3;
	private static String remover;
	private static String add;

	// arrayList para guardar as matriculas e nomes
	private static ArrayList<String> matricula = new ArrayList<>() {
		{
			add("ADM");
			add("João");
			add("Lucas");
			add("Marcos");
			add("Luis");
		}
	};

	public static String getAdd() {
		return add;
	}

	public static void setAdd(String add) {
		Validador.add = add;
	}

	public static String getRemover() {
		return remover;
	}

	public static void setRemover(String remover) {
		Validador.remover = remover;
	}

	public static boolean getAdm() {
		return adm;
	}

	public static void setAdm(boolean adm) {
		Validador.adm = adm;
	}

	public static ArrayList<String> getMatricula() {
		return matricula;
	}

	public static void setMatricula(ArrayList<String> matricula) {
		Validador.matricula = matricula;
	}

	public static String getSenha() {
		return senha;
	}

	public static void setSenha(String senha) {
		Validador.senha = senha;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Validador.id = id;
	}

	public static int getUsuario() {
		return usuario;
	}

	public static void setUsuario(int usuario) {
		Validador.usuario = usuario;
	}

	public static boolean getUsuarioOK() {
		return usuarioOK;
	}

	public static void setUsuarioOK(boolean usuarioOK) {
		Validador.usuarioOK = usuarioOK;
	}

	// metodo que valida matricula
	public static void validadorMatricula() {
		if (usuario > 0 && usuario < matricula.size()) {
			setUsuarioOK(true);

		}
		if (usuario == 0) {
			setAdm(true);
		}
	}

	// metodo remove funcionario
	public static void remover() {
		if (matricula.contains(remover)) {
			matricula.remove(remover);
			System.out.println("Funcionario removido com sucesso.");
		} else {
			System.out.println("Funcionario não encontrado.");
		}
	}

	// metodo adiciona funcionario
	public static void add() {
		matricula.add(add);
		System.out.println("Funcionario " + add + " adicionado com sucesso.\nMatricula: " + matricula.indexOf(add));
	}

	// metodo imprime lista de funcionario
	public static void lista() {
		for (int x = 0; x < matricula.size(); x++) {
			System.out.println(
					"Funcionario: " + matricula.get(x) + "\nMatricula: " + matricula.indexOf(matricula.get(x)) + "\n");
		}
	}
}
