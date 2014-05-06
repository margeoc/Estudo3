package banco;

import java.util.Random;
import java.util.Scanner;

public class Caixa {
	public static void main(String[] args) {
		String nome;
		double inicial;
		Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);
        
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bem vindo ao sistema bancário.");
		System.out.print("Informe o seu nome: ");
		nome = entrada.nextLine();
		System.out.print("Informe o seu saldo inicial: ");
		inicial = entrada.nextDouble();
		
		Conta c1 = new Conta(nome, conta, inicial);
		c1.iniciar();
	}
}
