package com.gilbertomorales.atividade3;

public class Carro extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando. Vrum vrum!");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando!");
    }
}