package com.igo_marcelino.agenda_oracao.Enum;

import jakarta.persistence.Enumerated;


public enum Horarios {
    MEIA_NOITE("00:00:00"),
    UMA_HORA("00:00:00"),
    DUAS_HORAS("00:00:00"),
    TREZ_HORAS("00:00:00"),
    QUATRO_HORAS("00:00:00"),
    CINCO_HORAS("00:00:00"),
    SEIS_HORAS("00:00:00"),
    SETE_HORAS("00:00:00"),
    OITO_HORAS("00:00:00"),
    NOVE_HORAS("00:00:00"),
    DEZ_HORAS("00:00:00"),
    ONZE_HORAS("00:00:00"),
    MEIO_DIA("00:00:00"),
    TREZE_HORAS("00:00:00"),
    QUATORZE_HORAS("00:00:00"),
    QUINZE_HORAS("00:00:00"),
    DEZESEIS_HORAS("00:00:00"),
    DEZESETE_HORAS("00:00:00"),
    DEZOITO_HORAS("00:00:00"),
    DEZENOVE_HORAS("00:00:00"),
    VINTE_HORAS("00:00:00"),
    VINTE_E_UMA_HORAS("00:00:00"),
    VINTE_E_DUAS_HORAS("00:00:00"),
    VINTE_E_TREZ_HORAS("00:00:00");

    private final String horario;

    Horarios(String horas) {
        this.horario = horas;
    }

    public String getHorario() {
        return horario;
    }
}
