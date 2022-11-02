package exoconstructeur;

public class Enfant {
    private String nom;
    private String prenom;
    private int age;
    private boolean amoureux;
    private String son_amoureux;


    //constructeur

    public Enfant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = 0;
     //   this.amoureux = false;
    //    this.son_amoureux = null;
    }

    //methode Get


    public  String getPrenom() {
        return prenom;
    }

    public boolean getAmoureux() {
        return amoureux;
    }

    // pas besoin de setter pour les varaibles puisque mise a jour dans les methodes de la classe et pas en dehors
    //methode presentation
    public void presentation() {
        System.out.println("Bonjour Je m'appelle :" + nom + " " + prenom + " et j'ai :" + age + "ans");

    }

    //methode feter son anniverssaire
    public void feterAnniverssaire() {
        if (age < 17) {
            age += 1;
        }
    }
    //methode jouer au ballon
    public void joueAuBallon(Enfant autreEnfant){
        System.out.println("je joue au balon avec :" + autreEnfant.prenom);
    }
    //methode tomber amoureux
    public void tomberAmoureux(Enfant sonAmoureux){
        if (amoureux==false){
            amoureux = true;
            son_amoureux = sonAmoureux.prenom;
        } else {
                System.out.println(prenom + " est déjà amoureux et ne peut en avoir plusieurs");
            }
        }
    //methode estAmoureux
    public void estAmoureux(){
        if (amoureux == false) {
            System.out.println(prenom + " n'est pas amoureux");
        } else if (amoureux == true) {
            System.out.println(prenom + " est amoureux de :" + son_amoureux);
        }
    }
    }//dernière accolade de la classe enfant


