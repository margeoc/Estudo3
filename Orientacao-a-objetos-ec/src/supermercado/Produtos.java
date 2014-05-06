package supermercado;

public class Produtos {
	private double preco;
	private String nome;
	
	public Produtos(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	
}
