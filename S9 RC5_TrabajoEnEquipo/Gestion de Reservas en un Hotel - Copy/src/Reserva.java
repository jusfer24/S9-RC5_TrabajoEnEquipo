public class Reserva {
    private Hotel hotel;

    public Reserva(Hotel hotel) {
        this.hotel = hotel;
    }

    public void reservarHabitacion(String nivel, int cantidad) {
        Habitacion habitacion = obtenerHabitacionPorNivel(nivel);
        if (habitacion != null) {
            if (cantidad <= habitacion.getCantidadHabitaciones()) {
                habitacion.reservarHabitacion(cantidad);
            } else {
                System.out.println("No hay suficientes habitaciones disponibles en el nivel " + nivel + ".");
            }
        } else {
            System.out.println("El nivel de habitación no existe.");
        }
    }


    public void liberarHabitacion(String nivel, int cantidad) {
        Habitacion habitacion = obtenerHabitacionPorNivel(nivel);
        if (habitacion != null) {
            habitacion.liberarHabitacion(cantidad);
        } else {
            System.out.println("El nivel de habitación no existe.");
        }
    }


    private Habitacion obtenerHabitacionPorNivel(String nivel) {
        switch (nivel.toLowerCase()) {
            case "económica":
                return hotel.getHabitacion1();
            case "estándar":
                return hotel.getHabitacion2();
            case "de lujo":
                return hotel.getHabitacion3();
            default:
                return null;
        }
    }
}
