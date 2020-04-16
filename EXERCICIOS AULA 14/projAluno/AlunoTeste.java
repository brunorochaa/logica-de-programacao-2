import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * A classe de teste AlunoTeste.
 *
 * @author (Bruno Rocha)
 * @version 1.0
 * @since 03/04/2020 - 04:40
 */
public class AlunoTeste {
    Aluno aluno = new Aluno();
    /**
     * Construtor default para a classe de teste AlunoTeste
     */
    public AlunoTeste() {
        aluno.setNome("Bruno");
        aluno.setSobrenome("Rocha");
        aluno.setNota1(10);
        aluno.setNota2(10);
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
    
    @Test
    public void calcularMedia() {
         assertEquals(10.0, aluno.calcularMedia(), 0.0);
    }
}