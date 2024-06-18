package com.gilbertomorales.atividade5;

public class Gerente extends Funcionario {
    @Override
    public void calcularSalario() {
        double salarioBase = getSalario();
        double salarioComBonus = salarioBase * 1.2;
        setSalario(salarioComBonus);
        System.out.println("Salário do gerente com bônus aplicado: " + getSalario());
    }
}