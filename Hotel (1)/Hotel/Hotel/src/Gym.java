import java.util.Random;
public class Gym {
    private int horaAbre, horaCierra;
    Calendario calendario = new Calendario();
    Random random = new Random();
    int numeroAleatorio = random.nextInt(5)+1;

    public void definirhorario() {
        horaAbre = 6;
        horaCierra = 20;
    }
    public void llamarGimnasio(){
        definirhorario();
        if (calendario.getHora() >= horaAbre && calendario.getHora()<=horaCierra){
            System.out.println("El gimnasio se encuentra abierto");
            switch (numeroAleatorio) {
                case 1:
                    System.out.println("Recuerda tener un calentamiento adecuado antes de entrenar.\nTe esperamos!!!");
                    break;
                case 2:
                    System.out.println("No te olvides de una buena hidratación mientras entrenas.\nTe esperamos!!!");
                    break;
                case 3:
                    System.out.println("Escucha a tu cuerpo, recuerda tomar un descanso entre ejercicios.\nTe esperamos!!!");
                    break;
                case 4:
                    System.out.println("Planifica tu rutina, para que tu entrenamiento sea más eficiente.\nTe esperamos!!!");
                    break;
                case 5:
                    System.out.println("Manten una rutina variada para trabajar todo tu cuerpo.\nTe esperamos!!!");
                    break;
            }
        } else {
            System.out.println("El gimnasio se encuentra cerrado :(\n Recuerda que puedes entrenar de 6 am a 8 pm.");
        }
    }

}
