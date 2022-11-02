package exoconstructeur;




public class Main {
    public static void main(String[] args) {
        Enfant charlotte = new Enfant("Durant",  "charlotte");
        Enfant olivier = new Enfant("DUPOND",  "olivier");

        charlotte.feterAnniverssaire();
        charlotte.presentation();
        olivier.feterAnniverssaire();//1
        olivier.feterAnniverssaire();
        olivier.feterAnniverssaire();
        olivier.feterAnniverssaire();
        olivier.feterAnniverssaire();//5
        olivier.feterAnniverssaire();
        olivier.feterAnniverssaire();
        olivier.feterAnniverssaire();
        olivier.feterAnniverssaire();
        olivier.feterAnniverssaire();//10
        olivier.feterAnniverssaire();
        olivier.feterAnniverssaire();
        olivier.feterAnniverssaire();
        olivier.feterAnniverssaire();
        olivier.feterAnniverssaire();//15
        olivier.feterAnniverssaire();
        olivier.feterAnniverssaire();//17
        olivier.feterAnniverssaire();
        olivier.feterAnniverssaire();
        olivier.presentation();
        charlotte.joueAuBallon(olivier);
        olivier.joueAuBallon(charlotte);
        System.out.println(olivier.getAmoureux());
        olivier.tomberAmoureux(charlotte);
        System.out.println(olivier.getAmoureux());
        olivier.estAmoureux();
        //olivier.estAmoureux();
        //charlotte.estAmoureux();
    }
}