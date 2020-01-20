import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public final void testMaximaCapacidadDeposito() {
		DepositoCombustible deposito = new DepositoCombustible(0, 0);
		boolean nivelDeposito = deposito.estaVacio();
		assertTrue(nivelDeposito);
	}
}
