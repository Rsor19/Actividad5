package ej1;

import java.util.ArrayList;
import java.util.List;

public final class GestorTurnos {
    private static GestorTurnos instance;
    private int contador = 0;
    private List<Turno> listaTurnos;

    public GestorTurnos(int contador) {
        this.contador = contador;
        this.listaTurnos = new ArrayList<>();
    }
    public static GestorTurnos getInstance(){
        if(instance == null){
            instance = new GestorTurnos(0);
        }
        return instance;
    }
    public int pasarTurno(){
        return contador ++;
    }
}
