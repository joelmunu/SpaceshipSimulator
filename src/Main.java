import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        int tipoNave = 2;
        int eje = 2;
        int Ncontenerdores = 0;
        SpaceShip nave = new SpaceShip("", "", 0, 0);
        Cargo cargo = new Cargo("", "", 0, 0, 0);

        while (salir == false) {
            System.out.println("");
            System.out.println("****************** MENÚ ******************");
            System.out.println("1.- Crear una nueva nave");
            System.out.println("2.- Mostrar el AsciiArt de la nave");
            System.out.println("3.- Acelerar la nave");
            System.out.println("4.- Frenar la nave");
            System.out.println("5.- Realizar una parada de emergencia");
            System.out.println("6.- Cargar la nave cargo");
            System.out.println("7.- Descargar la nave cargo");
            System.out.println("8.- Salir");
            System.out.println("*******************************************");
            System.out.print("Selecciona una opción del menú: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("");
            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.print("¿Qué tipo de nave quieres crear? 0 = Nave de pasajeros 1 = Nave de tipo Cargo ");
                    tipoNave = sc.nextInt();
                    sc.nextLine();

                    if (tipoNave == 0) {
                        System.out.print("Escribe el nombre de la nave: ");
                        String nombre = sc.nextLine();

                        System.out.print("Indica la matrícula de la nave: ");
                        String matricula = sc.nextLine();

                        System.out.print("Indica la aceleración que tendrá la nave: ");
                        int aceleracion = sc.nextInt();
                        sc.nextLine();

                        nave.setNombre(nombre);
                        nave.setMatriculaGalatica(matricula);
                        nave.setAceleracion(aceleracion);

                    } else if (tipoNave == 1) {
                        System.out.print("Escribe el nombre de la nave: ");
                        String nombre = sc.nextLine();

                        System.out.print("Indica la matrícula de la nave: ");
                        String matricula = sc.nextLine();

                        System.out.print("Indica la aceleración que tendrá la nave: ");
                        int aceleracion = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Indica la capacidad máxima de la nave de tipo cargo: ");
                        int cargaMax = sc.nextInt();
                        sc.nextLine();

                        cargo.setNombre(nombre);
                        cargo.setMatriculaGalatica(matricula);
                        cargo.setAceleracion(aceleracion);
                        cargo.setCargaMaxima(cargaMax);

                    } else {
                        System.out.println("ERROR: Debes introducir una opción valida");
                    }
                    break;

                case 2:
                    if (tipoNave == 1 || tipoNave == 0) {
                        System.out.print(nave);
                    } else {
                        System.out.println("Aún no has creado ninguna nave");
                    }
                    break;

                case 3:
                    if (tipoNave == 0 || tipoNave == 1) {
                        System.out.print("Selecciona un eje X: 0, Y: 1 ");
                        eje = sc.nextInt();
                        sc.nextLine();
                        nave.setEjeSeleccionado(eje);
                        nave.speedUp();
                    } else {
                        System.out.println("Aún no has creado ninguna nave");
                    }
                    break;

                case 4:
                    if (tipoNave == 0 || tipoNave == 1) {
                        System.out.print("Selecciona un eje X: 0, Y: 1 ");
                        eje = sc.nextInt();
                        sc.nextLine();
                        nave.setEjeSeleccionado(eje);
                        nave.brake();
                    } else {
                        System.out.println("Aún no has creado ninguna nave");
                    }
                    break;

                case 5:
                    if (tipoNave == 0 || tipoNave == 1) {
                        nave.emergencyStop();
                    } else {
                        System.out.println("Aún no has creado ninguna nave");
                    }
                    break;

                case 6:
                    if (tipoNave == 1) {
                        System.out.print("¿Cuántos contenedores vas a cargar? ");
                        Ncontenerdores = sc.nextInt();
                        sc.nextLine();
                        cargo.setContenedoresACargar(Ncontenerdores);
                        cargo.load();
                    } else if (tipoNave == 2) {
                        System.out.println("Aún no has creado ninguna nave");
                    } else {
                        System.out.println("La nave que has creado no es de tipo cargo, por lo que no puede llevar contenedores");
                    }
                    break;

                case 7:
                    if (tipoNave == 1) {
                        System.out.print("¿Cuántos contenedores vas a descargar? ");
                        Ncontenerdores = sc.nextInt();
                        sc.nextLine();
                        cargo.setContenedoresACargar(Ncontenerdores);
                        cargo.unload();
                    } else if (tipoNave == 2) {
                        System.out.println("Aún no has creado ninguna nave");
                    } else {
                        System.out.println("La nave que has creado no es de tipo cargo, por lo que no puede llevar contenedores");
                    }
                    break;

                case 8:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Debes seleccionar una opción del menú");
            }
        }
    }
}
