package exemplos;

import com.sun.org.apache.xml.internal.utils.StringToStringTable;

import sun.applet.Main;

public class Funcionario {
	private String nome;
	private int ID;
	private double salario;
	 
	 
	public Funcionario(String nome, double salario, int ID){
		System.out.println(this);
		this.nome = nome;
		this.ID = ID;
		this.salario = salario;
	}	
	
	public Funcionario(){
		System.out.println("Método construtor padrão invocado.");
	}
	
	public String toString(){
		return "Foi usado o: System.out.println(this)";
	}
	
	public void exibir(){
		System.out.printf("O funcionario %s, de número %d, recebe %.2f por mes", this.nome, this.ID, this.salario);
	}
	
	public static void main(String[] args){
		String nome = "Márcio";
		int ID = 123;
		double salario = 5000;
		
		Funcionario f1 = new Funcionario(nome, salario, ID);
		f1.exibir();
		
		
	}
	
}
