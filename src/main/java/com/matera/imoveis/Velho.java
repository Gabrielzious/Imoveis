package com.matera.imoveis;

import com.matera.excecoes.PrecoImovelMuitoBaixoException;

public class Velho extends Imovel {


    public Velho(String endereco, float preco)  throws PrecoImovelMuitoBaixoException {
        super(endereco,preco * new Double(0.80));
    }

    public String toString() {
        return preco + " : " + endereco;
    }

//    @Override
//    public int compareTo(Object temp) {
//       Novo objeto = (Novo) temp;
//        if (getPreco() > objeto.getPreco()) {
//            return 1;
//        } else if (getPreco() < objeto.preco) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
}
