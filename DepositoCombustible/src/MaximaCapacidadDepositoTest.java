import static org.junit.Assert.*;

import org.junit.Test;

public class MaximaCapacidadDepositoTest {
	
	@Test
	public final void testMaximaCapacidadDeposito() {
		DepositoCombustible deposito = new DepositoCombustible(0, 0);
		double nivelDeposito = deposito.getDepositoMax();
		assertNotNull(nivelDeposito);
	}
}
