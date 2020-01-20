import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public final void testDepositoLlenoMitad() {
		DepositoCombustible deposito = new DepositoCombustible(12, 0);
		deposito.consumir(6);
		assertEquals(deposito.getDepositoMax()/2,6,1);
		
		DepositoCombustible deposito2 = new DepositoCombustible(12, 12);
		deposito2.consumir(12);
		assertEquals(deposito2.getDepositoNivel(),0,1);
	}
}
