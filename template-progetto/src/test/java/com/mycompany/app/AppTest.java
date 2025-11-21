package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testaDipendente(){
        Dipendente d1 = new Dipendente(Dipendente.ruoli.Frontend, "Luca", "Rossi", 2500);
        assertEquals("Luca", d1.getNome());
        d1.setNome("Giorgio");
        assertEquals("Giorgio", d1.getNome());
    }

}
