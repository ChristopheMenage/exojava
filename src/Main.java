public class Main {
    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 0;
        float resultat =0;
        resultat = division(val1,val2);
        System.out.println("resultat :" + resultat);
    }


    public static float division(int numerateur, int denominateur) {
        float resultat = 0;
        if (denominateur == 0){
                System.out.println("division impossible a diviser par zero");
         }  else {
                resultat = (numerateur / denominateur);

         }
        return resultat;



    }
}