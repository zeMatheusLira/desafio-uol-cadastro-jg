package com.app.desafiouolcadastrojg.model;

import com.app.desafiouolcadastrojg.model.enums.GrupoCodinome;

public record Jogador(
        String nome,
        String email,
        String telefone,
        String codinome,
        GrupoCodinome grupoCodinome

) {
}
