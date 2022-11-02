package Pokemone;

public class Attaque {
    private String nomAttaque;
    private int degatsAttaque;

    public Attaque(String nomAttaque, int degatsAttaque) {
        this.nomAttaque = nomAttaque;
        this.degatsAttaque = degatsAttaque;
    }

    public String getNomAttaque() {
        return nomAttaque;
    }

    public void setNomAttaque(String nomAttaque) {
        this.nomAttaque = nomAttaque;
    }

    public int getDegatsAttaque() {
        return degatsAttaque;
    }

    public void setDegatsAttaque(int degatsAttaque) {
        this.degatsAttaque = degatsAttaque;
    }
}

