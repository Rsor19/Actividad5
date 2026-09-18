package ej5;

public class Carro extends Vehiculo {

    public Carro(String tipo, String placa) {
        super(tipo, placa, null, 0, null);
    }

    @Override
    public Vehiculo clonar() {
        return new Carro(this.tipo, this.placa);
    }
}
