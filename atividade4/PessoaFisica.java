package com.gilbertomorales.atividade4;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void efetuarCompra() {
        System.out.println("Pessoa física efetuando compra.");
    }
}