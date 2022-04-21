public class SpaceShip {
    private String nombre;
    private String matriculaGalatica;
    private int aceleracion;
    private int velocidadX = 0;
    private int velocidadY = 0;
    private int coordenadaX = 0;
    private int coordenadaY = 0;
    private int direccionX = 0;
    private int direccionY = 0;
    private int ejeSeleccionado;

    // Constructor (nombre, matriculaGalactica, aceleracion y ejeSeleccionado)
    public SpaceShip(String nombre, String matriculaGalatica, int aceleracion, int ejeSeleccionado) {
        this.nombre = nombre;
        this.matriculaGalatica = matriculaGalatica;
        this.aceleracion = aceleracion;
        this.ejeSeleccionado = ejeSeleccionado;
    }

    // Método speedUp()
    public void speedUp() {
        if (getEjeSeleccionado() == 0) {
            velocidadX += aceleracion;
            coordenadaX += velocidadX;

            System.out.println("Acelerando en el eje X");
            System.out.println("Velocidad X actual: " + velocidadX + " km/h");
            System.out.println("Coordenadas actuales: X: " + coordenadaX + " , Y: " + coordenadaY);

        } else if (getEjeSeleccionado() == 1) {
            velocidadY += aceleracion;
            coordenadaY += velocidadY;

            System.out.println("Acelerando en el eje Y");
            System.out.println("Velocidad Y actual: " + velocidadY + " km/h");
            System.out.println("Coordenadas actuales: X: " + coordenadaX + " , Y: " + coordenadaY);

        } else if (getEjeSeleccionado() == 2){
            velocidadX += aceleracion;
            velocidadY += aceleracion;
            coordenadaX += velocidadX;
            coordenadaY += velocidadY;

            System.out.println("Acelerando en los ejes X e Y");
            System.out.println("Velocidad X actual: " + velocidadX + " km/h");
            System.out.println("Velocidad Y actual: " + velocidadY + " km/h");
            System.out.println("Coordenadas actuales: X: " + coordenadaX + " , Y: " + coordenadaY);

        } else {
            System.out.println("ERROR: debes introducir X (0), Y (1) o ambos (2)");
        }
    }

    // Método brake
    public void brake() {
        if (getEjeSeleccionado() == 0) {
            velocidadX -= aceleracion;

            System.out.println("Se está frenando la nave en el eje X");
            System.out.println("Velocidad X actual: " + velocidadX + " km/h");

        } else if (getEjeSeleccionado() == 1) {
            velocidadY -= aceleracion;

            System.out.println("Se está frenando la nave en el eje Y");
            System.out.println("Velocidad Y actual: " + velocidadY + " km/h");

        } else if (getEjeSeleccionado() == 2) {
            velocidadX -= aceleracion;
            velocidadY -= aceleracion;
            System.out.println("Se está frenando la nave en ambos ejes");

            System.out.println("Velocidad X actual: " + velocidadX + " km/h");
            System.out.println("Velocidad Y actual: " + velocidadY + " km/h");

        } else {
            System.out.println("ERROR: debes introducir X (0), Y (1) o ambos (2)");
        }
    }

    // Método emergencyStop
    public void emergencyStop() {
        System.out.println("ALERTA: La nave se frenará en seco inmediatamente");
        velocidadX = 0;
        velocidadY = 0;
        System.out.println("La nave se ha frenado de manera satisfactoria");
        System.out.println("Velocidad X: " + velocidadX + "km/h");
        System.out.println("Velocidad Y: " + velocidadY + "km/h");
        System.out.println("Coordenadas actuales: X: " + coordenadaX + " , Y: " + coordenadaY);
    }

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatriculaGalatica() {
        return matriculaGalatica;
    }

    public void setMatriculaGalatica(String matriculaGalatica) {
        this.matriculaGalatica = matriculaGalatica;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getVelocidadX() {
        return velocidadX;
    }

    public void setVelocidadX(int velocidadX) {
        this.velocidadX = velocidadX;
    }

    public int getVelocidadY() {
        return velocidadY;
    }

    public void setVelocidadY(int velocidadY) {
        this.velocidadY = velocidadY;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public int getDireccionX() {
        return direccionX;
    }

    public void setDireccionX(int direccionX) {
        this.direccionX = direccionX;
    }

    public int getDireccionY() {
        return direccionY;
    }

    public void setDireccionY(int direccionY) {
        this.direccionY = direccionY;
    }

    public int getEjeSeleccionado() {
        return ejeSeleccionado;
    }

    public void setEjeSeleccionado(int ejeSeleccionado) {
        this.ejeSeleccionado = ejeSeleccionado;
    }

    // Método toString sobrecargado
    @Override
    public String toString() {
        return "       (=========)\n" +
                "       |=========|\n" +
                "       |====_====|\n" +
                "       |== / \\ ==|\n" +
                "       |= / _ \\ =|\n" +
                "    _  |=| ( ) |=|\n" +
                "   /=\\ |=|     |=| /=\\\n" +
                "   |=| |=| ESP |=| |=|\n" +
                "   |=| |=|  _  |=| |=|\n" +
                "   |=| |=| | | |=| |=|\n" +
                "   |=| |=| | | |=| |=|\n" +
                "   |=| |=| | | |=| |=|\n" +
                "   |=| |/  | |  \\| |=|\n" +
                "   |=|/    | |    \\|=|\n" +
                "   |=/MUNU |_| SOFT\\=|\n" +
                "   |(_______________)|\n" +
                "   |=| |_|__|__|_| |=|\n" +
                "   |=|   ( ) ( )   |=|\n" +
                "  /===\\           /===\\\n" +
                " |||||||         |||||||\n" +
                " -------         -------\n" +
                "Nombre: " + nombre + "\n" +
                "Matrícula galáctica: " + matriculaGalatica + "\n" +
                "Aceleración: " + aceleracion + "\n" +
                "Coordenadas actuales: X: " + coordenadaX + " Y: " + coordenadaY;
    }

}
