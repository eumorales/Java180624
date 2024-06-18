package com.gilbertomorales.atividade3;

public class Moto extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Moto acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Moto freando...");
    }
}