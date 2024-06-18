package com.gilbertomorales.atividade9;

public class BancoDeDados implements AcessoDados {
    @Override
    public void conectar() {
        System.out.println("Conectado ao banco de dados.");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectado do banco de dados.");
    }

    @Override
    public void inserir() {
        System.out.println("Dados inseridos.");
    }

    @Override
    public void atualizar() {
        System.out.println("Dados atualizados.");
    }

    @Override
    public void excluir() {
        System.out.println("Dados excluídos.");
    }
}