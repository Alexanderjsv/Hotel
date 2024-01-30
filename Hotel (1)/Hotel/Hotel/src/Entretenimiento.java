public class Entretenimiento {
    private int menu;
    Gym gym =new Gym();
    Cine cine = new Cine();
    Juegos juegos = new Juegos();
    public void SeleccionarServivicio(int menu){
        System.out.println("Contamos con tres opciones de entretenimeinto.\n 1.Cine\n 2.Gimnasio\n 3.Juegos");
        System.out.println("¿De cual desea información?");
            switch (menu){
                case 1:
                    System.out.println("1. Cine.");
                    cine.llamarCine();
                    break;
                case 2:
                    System.out.println("2. Gimnasio.");
                    gym.llamarGimnasio();
                    break;
                case 3:
                    System.out.println("3. Juegos");
                    juegos.llamarJuegos();
                    break;
                default:
                    System.out.println("Opción de entretenimiento no existe");
                    break;
            }


    }
}
