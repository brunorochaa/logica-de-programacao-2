import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalculadoraTest.
 *
 * @author  Thiago Cury
 * @version 1.0
 * @since 02/04/2020 - 09:26
 */
public class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();
    
    /**
     * Default constructor for test class CalculadoraTest
     */
    public CalculadoraTest() {
        calculadora.setNumero1(10);
        calculadora.setNumero2(5);        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }
    
    @Test
    public void testSomar() {
        assertEquals(15.0, calculadora.somar(), 0.0);
    }
    
    @Test
    public void testSubtrair() {
        assertEquals(5.0, calculadora.subtrair(), 0.0);
    }    
    
    @Test
    public void testDividir() {
        assertEquals(2.0, calculadora.dividir(), 0.0);
    }        
    
    @Test
    public void testMultiplicar() {
        assertEquals(50.0, calculadora.multiplicar(), 0.0);
    }            
}
