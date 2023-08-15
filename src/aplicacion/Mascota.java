package aplicacion;

import java.time.Duration;
import java.time.LocalDateTime;

public class Mascota {

	private String estado;
	private int nivel;
	private LocalDateTime aburridaDesde;

	public Mascota(String estado, int nivel, LocalDateTime aburridaDesde) {
		super();
		this.estado = estado;
		this.nivel = nivel;
		this.aburridaDesde = aburridaDesde;
	}

	public String comer() {
		switch (estado) {
		case "hambrienta":
			estado = "contenta";
			break;
		case "contenta":
			nivel++;
			break;
		case "aburrida":
			if (Duration.between(LocalDateTime.now(), aburridaDesde).toMinutes() > 80) {
				estado = "contenta";
			}
			break;
		}
		
		return estado;
	}

	public String jugar() {
		switch (estado) {
		case "contenta":
			nivel += 2;
			break;
		case "aburrida":
			estado = "contenta";
			break;
		case "hambrienta":
			System.out.println("No puedo jugar, estoy hambrienta..");
		}
		
		return estado;
	}

	public int getNivel() {
		return nivel;
	}
	
	

}
