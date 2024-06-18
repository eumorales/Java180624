package com.gilbertomorales.atividade2;

public class ContaPoupanca extends Conta {
    @Override
    public void atualizarSaldo() {
        double saldoAtual = getSaldo();
        double juros = saldoAtual * 0.03;
        depositar(juros);
        System.out.println("Saldo após juros: " + getSaldo());
    }
}
