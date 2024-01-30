public class Juegos {
    private String Tipo;
    private int horaAbre, horaCierra;
    Calendario calendario = new Calendario();
    public void definirhorario() {
        horaAbre =11;
        horaCierra = 20;
    }
    public void llamarJuegos(){
        definirhorario();
        if (calendario.getHora() >= horaAbre && calendario.getHora()<=horaCierra){
            System.out.println("Los juegos se encuentran abiertos\n");
                if (calendario.getDia() == 25){
                    System.out.println("Recuerda hoy tenemos torneo de ping pong.\nTe esperamos!!!");
                } else if (calendario.getDia() == 10) {
                    System.out.println("Recuerda hoy tenemos torneo de futbolin.\nTe esperamos!!!");
            }
        }else {System.out.println("Los juegos se encuentran cerrados :(\n Recuerda que puedes venir a jugar de 11 am a 8 pm.");}
    }
}
