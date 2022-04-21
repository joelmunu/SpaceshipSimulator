public class Cargo extends SpaceShip{
    private int cargaMaxima;
    private int cargaActual = 0;
    private int contenedoresACargar;

    public Cargo(String nombre, String matriculaGalatica, int aceleracion, int ejeSeleccionado, int cargaMaxima) {
        super(nombre, matriculaGalatica, aceleracion, ejeSeleccionado);
        this.cargaMaxima = cargaMaxima;
    }


    // Método load()
    public void load() {
        // Comprobación
        int contenedoresTrasCargar = cargaActual + contenedoresACargar;

        if (contenedoresTrasCargar <= cargaMaxima) {
            cargaActual += contenedoresACargar;
            System.out.println("Se han cargado " + contenedoresACargar + " contenedores en la nave, la carga actual es " + cargaActual);

        } else if (cargaActual == cargaMaxima){
            System.out.println("La nave ha alcanzado su carga máxima, no caben más contenedores");

        } else {
            System.out.println("No caben tantos contenedores en la nave");
        }
    }

    // Método unload
    public void unload() {
        // Comprobación
        int contenedoresTrasDescargar = cargaActual - contenedoresACargar;

        if (contenedoresTrasDescargar >= 0) {
            cargaActual -= contenedoresACargar;
            System.out.println("Se han descargado " + contenedoresACargar + " contenedores de la nave, la carga actual es " + cargaActual);

        } else if (cargaActual == 0){
            System.out.println("La nave ya no tiene más contenedores");

        }
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public int getContenedoresACargar() {
        return contenedoresACargar;
    }

    public void setContenedoresACargar(int contenedoresACargar) {
        this.contenedoresACargar = contenedoresACargar;
    }
}
