package tasks.Restaurant;


//clase mesa
class Mesa {
    private int numeroMesa;
    private boolean ocupada;
    private Orden orden;

    public Mesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        this.ocupada = false;
        this.orden = new Orden();
    }

    public int getTableNumber() {
        return numeroMesa;
    }

    public boolean ocupado() {
        return ocupada;
    }

    public Orden getOrder() {
        return orden;
    }

    public void ocupar() {
        ocupada = true;
    }

    public void vacante() {
        ocupada = false;
        orden = new Orden();

    }


}
