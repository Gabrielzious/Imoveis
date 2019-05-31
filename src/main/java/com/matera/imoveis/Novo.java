package com.matera.imoveis;

import com.matera.excecoes.PrecoImovelMuitoBaixoException;

public class Novo extends Imovel {

    public Novo(String endereco, Double preco) throws PrecoImovelMuitoBaixoException {
            super(endereco,preco * new Double(1.25));
        }


    }

//    @Override
//    public int compareTo( Novo temp) {
//        //Novo objeto = (Novo) temp;
//
//        return new Integer(this.preco).compareTo(temp.getPreco());

//        if (this.preco > temp.preco) {
//            return 1;
//        } else if (this.preco < temp.preco) {
//            return -1;
//        } else {
//            return 0;
//        }

