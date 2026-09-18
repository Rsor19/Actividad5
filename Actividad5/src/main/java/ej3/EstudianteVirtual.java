package ej3;

public class EstudianteVirtual extends Estudiante {
    private String enlaceReunion;
    private String plataformaStreaming;

    public EstudianteVirtual(String nombre, String id, Perfil perfil, String enlaceReunion, String plataformaStreaming) {
        super(nombre, id, perfil);
        this.enlaceReunion = enlaceReunion;
        this.plataformaStreaming = plataformaStreaming;
    }

    public String getEnlaceReunion() { return enlaceReunion; }
    public void setEnlaceReunion(String enlaceReunion) { this.enlaceReunion = enlaceReunion; }
    public String getPlataformaStreaming() { return plataformaStreaming; }
    public void setPlataformaStreaming(String plataformaStreaming) { this.plataformaStreaming = plataformaStreaming; }
}
