import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public final void testValorActualDeposito() {
		DepositoCombustible deposito = new DepositoCombustible(0, 0);
		double nivelDeposito = deposito.getDepositoNivel();
		assertNotNull(nivelDeposito);
	}
	
	@Test
	public final void testMaximaCapacidadDeposito() {
		DepositoCombustible deposito = new DepositoCombustible(0, 0);
		double nivelDeposito = deposito.getDepositoMax();
		assertNotNull(nivelDeposito);
	}
	
	@Test
	public final void testDepositoVacio() {
		DepositoCombustible deposito = new DepositoCombustible(0, 0);
		boolean nivelDeposito = deposito.estaVacio();
		assertTrue(nivelDeposito);
	}
	
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
