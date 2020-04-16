package model;
import static org.junit.jupiter.api.Assertions.*;
/**
 * A classe de teste TrimestreTeste.
 *
 * @author (Bruno Rocha)
 * @version 1.0
 * @since 09/04/2020 - 10:41
 */
class NadadorTest {
    Nadador nadador = new Nadador();
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        nadador.setIdade((byte)7);
        /*nadador.setIdade((byte)8);
        nadador.setIdade((byte)11);
        nadador.setIdade((byte)18);*/
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void verificarCategoria() {
        assertEquals("Não pode competir ainda! Idade mínima é de 8 anos.", nadador.verificarCategoria());
        /*assertEquals("Infantil", nadador.verificarCategoria());
        assertEquals("Juvenil", nadador.verificarCategoria());
        assertEquals("Adulto", nadador.verificarCategoria());*/
    }
}