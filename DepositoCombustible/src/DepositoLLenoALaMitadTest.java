import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoLLenoALaMitadTest {
	
	@Test
	public final void testDepositoLlenoMitad() {
		DepositoCombustible deposito = new DepositoCombustible(12, 0);
		deposito.fill(6);
		assertEquals(deposito.getDepositoMax()/2,deposito.getDepositoNivel(),1);
	}
	
}
