// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Hotel hotel = new Hotel("Holiday Inn", 160,"Estados Unidos", "Miami", "Collins Ave","39th St");
    Reserva reserva = new Reserva();
    Entretenimiento entretenimiento = new Entretenimiento();
    Calendario calendario = new Calendario();
    Gym gym = new Gym();
    Cine cine = new Cine();
    Juegos juegos = new Juegos();
    Restaurante restaurante = new Restaurante();
        System.out.println("Bienvenido a "+hotel.getNombre()+" en "+hotel.getCiudad()+", "+hotel.getPais()+".");
        System.out.println("Contamos con capacidad para "+hotel.getCapacidad()+" personas.");
        System.out.println("Estamos ubicados en "+hotel.getCallePrincipal()+" y "+hotel.getCalleSecundaria()+".");
        System.out.println("Hay "+reserva.habitacionesDisponibles()+" habitaciones disponibles");
        reserva.hacerReserva("Andres Zurita",1750565333,"15 de junio");
        System.out.println("Hay "+reserva.habitacionesDisponibles()+" habitaciones disponibles");
        System.out.println("La siguiente habitación disponible es: "+reserva.buscarHabitacion());
        restaurante.llamarRestaurante();
        calendario.avanzarHora(2);
        restaurante.llamarRestaurante();
        entretenimiento.SeleccionarServivicio(2);
        juegos.llamarJuegos();
        gym.llamarGimnasio();
        cine.llamarCine();
        calendario.avanzarHora(8);
        calendario.pedirFecha();
        cine.llamarCine();
        calendario.avanzarHora(2);
        gym.llamarGimnasio();
        juegos.llamarJuegos();
        calendario.pedirFecha();
    }
}