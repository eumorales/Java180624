package com.gilbertomorales.atividade2;

public abstract class Conta {
	
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public abstract void atualizarSaldo();
}
