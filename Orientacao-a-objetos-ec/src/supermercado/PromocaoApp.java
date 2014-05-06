package supermercado;

import java.util.Scanner;

public class PromocaoApp {
	public static void main(String[] args) {
		Produtos p1 = new Produtos("Cafe", 2.45);
		Hora atual = new Hora(20,15);
		CalculaPreco calcula = new CalculaPreco("domingo", atual, p1.getPreco());
		System.out.println("Com Desconto:"+calcula.getDesconto(p1.getPreco()));
	}
}
