package model;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Escreva a descrição da classe Posto aqui.
 *
 * @authors (Bruno Rocha, Peterson Peres e Thiago Dias)
 * @version 1.0
 * @since 09/04/2020 - 09:26
 */
class PostoTest {
    Posto posto = new Posto();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        posto.setCodigo((byte) 1);
        /*
        posto.setCodigo((byte)2);
        posto.setCodigo((byte)3);
        */
        posto.setLitros(1.00);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void calcularValorASerPago() {
        assertEquals(4.40, posto.calcularValorASerPago(), 0.0);
        /*
        assertEquals(3.68, posto.calcularValorASerPago(), 0.0);
        assertEquals(3.71, posto.calcularValorASerPago(), 0.0);
        */
    }

    @org.junit.jupiter.api.Test
    void tipoDeCombustivel() {
        assertEquals("Gasolina", posto.tipoDeCombustivel());
    }
}