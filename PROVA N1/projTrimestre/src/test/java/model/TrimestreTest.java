package model;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
/**
 * A classe de teste TrimestreTeste.
 *
 * @author (Bruno Rocha)
 * @version 1.0
 * @since 09/04/2020 - 08:22
 */
class TrimestreTest {
    Trimestre trimestre = new Trimestre();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        trimestre.setMes("janeiro");
        /*
        trimestre.setMes("fevereiro");
        trimestre.setMes("março");
        trimestre.setMes("abril");
        trimestre.setMes("maio");
        trimestre.setMes("junho");
        trimestre.setMes("julho");
        trimestre.setMes("agosto");
        trimestre.setMes("setembro");
        trimestre.setMes("outubro");
        trimestre.setMes("novembro");
        trimestre.setMes("dezembro");
        */
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void verificarTrimestre() {
        assertEquals("1º Trimestre", trimestre.verificarTrimestre());
        /*
        assertEquals("1º Trimestre", trimestre.verificarTrimestre());
        assertEquals("1º Trimestre", trimestre.verificarTrimestre());
        assertEquals("2º Trimestre", trimestre.verificarTrimestre());
        assertEquals("2º Trimestre", trimestre.verificarTrimestre());
        assertEquals("2º Trimestre", trimestre.verificarTrimestre());
        assertEquals("3º Trimestre", trimestre.verificarTrimestre());
        assertEquals("3º Trimestre", trimestre.verificarTrimestre());
        assertEquals("3º Trimestre", trimestre.verificarTrimestre());
        assertEquals("4º Trimestre", trimestre.verificarTrimestre());
        assertEquals("4º Trimestre", trimestre.verificarTrimestre());
        assertEquals("4º Trimestre", trimestre.verificarTrimestre());
        */
    }
}