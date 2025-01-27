package com.igo_marcelino.agenda_oracao.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class BelongingPessoa {

    @EmbeddedId
    BelongingPessoaPK id = new BelongingPessoaPK();

    public BelongingPessoaPK getId() {
        return id;
    }

    public void setId(BelongingPessoaPK id) {
        this.id = id;
    }

    public BelongingPessoa(Pessoa pessoa, Agenda agenda) {
        id.setPessoa(pessoa);
        id.setAgenda(agenda);
    }
}
