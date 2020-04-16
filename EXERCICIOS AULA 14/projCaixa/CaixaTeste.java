import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * A classe de teste CaixaTeste.
 *
 * @author (Bruno Rocha)
 * @version 1.0
 * @since 03/04/2020 - 03:58
 */
public class CaixaTeste {
    Caixa caixa = new Caixa();
    /**
     * Construtor default para a classe de teste CaixaTeste
     */
    public CaixaTeste() {
        caixa.setCodigo(3);
        caixa.setQuantidade(2);
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp() {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown() {
    }
}