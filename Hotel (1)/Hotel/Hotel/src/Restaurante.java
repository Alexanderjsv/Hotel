import java.util.Random;

public class Restaurante {
    private int horaAbre, horaCierra;
    Calendario calendario = new Calendario();
    Random random = new Random();
    int numeroAleatorio = random.nextInt(3)+1;
    public void definirhorario() {
        horaAbre = 9;
        horaCierra = 21;
    }
    public void llamarRestaurante(){
        calendario.pedirFecha();
        definirhorario();
        if (calendario.getHora() >= horaAbre && calendario.getHora() <= horaCierra){
            if (calendario.getHora() >= 9 && calendario.getHora() <= 11){
                System.out.println("Buenos dias");
                System.out.println("Se encuentra disponible nuestro menú de desayuno.");
                switch (numeroAleatorio){
                    case 1:
                        System.out.println("Nuestra recomendación del día es Chilaquiles Rojos, de los favoritos del chef ;)\n Te esperamos!!!");
                        break;
                    case 2:
                        System.out.println("Nuestra recomendación del día es Tigrillo completo, de las especialidades de la casa ;)\n Te esperamos!!!");
                        break;
                    case 3:
                        System.out.println("Nuestra recomendación del día es el American Style, de los favoritos de la casa ;)\n Te esperamos!!!");
                        break;
                }
            } else if (calendario.getHora() >= 13 && calendario.getHora() <= 16){
                System.out.println("Buenas tardes");
                System.out.println("Se encuentra disponible nuestro menú completo.");
                switch (numeroAleatorio){
                    case 1:
                        System.out.println("Nuestra recomendación del día es la Arepa Arrecha, de las favoritas del chef ;)\n Te esperamos!!!");
                        break;
                    case 2:
                        System.out.println("Nuestra recomendación del día son las Mexi Wings, la especialidad de la casa ;)\n Te esperamos!!!");
                        break;
                    case 3:
                        System.out.println("Nuestra recomendación del día son las Ribskey, la especialidad del chef ;)\n Te esperamos!!!");
                        break;
                }
            } else if (calendario.getHora() >= 18 && calendario.getHora() <= 21){
                System.out.println("Buenas noches");
                System.out.println("Se encuentra disponible nuestro menú completo.");
                switch (numeroAleatorio){
                    case 1:
                        System.out.println("Nuestra recomendación es el Tiramisu Salvaje, el favorito del chef ;)\n Te esperamos!!!");
                        break;
                    case 2:
                        System.out.println("Nuestra recomendación es Berry Strawberry, la especialidad de la casa ;)\n Te esperamos!!!");
                        break;
                    case 3:
                        System.out.println("Nuestra recomendación es el Panino Bambino, las favoritas de la casa ;)\n Te esperamos!!!");
                        break;
                }
            }else {System.out.println("Nuestra cocina se encuentra cerrada:( \n Pero recuerda que tienes nuestra barra de snacks y bebidas disponible de 9 am a 9 pm.");}
        }else {System.out.println("El restaurante se encuentra cerrado :(\n Recuerda que tenemos atención de 9 am a 9 pm.");}

    }

}
