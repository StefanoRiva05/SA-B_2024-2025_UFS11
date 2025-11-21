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

    @Test
    public void testAgggiuntaDipendente(){
        Dipendente d1 = new Dipendente(Dipendente.ruoli.Backend, "Mario", "Verdi", 1500);
        Azienda a =  Azienda.getAzienda("IBM");
        a.aggiungiDipendente(d1);
        assertEquals(1, a.getListaDipendenti().size());
    }

    @Test(expected= java.lang.AssertionError.class)
    public void testSingleton(){
        Azienda a = Azienda.getAzienda("IBM");
        assertEquals(1, a.getListaDipendenti().size());
    }



}
