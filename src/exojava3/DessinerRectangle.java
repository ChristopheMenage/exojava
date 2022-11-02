package exojava3;

public class  DessinerRectangle {
    public void dessiner(int longueur, int largeur){
        int i;
        for (i=1;i <= largeur; i++){
            for (int j=1; j<=longueur; j++) {
                System.out.print('0');
                
            }
            System.out.println();//pour aller a la ligne apres avoir écrit la une ligne
        }
    }

    public static void main (String[] arg){
        DessinerRectangle dessin = new DessinerRectangle(); //j'instancie l'objet dessin a partir de la classe DessinerRectangle
        dessin.dessiner(5,3);
    }
}
