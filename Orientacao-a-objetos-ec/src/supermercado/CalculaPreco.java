package supermercado;

public class CalculaPreco {
	double valor;
	String dia;
	Hora hora;
	
	public CalculaPreco(String dia, Hora hora, double valor){
		this.valor = valor;
		this.dia = dia;
		this.hora = hora;
		
		getDesconto(valor, hora);
		
	}
	
	public double getDesconto(double valor, Hora hora){
		if(dia.equals("sabado") || dia.equals("domingo")  || hora.getHora()>=20 ){
			valor -= (valor*10)/100;
			System.out.println("Preço do produto com desconto de 10%: " + valor);
		} else{
			System.out.println("Preço normal: " + valor);
		}
		
		return valor;
	}
	
}
