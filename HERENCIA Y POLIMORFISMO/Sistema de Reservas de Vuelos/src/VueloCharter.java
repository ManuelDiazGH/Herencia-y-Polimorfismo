class VueloCharter extends Vuelo {
    int precioTotal;

    public VueloCharter(int numeroVuelo, String origen, String destino, String fecha, int precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    @Override
    double calcularPrecio() {
        return precioTotal;
    }
}