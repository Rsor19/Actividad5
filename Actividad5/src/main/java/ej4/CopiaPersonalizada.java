package ej4;

class CopiaPersonalizada {
    private Clonable copiable;

    public CopiaPersonalizada(Clonable copiable) {
        this.copiable = copiable;
    }

    public Clonable getCopiable() {
        return copiable; }
    public void setCopiable(Clonable copiable) {
        this.copiable = copiable; }

    public Clonable personalizarCopia() {
        return copiable.clone();
    }
}


