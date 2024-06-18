package com.gilbertomorales.atividade12;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        validarData();
    }

    private void validarData() {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido: " + mes);
        }

        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia inválido: " + dia);
        }

        if (mes == 2 && (dia > 29 || (dia == 29 && !isAnoBissexto()))) {
            throw new IllegalArgumentException("Dia inválido para fevereiro: " + dia);
        }

        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            throw new IllegalArgumentException("Dia inválido: " + dia);
        }
    }

    private boolean isAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}