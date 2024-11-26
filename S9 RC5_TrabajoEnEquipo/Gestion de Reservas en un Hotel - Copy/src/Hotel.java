public class Hotel {
    private String nombre;
    private Habitacion habitacion2;
    private Habitacion habitacion1;
    private Habitacion habitacion3;


    public Hotel(String nombre) {
        this.nombre = nombre;

        // Crear habitaciones y asignar valores
        habitacion1 = new Habitacion("Económica", 2, 20, 50.0);
        habitacion2 = new Habitacion("Estándar", 4, 15, 100.0);
        habitacion3 = new Habitacion("De lujo", 2, 10, 150.0);
    }

    public String getNombre() {
        return nombre;
    }

    public Habitacion getHabitacion1() {
        return habitacion1;
    }

    public Habitacion getHabitacion2() {
        return habitacion2;
    }

    public Habitacion getHabitacion3() {
        return habitacion3;
    }

    @Override
    public String toString() {
        return "Hotel: " + nombre;
    }
}