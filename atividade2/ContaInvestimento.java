package com.gilbertomorales.atividade2;

public class ContaInvestimento extends Conta {
    @Override
    public void atualizarSaldo() {
        double saldoAtual = getSaldo();
        double rendimento = saldoAtual * 0.05;
        depositar(rendimento);
        System.out.println("Saldo após rendimento: " + getSaldo());
    }
}