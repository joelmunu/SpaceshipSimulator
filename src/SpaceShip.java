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

    public SpaceShip(String nombre, String matriculaGalatica, int aceleracion) {
        this.nombre = nombre;
        this.matriculaGalatica = matriculaGalatica;
        this.aceleracion = aceleracion;
    }

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

}
