public class Cine {
    private String p1, p2, p3, p4, p5;
    private int horaAbre, horaCierra, horaInicio= 10;
    Calendario calendario = new Calendario();

    public void definirhorario() {
        horaAbre = 10;
        horaCierra = 22;
    }
    public void establecerPeliculas(){
        p1 = "Monsters University";
        p2 = "Culpa mía";
        p3 = "Need for Speed";
        p4 = "El precio del mañana";
        p5 = "Guardianes de la Galaxia";
    }
    public void cambiarPeliculas(String p1, String p2, String p3, String p4, String p5){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
    }
    public void llamarCine(){
        calendario.pedirFecha();
        definirhorario();
        establecerPeliculas();
        if (calendario.getHora() >= horaAbre && calendario.getHora() <= horaCierra){
            System.out.println("Funciones");
            if (horaInicio >= calendario.getHora()){
                System.out.println(p1+ " funcion abierta a las "+horaInicio+" horas.");
            }
            if ((horaInicio+2) >= calendario.getHora()){
                System.out.println(p2+ " funcion abierta a las "+(horaInicio+2)+" horas.");
            }
            if ((horaInicio+4) >= calendario.getHora()){
                System.out.println(p3+ " funcion abierta a las "+(horaInicio+4)+" horas.");
            }
            if ((horaInicio+6) >= calendario.getHora()){
                System.out.println(p4+ " funcion abierta a las "+(horaInicio+6)+" horas.");
            }
            if ((horaInicio+8) >= calendario.getHora()){
                System.out.println(p5+ " funcion abierta a las "+(horaInicio+8)+" horas.");
            }
            if ((horaInicio+10) >= calendario.getHora()){
                System.out.println(p1+ " funcion abierta a las "+(horaInicio+10)+" horas.");
            }
            if ((horaInicio+12) >= calendario.getHora()){
                System.out.println(p2+ " funcion abierta a las "+(horaInicio+12)+" horas.");
            }
        }else {System.out.println("El cine se encuentra cerrado :(\n Recuerda que tenemos funciones de 10 am a 10 pm.");}
    }

}
