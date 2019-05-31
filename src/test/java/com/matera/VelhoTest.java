package com.matera;

import com.matera.excecoes.PrecoImovelMuitoBaixoException;
import com.matera.imoveis.Imovel;
import com.matera.imoveis.Novo;
import com.matera.imoveis.Velho;


import org.junit.Assert;
import org.junit.Test;

public class VelhoTest {

    @Test
    public void testValorReduzidoDoVelho() throws PrecoImovelMuitoBaixoException {
        Imovel velho = new Velho("rua whatever", 10_000);

        Assert.assertEquals(new Double (8000), velho.getPreco());

    }


    @Test
    public void testPrecoMuitoBaixo() throws PrecoImovelMuitoBaixoException {
        Imovel velho1 = new Velho("Rua Santana", 356000);
        Assert.assertEquals("Rua Santana", velho1.getEndereco());
    }

    @Test (expected= PrecoImovelMuitoBaixoException.class)
    public void testPrecoNegativo() throws PrecoImovelMuitoBaixoException {
        Imovel velho2 = new Velho("Rua Santana",10000 );
    }
}