package test.com.coursera.tdd;

import main.java.com.coursera.tdd.Pilha;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PilhaTest {

    @Test
    public void pilhaVazia() {
        Pilha p = new Pilha();
        assertTrue(p.estaVazia());
        assertEquals(0, p.tamanho());
    }

    @Test
    public void empilhaUmElemento() {
        Pilha p = new Pilha();
        p.empilha("primeiro");
        assertFalse(p.estaVazia());
        assertEquals(1, p.tamanho());
        assertEquals("primeiro", p.topo());

    }
}
