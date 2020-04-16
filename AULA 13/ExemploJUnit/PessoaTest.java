import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PessoaTest.
 *
 * @author  Thiago Cury
 * @version 1.0
 */
public class PessoaTest {
   
    private Pessoa pessoa = new Pessoa();
    
    public PessoaTest() {
        pessoa.setIdade(20);
    }
    
    @Before
    public void setUp() {
        pessoa.setIdade(20);
        System.out.println("passou no setUp");
    }
    
    @After
    public void tearDown() {
        System.out.println("passou no tearDown");
    }

    @Test
    public void testCalcularIdadeMeses() {
                  //valor esperado , valor retornado
        System.out.println("calcularIdadeMeses: " + pessoa.getIdade());
        assertEquals(240, pessoa.calcularIdadeMeses());
        pessoa.setIdade(30);
        System.out.println("calcularIdadeMeses: " + pessoa.getIdade());        
        assertEquals(360, pessoa.calcularIdadeMeses());
    }
    
    @Test
    public void testCalcularIdadeSemanas() {
        assertEquals(960, pessoa.calcularIdadeSemanas()); 
    }
    
    @Test 
    public void testCalcularIdadeComRotacaoDaTerra() {
        assertEquals(40, pessoa.calcularIdadeComRotacaoDaTerra(2));
    }
    
    @Test
    public void testCalcularIdadeMaisNome() {
        assertEquals("thiago20", pessoa.calcularIdadeMaisNome("thiago"));   
    }

    @Test
    public void testCalcularIdadeVirgula() {
        assertEquals(21.0, pessoa.calcularIdadeVirgula(), 2.0);
    }
    
}
