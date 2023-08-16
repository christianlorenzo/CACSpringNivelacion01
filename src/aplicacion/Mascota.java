package aplicacion;

import java.time.Duration;
import java.time.LocalDateTime;

public class Mascota {

	private String estado;
	private int nivel;
	private LocalDateTime aburridaDesde;
	private boolean puedeJugar;

	public Mascota(String estado, int nivel, LocalDateTime aburridaDesde, boolean puedeJugar) {
		super();
		this.estado = estado;
		this.nivel = nivel;
		this.aburridaDesde = aburridaDesde;
		this.puedeJugar = puedeJugar;
	}

	public String comer() {
		switch (estado) {
		case "hambrienta":
			estado = "contenta";
			puedeJugar = true;
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
			puedeJugar = false;
		}

		return estado;
	}

	public int getNivel() {
		return nivel;
	}

	public boolean isPuedeJugar() {

		if (estado == "hambrienta") {
			puedeJugar = false;
		}

		return puedeJugar;
	}

}
