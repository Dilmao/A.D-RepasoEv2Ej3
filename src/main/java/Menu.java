import libs.Leer;

public class Menu {
    public static void main(String[] args) {
        boolean salir = false;
        String opcion;

        while (!salir) {
            System.out.println("*****************************************************************");
            System.out.println("0. Salir");
            System.out.println("1. Ejecutar LAMBDA");
            System.out.println("*****************************************************************");
            opcion = Leer.pedirCadena("Introduzca una opcion");

            switch (opcion) {
                case "0" -> {}
                case "1" -> {}
                default -> System.out.println("Opción no valida");
            }
        }
    }
}
