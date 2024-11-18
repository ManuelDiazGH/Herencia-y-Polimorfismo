class VueloRegular extends Vuelo {
    int numeroAsientos;

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    double calcularPrecio() {
        double precioBase = 100; // Precio base por asiento
        return precioBase * numeroAsientos;
    }
}