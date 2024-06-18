package com.gilbertomorales.atividade14;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(String nome, String telefone) {
        if (nome == null || nome.isEmpty() || telefone == null || telefone.isEmpty()) {
            throw new IllegalArgumentException("Nome ou telefone inválidos.");
        }
        contatos.add(new Contato(nome, telefone));
    }

    private class Contato {
        private String nome;
        private String telefone;

        public Contato(String nome, String telefone) {
            this.nome = nome;
            this.telefone = telefone;
        }

        @SuppressWarnings("unused")
		public String getNome() {
            return nome;
        }

        @SuppressWarnings("unused")
		public String getTelefone() {
            return telefone;
        }
    }
}
