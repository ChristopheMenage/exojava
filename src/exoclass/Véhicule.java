package exoclass;

public class Véhicule {
    int nombre_de_roue;
    String constructeur;

    //public Véhicule (int nombre_de_roue, String constructeur){
    //    this.nombre_de_roue = nombre_de_roue;
    //    this.constructeur = constructeur;


    //}


    public Véhicule(int nombre_de_roue, String constructeur) {
        this.nombre_de_roue = nombre_de_roue;
        this.constructeur = constructeur;
    }

    //methode direBonjour()
    public void direBpnjour(){
        System.out.println("Je suis un véhicule à " + nombre_de_roue + ".");
    }
}
