public class Calendario {
    private static int hora, dia, mes, anio;
    public Calendario(){
        hora = 10;
        dia =1;
        mes= 1;
        anio= 2024;
    }
    public void avanzarHora(int h){
        hora += h;
        if (getHora()>=24){
            avanzarDia(1);
            int horas= hora;
            hora= horas - 24;
        }

    }
    public void avanzarDia(int d){
        dia += d;
        if (getMes()==1 || getMes()==3 || getMes()==5 || getMes()==7 || getMes()==8 || getMes()==10 || getMes()==12){
            if (getDia()>=31){
                avanzarMes(1);
                int dias = dia;
                dia = dias - 30;
            }
        }
        if (getMes()==4 || getMes()==6 || getMes()==9 || getMes()==11){
            if (getDia()>=30){
                avanzarMes(1);
                int dias = dia;
                dia = dias - 29;
            }
        }
        if (getMes()==2){
            if (getDia()>=28){
                avanzarMes(1);
                int dias = dia;
                dia = dias - 27;
            }
        }

    }
    public void avanzarMes(int m){
        mes += m;
        if (getMes()>=12){
            avanzarAnio(1);
            int meses = mes;
            mes = meses - 11;
        }
    }
    public void avanzarAnio(int a){
        anio += a;
    }
    public void pedirFecha(){
        System.out.println("Son las "+getHora()+" horas.");
        System.out.println(getDia()+"/"+getMes()+"/"+getAnio());
    }
    public int getHora() {return hora;}
    public int getDia() {return dia;}
    public int getMes() {return mes;}
    public int getAnio() {return anio;}
}
