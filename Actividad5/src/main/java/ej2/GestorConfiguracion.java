package ej2;

import java.util.ArrayList;
import java.util.List;

public class GestorConfiguracion {
    // Instancia única (Singleton)
    private static GestorConfiguracion instancia;
    private List<ConfiguracionGlobal> listaConfiguraciones;

    // Constructor privado para el patrón Singleton
    private GestorConfiguracion() {
        this.listaConfiguraciones = new ArrayList<>();
    }

    // Método para obtener la instancia única
    public static GestorConfiguracion obtenerInstancia() {
        if (instancia == null) {
            instancia = new GestorConfiguracion();
        }
        return instancia;
    }

    public void agregarConfiguracion(ConfiguracionGlobal configuracion) {
        this.listaConfiguraciones.add(configuracion);
    }

    public List<ConfiguracionGlobal> getListaConfiguraciones() {
        return listaConfiguraciones;
    }

    public void setListaConfiguraciones(List<ConfiguracionGlobal> listaConfiguraciones) {
        this.listaConfiguraciones = listaConfiguraciones;
    }
}
