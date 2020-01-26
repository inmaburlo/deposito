import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoVacioTest {
	
	@Test
	public final void testDepositoVacio() {
		DepositoCombustible deposito = new DepositoCombustible(0, 0);
		boolean nivelDeposito = deposito.estaVacio();
		assertTrue(nivelDeposito);
	}
	
}
