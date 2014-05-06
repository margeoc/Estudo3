package controleHorario;

public class Hora {
	private int hora, minutos;
	
	
	public Hora(int hora, int minutos){
		if(hora>=0 && hora<24){
			this.hora = hora;
		} else{
			throw new IllegalArgumentException("Hora inv�lida");
		}
		
		if(minutos>=0 && minutos<60){
			this.minutos = minutos;
		} else{
			throw new IllegalArgumentException("Minutos inv�lidos");
		}		
		
	}

	
	public String toString(){
	     return String.format("%d:%d", getHora(), getMinutos());
	    }
	

	public int getHora() {
		return hora;
	}

	public int getMinutos() {
		return minutos;
	}
}
