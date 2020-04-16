import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * A classe de teste PesoIdealTeste.
 *
 * @author (Bruno Rocha)
 * @version 1.0
 * @since 03/04/2020 - 06:10
 */
public class PesoIdealTeste {
    PesoIdeal pesoIdeal = new PesoIdeal();
    /**
     * Construtor default para a classe de teste AlunoTeste
     */
    public PesoIdealTeste() {
        pesoIdeal.setCodigo(1);
        pesoIdeal.setNome("Bruno");
        pesoIdeal.setAltura(1.75);
        pesoIdeal.setPeso(80);
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