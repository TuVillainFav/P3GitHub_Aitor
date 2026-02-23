public class NuevaFuncionalidad {
	private int horas;
	private  int minutos;
	private int segundos;
	public int getHora() {
		return horas;
	}
	public NuevaFuncionalidad(int horas, int minutos, int segundos) {
		super();
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	public void setHoras(int horas) {
		if(horas>=0&&horas<24) {
			this.horas=horas;
		}
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		if(minutos>=0&&minutos<60) {
			this.minutos = minutos;
		}
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		if(segundos>=0&&segundos<60) {
			this.segundos = segundos;
		}
	}
	public void actualizarSegundos() {
		if(segundos>=0&&segundos<60) {
			setSegundos(segundos+1);
		}else {
			setSegundos(0);
		}	
	}
	public void actualizarMinutos() {
		if(minutos>=0&&minutos<60) {
			setMinutos(minutos+1);
		}else {
			setMinutos(0);
		}	
	}
	public void actualizarHoras() {
		if(horas>=0&&horas<24) {
			setHoras(horas+1);
		}else {
			setHoras(0);
		}	
	}
}
