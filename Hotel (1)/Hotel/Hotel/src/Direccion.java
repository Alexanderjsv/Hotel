public class Direccion {
    protected String pais, ciudad, callePrincipal, calleSecundaria;
    public Direccion (String pais, String ciudad, String callePrincipal, String calleSecundaria){
        this.pais=pais;
        this.ciudad=ciudad;
        this.callePrincipal=callePrincipal;
        this.calleSecundaria=calleSecundaria;
    }
    public String getPais() {return pais;}
    public String getCiudad() {return ciudad;}
    public String getCallePrincipal() {return callePrincipal;}
    public String getCalleSecundaria() {return calleSecundaria;}
}