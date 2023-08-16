package aplicacion;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

public class MascotaTest {

	@Test
	public void testComer() {
		Mascota mascota = new Mascota("hambrienta", 0, LocalDateTime.now(), false);
		assertEquals("contenta", mascota.comer());
		
		mascota.comer();
		assertEquals(1, mascota.getNivel());
		
		mascota = new Mascota("aburrida", 0, LocalDateTime.now().plusMinutes(90), false);
		assertEquals("contenta", mascota.comer());
		
		mascota = new Mascota("aburrida", 0, LocalDateTime.now(), false);
		assertEquals("aburrida", mascota.comer());
		
	}

	@Test
	public void testJugar() {
		
		Mascota mascota = new Mascota("contenta", 0, LocalDateTime.now(), true);
		mascota.jugar();
		assertEquals(2, mascota.getNivel());
		
		mascota = new Mascota("aburrida", 0, LocalDateTime.now(), true);
		assertEquals("contenta", mascota.jugar());
		
		mascota = new Mascota("hambrienta", 0, LocalDateTime.now(), true);
		assertEquals("hambrienta", mascota.jugar());
		
		assertEquals(false, mascota.isPuedeJugar());
		
		mascota.comer();
		assertEquals(true, mascota.isPuedeJugar());
		
	}

}
