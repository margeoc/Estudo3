package exemplos;

public class Funcionario {
	private String nome;
	private int ID;
	private double salario;

	public Funcionario(String nome, double salario, int ID) {
		System.out.println(this);
		setNome(nome);
		setID(ID);
		setSalario(salario);
	}

	public Funcionario() {
		System.out.println("Método construtor padrão invocado.");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String toString() {
		return "Foi usado o: System.out.println(this)";
	}

	public void exibir() {
		System.out.printf(
				"O funcionario %s, de número %d, recebe %.2f por mes",
				this.nome, this.ID, this.salario);
	}

	public static void main(String[] args) {
		String nome = "Márcio";
		int ID = 123;
		double salario = 5000;

		Funcionario f1 = new Funcionario(nome, salario, ID);
		f1.exibir();

	}

}
