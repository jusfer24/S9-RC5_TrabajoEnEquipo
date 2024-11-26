import java.util.Scanner;

public class MainReserva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un hotel con diferentes tipos de habitaciones
        Hotel hotel = new Hotel("Hotel el Encanto");

        // Menú de opciones
        System.out.println("°| * Bienvenido a  " + hotel.getNombre() + " * |°");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Habitaciones disponibles");
        System.out.println("2. Reservar ");
        System.out.println("3. Liberar ");
        System.out.println("4. Salir");

        int opcion;
        do {
            System.out.print("\nSeleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Ver habitaciones disponibles
                    System.out.println("Habitaciones disponibles en el " + hotel.getNombre() + ":");
                    System.out.println(hotel.getHabitacion1());
                    System.out.println(hotel.getHabitacion2());
                    System.out.println(hotel.getHabitacion3());
                    break;

                case 2: // Reservar habitación
                    System.out.println("Seleccione el tipo de habitación a reservar:");
                    System.out.println("1. Económica");
                    System.out.println("2. Familiar");
                    System.out.println("3. V.I.P.");
                    int tipoHabitacion = scanner.nextInt();
                    System.out.print("Ingrese la cantidad de habitaciones a reservar: ");
                    int cantidad = scanner.nextInt();

                    switch (tipoHabitacion) {
                        case 1:
                            hotel.getHabitacion1().reservarHabitacion(cantidad);
                            break;
                        case 2:
                            hotel.getHabitacion2().reservarHabitacion(cantidad);
                            break;
                        case 3:
                            hotel.getHabitacion3().reservarHabitacion(cantidad);
                            break;
                        default:
                            System.out.println("Selección inválida.");
                    }
                    break;

                case 3: // Liberar habitación
                    System.out.println("Seleccione el tipo de habitación a liberar:");
                    System.out.println("1. Económica");
                    System.out.println("2. Estándar");
                    System.out.println("3. De lujo");
                    int tipoLiberar = scanner.nextInt();
                    System.out.print("Ingrese la cantidad de habitaciones a liberar: ");
                    int cantidadLiberar = scanner.nextInt();

                    switch (tipoLiberar) {
                        case 1:
                            hotel.getHabitacion1().liberarHabitacion(cantidadLiberar);
                            break;
                        case 2:
                            hotel.getHabitacion2().liberarHabitacion(cantidadLiberar);
                            break;
                        case 3:
                            hotel.getHabitacion3().liberarHabitacion(cantidadLiberar);
                            break;
                        default:
                            System.out.println("Selección inválida.");
                    }
                    break;

                case 4: // Salir
                    System.out.println("Gracias por usar el sistema de reservas. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}
