package ej5;

import java.util.ArrayList;
import java.util.List;


public class EmpresaMovilidad {
    private List vehiculos;

    public EmpresaMovilidad() {
        this.vehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo v) {
        this.vehiculos.add(v);
    }
}
