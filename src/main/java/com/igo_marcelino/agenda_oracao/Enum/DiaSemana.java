package com.igo_marcelino.agenda_oracao.Enum;

public enum DiaSemana {
    SABADO("sabado"),
    DOMINGO("domingo");

    private final String diaSemana;

    DiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getDiaSemana() {
        return diaSemana;
    }
}
