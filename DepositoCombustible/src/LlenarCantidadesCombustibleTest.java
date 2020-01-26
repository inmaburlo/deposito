import static org.junit.Assert.*;

import org.junit.Test;

public class LlenarCantidadesCombustibleTest {

	@Test
	public final void testDepositoLlenarMitad() {
		DepositoCombustible deposito = new DepositoCombustible(12, 0);
		deposito.fill(6);
		assertEquals(deposito.getDepositoMax()/2,deposito.getDepositoNivel(),1);
	}
	
	@Test
	public final void testDepositoLlenarCompleto() {
		DepositoCombustible deposito2 = new DepositoCombustible(12, 0);
		deposito2.fill(12);
		assertEquals(deposito2.getDepositoNivel(),12,1);
	}
	
	@Test
	public final void testDepositoLlenarNegativo() {
		DepositoCombustible deposito2 = new DepositoCombustible(12, 0);
		deposito2.fill(-12);
		assertEquals(deposito2.getDepositoNivel(),-12,1);
	}
}
