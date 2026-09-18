package ej3;

public class EstudiantePresencial extends Estudiante {
    private String sede;
    private String salon;

    public EstudiantePresencial(String nombre, String id, Perfil perfil, String sede, String salon) {
        super(nombre, id, perfil);
        this.sede = sede;
        this.salon = salon;
    }

    public String getSede() { return sede; }
    public void setSede(String sede) { this.sede = sede; }
    public String getSalon() { return salon; }
    public void setSalon(String salon) { this.salon = salon; }
}
