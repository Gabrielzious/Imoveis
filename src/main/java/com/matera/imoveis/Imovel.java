package com.matera.imoveis;

import com.matera.excecoes.ExcecaoNegativaException;
import com.matera.excecoes.PrecoImovelMuitoBaixoException;

public abstract class Imovel implements Comparable<Imovel> {

    public String endereco;
    public Double preco;

    public Imovel(String endereco, Double preco) throws PrecoImovelMuitoBaixoException {

        if(preco == null) {
            throw new IllegalArgumentException("valor preco eh obrigatorio");
        }


        this.endereco = endereco;
        if (preco < 0) {
            throw new ExcecaoNegativaException("Favor inserir numeros positivos");
        }
        else if (preco < 10000){
            throw new PrecoImovelMuitoBaixoException("O numero inserido é muito baixo.");
        }
        else{
            this.preco = preco;
        }
    }
        public String getEndereco() {
            String endereco = this.endereco;
            return endereco;

        }

        public Double getPreco() {
            return this.preco;
        }

    public void showAddress() {
        System.out.println(getPreco());
    }

    public void showValue() {
        System.out.println(getPreco());
    }



    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPreco(Double preco){
            if (this.preco < 5000) {
                throw new ExcecaoNegativaException("O preço da casa" + this.endereco + " não pode ser menor que 10000");
            }
        else{
            this.preco = preco;
        }
        }


    @Override
    public String toString() {

        return "Imovel{" +
                "endereco='" + endereco + '\'' +
                ", preco=" + preco +
                '}';
    }


    //throw new IllegalArgumentException("Saldo Insuficiente");


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Imovel imovel = (Imovel) o;

        if (endereco != null ? !endereco.equals(imovel.endereco) : imovel.endereco != null) return false;
        return preco != null ? preco.equals(imovel.preco) : imovel.preco == null;

    }

    @Override
    public int hashCode() {
        int result = endereco != null ? endereco.hashCode() : 0;
        result = 31 * result + (preco != null ? preco.hashCode() : 0);
        return result;
    }

    public int compareTo(Imovel temp) {

        return this.preco.compareTo(temp.getPreco());
    }
}