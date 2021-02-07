
public class DepositoCombustible {
import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

	public class DepositoCombustibleTest {

		DepositoCombustible depositoCombustible;


		@Before
		public void testValorInicial() {
			depositoCombustible = new DepositoCombustible(40,10);
		}

		@After
		public void finPruebas(){
			depositoCombustible=null;
		}

		@Test
		public void testGetNivel() {
			assertEquals(10,depositoCombustible.getDepositoNivel(),0);
		}

		@Test
		public void testGetDepositoMax() {
			assertEquals(40,depositoCombustible.getDepositoMax(),0);
		}

		@Test
		public void testEmpty() {
			assertFalse(depositoCombustible.estaVacio());
		}

		@Test
		public void testFull() {
			assertFalse(depositoCombustible.estaLleno());
		}

		@Test
		public void testFill() {
			assertEquals(20,(depositoCombustible.getDepositoMax()/2),0);
		}

		@Test
		public void testConsumir() {
			assertEquals(10,depositoCombustible.getDepositoNivel(),0);
		}

	}