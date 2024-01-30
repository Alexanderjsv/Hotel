public class Reserva {
    public int capacidad = 160, habitacionLlena =-1, Existepersona = -4, noExistepersona = -3;
    private Habitacion habitaciones[];
    public Reserva(){
        habitaciones = new Habitacion[capacidad];
        for (int i=0; i < capacidad; i++){
            habitaciones[i]= new Habitacion(i);
        }
    }
    public boolean Reservado(int nHab){
        boolean reservado =habitaciones[nHab].habitacionOcupada();
        return reservado;
    }
    public String buscarNombreHuesped( int nhabitacion )
    {
        String respuesta = "";
        if( Reservado( nhabitacion ) )
        {
            respuesta = "Huesped: " + habitaciones[ nhabitacion ].getHuesped( ).getnYa( );
        }
        else
        {
            respuesta = "No hay ninguna reserva en esta habitación";
        }

        return respuesta;
    }

    public int hacerReserva( String nYa, int id, String diaLlegada)
    {
        int resultado = 0;

        {
            int numHabitacionHuesped = encontrarHabitacionHuesped( nYa.toUpperCase( ) );
            if( numHabitacionHuesped != noExistepersona )
            {
                resultado = Existepersona;
            }

            resultado = buscarHabitacion( );
            if( resultado != habitacionLlena )
            {
                Huesped huespedReserva = new Huesped(nYa,id,diaLlegada);
                habitaciones[ resultado ].ocuparhabitacion( huespedReserva );
            }
        }
        return resultado;
    }

    public int terminarestancia( String nYa )
    {
        int resultado = 0;

        {
            int numHabitacion = encontrarHabitacionHuesped( nYa.toUpperCase( ) );
            if( numHabitacion == noExistepersona )
            {
                resultado = noExistepersona;
            }
            else
            {
                Persona persona = habitaciones[ numHabitacion ].getHuesped( );
            }
        }

        return resultado;
    }

    public int habitacionesDisponibles( )
    {
        int hDisponibles = 0;
        for( Habitacion habitacion : habitaciones )
        {
            if( !habitacion.habitacionOcupada( ) )
            {
                hDisponibles = hDisponibles + 1;
            }
        }
        return hDisponibles;
    }


    public int buscarHabitacion( )
    {
        int habitacion = habitacionLlena;
        for( int i = 0; i < capacidad && habitacion == habitacionLlena; i++ )
        {
            if( !habitaciones[ i ].habitacionOcupada( ) )
            {
                habitacion = i;
            }
        }
        return habitacion;
    }

    private int encontrarHabitacionHuesped( String nYa )
    {
        int habitacion = noExistepersona;
        for( int i = 0; i < capacidad && habitacion == noExistepersona; i++ )
        {
            if( habitaciones[ i ].habitacionLlena( nYa ) )
            {
                habitacion = i;
            }
        }
        return habitacion;
    }


}
