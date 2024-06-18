package com.gilbertomorales.atividade4;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void efetuarCompra() {
        System.out.println("Pessoa jurídica efetuando compra.");
    }
}