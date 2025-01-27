package com.igo_marcelino.agenda_oracao.entities;

import com.igo_marcelino.agenda_oracao.Enum.DiaSemana;
import com.igo_marcelino.agenda_oracao.Enum.Horarios;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_agenda;
    @Enumerated(EnumType.STRING)
    private Horarios horario;
    @Enumerated(EnumType.STRING)
    private DiaSemana diaSemana;

    public Agenda() {
    }

    public Agenda(Integer id_agenda ,Integer id_pessoa, Horarios horario, DiaSemana diaSemana) {
        this.id_agenda = id_agenda;
        this.horario = horario;
        this.diaSemana = diaSemana;
    }

    public Integer getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(Integer id_agenda) {
        this.id_agenda = id_agenda;
    }

    public Horarios getHorario() {
        return horario;
    }

    public void setHorario(Horarios horario) {
        this.horario = horario;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Agenda agenda = (Agenda) o;
        return Objects.equals(id_agenda, agenda.id_agenda) && horario == agenda.horario && diaSemana == agenda.diaSemana;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_agenda, horario, diaSemana);
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "id_agenda=" + id_agenda +
                ", horario=" + horario +
                ", diaSemana=" + diaSemana +
                '}';
    }
}
