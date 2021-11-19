package SistemaPonto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControlePonto {

	// declaração de variaveis
	private static String horaI;
	private static String entrada;
	private static String saida;
	private static String entradaPausa;
	private static String saidaPausa;
	private static boolean jornada = false;
	private static boolean pausa = false;
	private static long inicioJornada;
	private static long fimJornada;
	private static long inicioPausa;
	private static long fimPausa;
	private static long total;
	private static int segundos;
	private static int minutos;
	private static int horas;

	public static String getHoraI() {
		return horaI;
	}

	public static void setHoraI(String horaI) {
		ControlePonto.horaI = horaI;
	}

	public static String getEntrada() {
		return entrada;
	}

	public static void setEntrada(String entrada) {
		ControlePonto.entrada = entrada;
	}

	public static String getSaida() {
		return saida;
	}

	public static void setSaida(String saida) {
		ControlePonto.saida = saida;
	}

	public static String getEntradaPausa() {
		return entradaPausa;
	}

	public static void setEntradaPausa(String entradaPausa) {
		ControlePonto.entradaPausa = entradaPausa;
	}

	public static String getSaidaPausa() {
		return saidaPausa;
	}

	public static void setSaidaPausa(String saidaPausa) {
		ControlePonto.saidaPausa = saidaPausa;
	}

	public static boolean getJornada() {
		return jornada;
	}

	public static void setJornada(boolean jornada) {
		ControlePonto.jornada = jornada;
	}

	public static boolean getPausa() {
		return pausa;
	}

	public static void setPausa(boolean pausa) {
		ControlePonto.pausa = pausa;
	}

	public static long getInicioJornada() {
		return inicioJornada;
	}

	public static void setInicioJornada(long inicioJornada) {
		ControlePonto.inicioJornada = inicioJornada;
	}

	public static long getFimJornada() {
		return fimJornada;
	}

	public static void setFimJornada(long fimJornada) {
		ControlePonto.fimJornada = fimJornada;
	}

	public static long getInicioPausa() {
		return inicioPausa;
	}

	public static void setInicioPausa(long inicioPausa) {
		ControlePonto.inicioPausa = inicioPausa;
	}

	public static long getFimPausa() {
		return fimPausa;
	}

	public static void setFimPausa(long fimPausa) {
		ControlePonto.fimPausa = fimPausa;
	}

	public static long getTotal() {
		return total;
	}

	public static void setTotal(long total) {
		ControlePonto.total = total;
	}

	public static int getSegundos() {
		return segundos;
	}

	public static void setSegundos(int segundos) {
		ControlePonto.segundos = segundos;
	}

	public static int getMinutos() {
		return minutos;
	}

	public static void setMinutos(int minutos) {
		ControlePonto.minutos = minutos;
	}

	public static int getHoras() {
		return horas;
	}

	public static void setHoras(int horas) {
		ControlePonto.horas = horas;
	}

	// metodo inicia jornada
	public static void IniciarJ() {
		if (jornada == false) {
			entrada = new SimpleDateFormat("HH:mm:ss").format(new Date());
			inicioJornada = System.currentTimeMillis();// inicia contador jornada de trabalho
			System.out.println("Jornada iniciada com sucesso as: " + entrada);
			System.out.println("\t\tBom trabalho!!");
			jornada = true;
		} else {
			System.out.println("A jornada já foi iniciada as: " + entrada);
		}
	}

	// metodo encerrar jornada
	public static void EncerrarJ() {
		if (jornada == true) {
			saida = new SimpleDateFormat("HH:mm:ss").format(new Date());
			fimJornada = System.currentTimeMillis();// fim jornada de trabalho
			System.out.println("Jornada finalizada com sucesso as: " + saida);
			total = fimJornada - inicioJornada;
			segundos = (int) ((total / 1000) % 60);
			minutos = (int) (((total / 1000) / 60) % 60);
			horas = (int) (((total / 1000) / 60) / 60);
			System.out.println("Você trabalhou por: " + horas + ":" + minutos + ":" + segundos);
			jornada = false;
		} else {
			System.out.println("Não pode encerrar jornada. \nVocê não esta trabalhando no momento.");
		}
	}

	// metodo inicia pausa
	public static void IniciarPausa() {
		if (pausa == false && jornada == true) {
			entradaPausa = new SimpleDateFormat("HH:mm:ss").format(new Date());
			inicioPausa = System.currentTimeMillis();// inicia contador jornada de trabalho
			System.out.println("Sua pausa foi iniciada com sucesso as: " + entradaPausa);
			System.out.println("\t\tBoa pausa!!");
			pausa = true;
		} else {
			System.out.println("Não é possível tirar pausa no momento");
		}
	}

	// metodo encerrar pausa
	public static void EncerrarPausa() {
		if (pausa == true) {
			saidaPausa = new SimpleDateFormat("HH:mm:ss").format(new Date());
			fimPausa = System.currentTimeMillis();// fim jornada de trabalho
			System.out.println("Pausa finalizada com sucesso as: " + saidaPausa);
			total = fimPausa - inicioPausa;
			segundos = (int) ((total / 1000) % 60);
			minutos = (int) (((total / 1000) / 60) % 60);
			horas = (int) (((total / 1000) / 60) / 60);
			System.out.println("Sua pausa foi de: " + horas + ":" + minutos + ":" + segundos);
			pausa = false;
		} else {
			System.out.println("Não pode encerrar sua pausa. \nVocê não esta de pausa no momento.");
		}
	}

}
