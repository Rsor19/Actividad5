package ej2;

public class Jugador {
    private String nombre;
    private GestorConfiguracion gestor;

    public Jugador(String nombre, GestorConfiguracion gestor) {
        this.nombre = nombre;
        this.gestor = gestor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GestorConfiguracion getGestor() {
        return gestor;
    }

    public void setGestor(GestorConfiguracion gestor) {
        this.gestor = gestor;
    }
}
