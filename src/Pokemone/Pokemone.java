package Pokemone;

import java.util.ArrayList;
import java.io.FileReader;
import com.opencsv.CSVReader;


public class Pokemone {
    private String nom;
    private int pv;
    private ArrayList<Attaque> listeAttaque;
    private Type typePokemon;

    public Pokemone(String nom, int pv, ArrayList<Attaque> listeAttaque, Type typePokemon) {
        this.nom = nom;
        this.pv = pv;
        this.listeAttaque = listeAttaque;
        this.typePokemon = typePokemon;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public ArrayList<Attaque> getListeAttaque() {
        return listeAttaque;
    }

    public void setListeAttaque(ArrayList<Attaque> listeAttaque) {
        this.listeAttaque = listeAttaque;
    }

    public Type getTypePokemon() {
        return typePokemon;
    }

    public void setTypePokemon(Type typePokemon) {
        this.typePokemon = typePokemon;
    }
}
