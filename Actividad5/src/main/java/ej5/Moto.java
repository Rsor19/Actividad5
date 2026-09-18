package ej5;

public class Moto extends Vehiculo {

    public Moto(String tipo, String placa) {
        super(tipo, placa, null, 0, null);
    }

    @Override
    public Vehiculo clonar() {
        return new Moto(this.tipo, this.placa);
    }
}
