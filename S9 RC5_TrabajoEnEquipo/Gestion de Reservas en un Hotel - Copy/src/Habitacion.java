public class Habitacion {
    private String nivel;
    private int capacidad;
    private int cantidadHabitaciones;
    private double precio;

    public Habitacion(String nivel, int capacidad, int cantidadHabitaciones, double precio) {
        this.nivel = nivel;
        this.capacidad = capacidad;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.precio = precio;
    }

    public String getNivel() {
        return nivel;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public double getPrecio() {
        return precio;
    }

    public void reservarHabitacion(int cantidad) {
        if (cantidad <= cantidadHabitaciones) {
            cantidadHabitaciones -= cantidad;
            System.out.println("Reserva exitosa. Se han reservado " + cantidad + " habitación(es) de nivel " + nivel + ".");
        } else {
            System.out.println("No hay suficientes habitaciones disponibles en el nivel " + nivel + ".");
        }
    }

    public void liberarHabitacion(int cantidad) {
        cantidadHabitaciones += cantidad;
        System.out.println("Se han liberado " + cantidad + " habitación(es) de nivel " + nivel + ".");
    }

    @Override
    public String toString() {
        return "Habitación Nivel: " + nivel + " | Capacidad: " + capacidad + " personas | Habitaciones disponibles: " + cantidadHabitaciones + " | Precio por noche: $" + precio;
    }
}
