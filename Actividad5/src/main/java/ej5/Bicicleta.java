package ej5;

public class Bicicleta extends Vehiculo {

    public Bicicleta(String tipo, String placa) {
        super(tipo, placa, null, 0, null);
    }

    @Override
    public Vehiculo clonar() {
        return new Bicicleta(this.tipo, this.placa);
    }
}
