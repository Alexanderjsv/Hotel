public class Habitacion {
    private int numeroHabitacion;
    private int habDisponible;
    private Huesped huesped;
    public Habitacion (int nHab){
        huesped = null;
        numeroHabitacion = nHab;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public int getHabDisponible() {
        return habDisponible;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }
    public boolean habitacionOcupada( )
    {
        boolean ocupado = huesped != null;
        return ocupado;
    }
    public void ocuparhabitacion(Huesped nhuesped){
        huesped= nhuesped;
    }
    public boolean habitacionLlena( String nYa )
    {
        boolean hayReserva = true;

        if( huesped == null )
        {
            hayReserva = false;
        }
        else if( huesped.tieneNombreyApellido( nYa ) )
        {
            hayReserva = true;
        }
        else
        {
            hayReserva = false;
        }

        return hayReserva;
    }
    public void desocuparhabitacion(){
        huesped = null;
    }
    //public void conteoDisponibilidad(){}

}
