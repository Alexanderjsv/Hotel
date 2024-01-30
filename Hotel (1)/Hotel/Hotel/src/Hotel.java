public class Hotel extends Direccion{
    private String nombre, instalaciones;
    private int capacidad;
    public Hotel(String nombre, int capacidad, String pais, String ciudad, String callePrincipal, String calleSecundaria) {
        super(pais, ciudad,callePrincipal, calleSecundaria);
        this.nombre = nombre;
        this.capacidad = capacidad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCapacidad() {
        return capacidad;
    }
}
