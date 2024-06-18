package com.gilbertomorales.atividade2;

public class Main {
    public static void main(String[] args) {
        ContaInvestimento contaInvestimento = new ContaInvestimento();
        contaInvestimento.depositar(1000);
        contaInvestimento.atualizarSaldo();

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(1000);
        contaPoupanca.atualizarSaldo();
    }
}
