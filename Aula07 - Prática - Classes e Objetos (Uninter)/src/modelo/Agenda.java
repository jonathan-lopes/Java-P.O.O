package modelo;

public class Agenda {
	private String hora;
	private String data;
	private String local;
	
	public Agenda(String hora, String data, String local) {
		this.hora = hora;
		this.data = data;
		this.local = local;
	}
	
	public Agenda() {}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	
	
	
}
