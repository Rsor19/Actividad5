package ej1;

import java.util.List;

public class Hospital {
    private String nombre;
    private List<Turno> listaTurnos;
    private List<Paciente> listaPacientes;

    public Hospital(String nombre, List<Turno> listaTurnos, List<Paciente> listaPacientes) {
        this.nombre = nombre;
        this.listaTurnos = listaTurnos;
        this.listaPacientes = listaPacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public void asignarTurno(){

    }
}
