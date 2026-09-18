package ej4;


import java.util.ArrayList;
import java.util.List;

class BibliotecaDigital {
    private String nombre;
    private String correo;
    private List<Libro> listaLibros;

    public BibliotecaDigital(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.listaLibros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void registrarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public Libro obtenerCopiaPersonalizada(int indice) {
        if (indice >= 0 && indice < listaLibros.size()) {
            Libro original = listaLibros.get(indice);
            CopiaPersonalizada copia = new CopiaPersonalizada(original);
            return (Libro) copia.personalizarCopia();
        }
        return null;
    }
}