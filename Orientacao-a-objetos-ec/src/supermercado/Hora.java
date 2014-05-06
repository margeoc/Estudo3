package supermercado;

public class Hora {
	private int hora, minutos;
	
	public Hora(int hora, int min){		
			if(hora>=0 && hora<24){
				this.hora = hora;
			} else{
				throw new IllegalArgumentException("Hora inválida");
			}
			
			if(minutos>=0 && minutos<60){
				this.minutos = minutos;
			} else{
				throw new IllegalArgumentException("Minutos inválidos");
			}		
	}
}
