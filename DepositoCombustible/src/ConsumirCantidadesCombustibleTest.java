import static org.junit.Assert.*;

import org.junit.Test;

public class ConsumirCantidadesCombustibleTest {
	
	@Test
	public final void testDepositoConsumirMitad() {
		DepositoCombustible deposito = new DepositoCombustible(12, 0);
		deposito.consumir(6);
		assertEquals(deposito.getDepositoMax()/2,6,1);
	}
	
	@Test
	public final void testDepositoConsumirCompleto() {
		DepositoCombustible deposito2 = new DepositoCombustible(12, 12);
		deposito2.consumir(12);
		assertEquals(deposito2.getDepositoNivel(),0,1);
	}
	
	@Test
	public final void testDepositoConsumirNegativo() {
		DepositoCombustible deposito2 = new DepositoCombustible(12, 12);
		deposito2.consumir(-12);
		assertEquals(deposito2.getDepositoNivel(),24,1);
	}
	
}
