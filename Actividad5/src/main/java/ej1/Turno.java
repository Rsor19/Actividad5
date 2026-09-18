package ej1;

import java.time.LocalDate;

public class Turno {
    private int numero;
    private LocalDate hora;

    public Turno(int numero, LocalDate hora) {
        this.numero = numero;
        this.hora = hora;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }
}
