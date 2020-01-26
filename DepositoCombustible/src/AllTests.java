import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ConsumirCantidadesCombustibleTest.class, DepositoLLenoALaMitadTest.class, DepositoVacioTest.class,
		LlenarCantidadesCombustibleTest.class, MaximaCapacidadDepositoTest.class, ValorActualDepositoTest.class })
public class AllTests {

}
