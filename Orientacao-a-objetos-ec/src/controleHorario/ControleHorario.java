package controleHorario;

import java.util.Scanner;

public class ControleHorario {
	public static void main(String[] args) {
		Hora chegada = new Hora(8,40);
		Hora saida = new Hora(9,30);
		
		
		Funcionario joao = new Funcionario("joao", chegada, saida);
		System.out.println("Horas trabalhadas: " + joao.tempoTrabalhado(chegada, saida));
		System.out.println("Tempo de atraso: " + joao.tempoAtraso(chegada));
	}
}
