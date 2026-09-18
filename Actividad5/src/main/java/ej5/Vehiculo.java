package ej5;

import java.util.List;

public abstract class Vehiculo implements Clonable, Construible {
    protected String tipo;
    protected String placa;
    protected String color;
    protected int capacidad;
    protected List accesorios;

    // Constructor/Evento genérico según diagrama
    public Vehiculo(String tipo, String placa, String color, int capacidad, List accesorios) {
        this.tipo = tipo;
        this.placa = placa;
        this.color = color;
        this.capacidad = capacidad;
        this.accesorios = accesorios;
    }

    // Setters implementados de Construible
    @Override
    public void setTipo(String tipo) { this.tipo = tipo; }
    @Override
    public void setPlaca(String placa) { this.placa = placa; }
    @Override
    public void setColor(String color) { this.color = color; }
    @Override
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
    @Override
    public void setAccesorios(List accesorios) { this.accesorios = accesorios; }

    // Método clonar abstracto para subclases
    @Override
    public abstract Vehiculo clonar();
}