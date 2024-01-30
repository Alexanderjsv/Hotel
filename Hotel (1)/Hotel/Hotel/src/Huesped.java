public class Huesped extends Persona{
    private String diaLlegada;
    public Huesped (String nYa, int id, String diaLlegada){
        super(nYa, id);
        this.diaLlegada=diaLlegada;
    }

    public String getDiaLlegada() {
        return diaLlegada;
    }
    public boolean tieneNombreyApellido( String nya )
    {
        boolean tieneNombreyApellido = false;
        if( nya.equalsIgnoreCase( nya ) )
        {
            tieneNombreyApellido = true;
        }
        else
        {
            tieneNombreyApellido = false;
        }
        return tieneNombreyApellido;
    }
}
