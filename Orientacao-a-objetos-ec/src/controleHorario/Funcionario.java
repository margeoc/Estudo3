package controleHorario;

public class Funcionario {
	private String nome;
	private boolean atraso;
    private double tempoTrabalhado, tempoAtraso;
	
	public Funcionario(String nome, Hora horaChegada, Hora horaSaida){
		this.nome = nome;
		
	}
	
	
	public Hora tempoAtraso(Hora horaChegada){
		int horasAtraso = horaChegada.getHora() - 8;
		int minutosAtraso = horaChegada.getMinutos();
		Hora atraso = new Hora(horasAtraso, minutosAtraso);
		return atraso;
	}
	
	public Hora tempoTrabalhado(Hora chegada, Hora saida){
		int horaInicio = chegada.getHora();
		int horaSaida = saida.getHora();
		int minInicio = chegada.getMinutos();
		int minSaida = saida.getMinutos();
		int hora=0, min=0;
		if(minSaida >= minInicio){
			hora = horaSaida - horaInicio;
			min = minSaida - minInicio;
		} else{
			min = 60 - minInicio + minSaida;
			hora = horaSaida - horaInicio;
		}
		Hora tempoTrab = new Hora(hora, min);
		return tempoTrab;
	}
	
	
}
