package aplicacion;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MascotaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testComer() {		
		Mascota mascota = new Mascota("hambrienta", 0, LocalDateTime.now());
		assertEquals("contenta", mascota.comer());
		
		mascota.comer();
		assertEquals(1, mascota.getNivel());
		
	}

	@Test
	public void testJugar() {
	}

}
