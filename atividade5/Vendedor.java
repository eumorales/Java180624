package com.gilbertomorales.atividade5;

public class Vendedor extends Funcionario {
    @Override
    public void calcularSalario() {
        System.out.println("Salário do vendedor: " + getSalario());
    }
}