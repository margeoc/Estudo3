package supermercado;

import java.util.Scanner;

public class PromocaoApp {
	public static void main(String[] args) {
		Produtos p1 = new Produtos("Cafe", 5);
		Hora atual = new Hora(20,15);
		CalculaPreco calcula = new CalculaPreco("segunda", atual, p1.getPreco());
		
	}
}
