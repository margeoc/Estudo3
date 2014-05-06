package banco;

import java.util.Random;
import java.util.Scanner;

public class Conta {
	private String nome;
	private double inicial, saldo, valor;
	private int numero, saques;
	
	Scanner entrada = new Scanner(System.in);
	
	
	public Conta(String nome, int numero, double inicial){
		this.nome = nome;
		this.numero = numero;
		this.inicial = inicial;
		saldo = inicial;
		saques = 0;
	}
	
	 public void extrato(){
	        System.out.println("\tEXTRATO");
	        System.out.println("Nome: " + this.nome);
	        System.out.println("Número da conta: " + this.numero);
	        System.out.printf("Saldo atual: %.2f\n",this.saldo);
	        System.out.println("Saques realizados hoje: " + this.saques + "\n");
	        
	    }
	
	
	public void sacar(double valor){
		if(saldo>valor){
			saldo-=valor;
			saques++;
			System.out.println("Sacado: "+valor);
			System.out.println("Saldo atual: "+saldo);
		} else{
			System.out.println("Saldo insuficiente.");
		}		
	}
	
	public void depositar(double valor){
		saldo+=valor;
		System.out.println("Depositado: "+valor);
		System.out.println("Salto atual: "+saldo);
	}
	
	public void iniciar(){
		int opcao;
		do{
			exibirMenu();
			opcao = entrada.nextInt();
			escolherOpcao(opcao);
		} while(opcao!=4);
	}
	
	public void escolherOpcao(int op){
		switch (op){
			case 1:
				extrato();
			break;
			case 2:
				if(saques<3){
					System.out.println("Quanto deseja sacar? ");
					valor = entrada.nextDouble();
					sacar(valor);
										
				}	 else{
					System.out.println("Limite de saques diários atingido.");
				}
				break;
			case 3: 
				System.out.println("Valor do depósito: ");
				valor = entrada.nextDouble();
				depositar(valor);
				break;
			case 4:
				System.out.println("Obrigado por utilizar os nossos serviços!");
				break;
			default:
				System.out.println("Opção inválida.");
		}
	}
	
	public void exibirMenu(){
		System.out.println("Escolha uma das opções: ");
		System.out.println("1 - Extrato");
		System.out.println("2 - Sacar");
		System.out.println("3 - Depositar");
		System.out.println("4 - Sair");
	}
	

}
