import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public final void testValorActualDeposito() {
		DepositoCombustible deposito = new DepositoCombustible(0, 0);
		double nivelDeposito = deposito.getDepositoNivel();
		assertNotNull(nivelDeposito);
	}
}
