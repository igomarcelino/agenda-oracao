package com.igo_marcelino.agenda_oracao.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPessoaPK {

    @ManyToOne
    @JoinColumn(name = "id_agenda")
    private Agenda agenda;

    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;

    public BelongingPessoaPK() {
    }

    public BelongingPessoaPK(Agenda agenda, Pessoa pessoa) {
        this.agenda = agenda;
        this.pessoa = pessoa;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPessoaPK that = (BelongingPessoaPK) o;
        return Objects.equals(agenda, that.agenda) && Objects.equals(pessoa, that.pessoa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agenda, pessoa);
    }
}
