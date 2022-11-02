package Pokemone;

public class Type {
    private String nomType;
    private Type faibleType;
    private Type fortType;

    public Type(String nomType) {
        this.nomType = nomType;
     //   this.faibleType = faibleType; On a pas besoin de constructeur puisqu'il fait référence a un objet
     //   this.fortType = fortType;
    }

    public String getNomType() {
        return nomType;
    }

    public void setNomType(String nomType) {
        this.nomType = nomType;
    }

    public Type getFaibleType() {
        return faibleType;
    }

    public void setFaibleType(Type faibleType) {
        this.faibleType = faibleType;
    }

    public Type getFortType() {
        return fortType;
    }

    public void setFortType(Type fortType) {
        this.fortType = fortType;
    }
}
