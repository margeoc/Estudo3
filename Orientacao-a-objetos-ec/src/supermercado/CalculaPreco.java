package supermercado;

public class CalculaPreco {
	double valor;
	String dia;
	Hora hora;
	
	public CalculaPreco(String dia, Hora hora, double valor){
		this.valor = valor;
		this.dia = dia;
		this.hora = hora;
	}
	
	public double getDesconto(double valor){
		if(dia.equals("sabado") || dia.equals("domingo")){
			valor -= (valor*10)/100;
		} 
		
		return valor;
	}
	
}
