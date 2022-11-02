package Pokemone;

import com.opencsv.CSVReader;
import com.sun.org.apache.bcel.internal.generic.ObjectType;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import java.io.FileReader;

public class MainPokemon {
    public static void main(String[] args) {
        //Varaibles

        String perso1;
        String perso2;
        ArrayList<Pokemone> joueurs;
        String csvSplit1 = ";";

        String[] tabPokemone = new String[15];
        ArrayList<Attaque> objetAttaques = new ArrayList<>();
        ArrayList<Type> objetTypes = new ArrayList<>();
        ArrayList<Pokemone> objetPokemone = new ArrayList<>();

        //lance interface Joeur
        //joueurs = interfaceJoueur();
        //System.out.println("j1 :" + joueurs[0]);
        //System.out.println("j2" + joueurs[1]);

        //code pour lire fichier attaque  que et instancier les objets attaque
        objetAttaques = lireAttaque();
        //code pour lire fichier attaque et instancier les objets types avec la particularité
        //que des varibales de ce l'objet sont des objet types egalement

        objetTypes = lireType();

        //Code pour lire fichier Poekemon et instancié les objet
        objetPokemone = lirePokemon(objetAttaques,objetTypes);

        AfficherListePokemone(objetPokemone);

        joueurs = interfaceJoueur(objetPokemone);


    }

    //Code pour echange avec utilisateur
    public static ArrayList<Pokemone> interfaceJoueur(ArrayList<Pokemone> Pokemone) {
        String temp="";
        ArrayList<Pokemone> retour = new ArrayList<>();
        Scanner InputReader = new Scanner(System.in);

        System.out.println("Bonjour et bienvenue au jeux Pokemon " + "\n" + "Veux tu me dire quel pokemone tu choisis?");
        temp=InputReader.nextLine();

        for (int x = 0; x < Pokemone.size(); x++) {
            //on cherche l'objet correspondant a ma faiblesse
            if (temp.equalsIgnoreCase(Pokemone.get(x).getNom())) {
                retour.add(Pokemone.get(x));
            }
        }
         temp ="";
        //System.out.println("Bienvenue " + retour[0]);
        System.out.println("il nous faut un 2ème joueur, veux tu choisir ton pokémone également");
        temp = InputReader.nextLine();
        for (int x = 0; x < Pokemone.size(); x++) {
            //on cherche l'objet correspondant a ma faiblesse
            if (temp.equalsIgnoreCase(Pokemone.get(x).getNom())) {
                retour.add(Pokemone.get(x));
            }
        }
        System.out.println("bienvenue " + retour.get(0).getNom() +" " + retour.get(1).getNom() + "Prets a vous affronter ?");
        return retour;
    }

    //lire fichier attaque
    public static ArrayList<Attaque> lireAttaque() {
        CSVReader reader = null;
        String csvSplit = ";";
        ArrayList<Attaque> objetAttaques = new ArrayList<>();
        try {
            reader = new CSVReader(new FileReader("C:\\Users\\stagiaire\\Documents\\Attaque.csv"));
            String[] nextLine;
            int i = 0;
            while ((nextLine = reader.readNext()) != null) {

                for (String token : nextLine) {

                    if (i != 0) {
                        String[] curentLine = token.split(csvSplit);
                        objetAttaques.add(new Attaque(curentLine[0], Integer.parseInt(curentLine[1])));

                    }
                    i = i + 1;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objetAttaques;
    }// fin lecture fichier Attaque

    //lire fichier Type
    // 1ere lecture pour récupérer tous les nom des types et instancié les objet Type dans une liste objet
    public static ArrayList<Type> lireType() {
        CSVReader reader = null;
        CSVReader reader1 = null;
        String csvSplit = ";";
        ArrayList<Type> objetTypes = new ArrayList<>();
        try {
            reader = new CSVReader(new FileReader("C:\\Users\\stagiaire\\Documents\\Type.csv"));
            String[] nextLine;
            int i = 0;
            while ((nextLine = reader.readNext()) != null) {
                for (String token : nextLine) {
                    if (i != 0) {
                        String[] curentLine = token.split(csvSplit);

                        if (curentLine.length != 0) {
                            objetTypes.add(new Type(curentLine[0]));
                        }
                    }

                    i = i + 1;
                }


            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // fin 1ere lecture fichier Type
        //debut 2 ème lecture pour récupérer les type faible et fort et compléter les objet créé a la 1ere lecture
        try {
            reader1 = new CSVReader(new FileReader("C:\\Users\\stagiaire\\Documents\\Type.csv"));
            String[] nextLine;
            int i = 0;
            while ((nextLine = reader1.readNext()) != null) {
                for (String token : nextLine) {

                    if (i != 0) {
                        String[] curentLine = token.split(csvSplit);
                        if (curentLine.length != 0) {
                            for (int j = 0; j < objetTypes.size(); j++) {
                                //on cherche l'objet par rapport au Nom lu ds fichier
                                if (Objects.equals(curentLine[0], objetTypes.get(j).getNomType())) {
                                    for (int x = 0; x < objetTypes.size(); x++) {
                                        //on cherche l'objet correspondant a ma faiblesse
                                        if (Objects.equals(curentLine[1], objetTypes.get(x).getNomType())) {
                                            objetTypes.get(j).setFaibleType(objetTypes.get(x));
                                        }
                                        if (Objects.equals(curentLine[2], objetTypes.get(x).getNomType())) {
                                            objetTypes.get(j).setFortType(objetTypes.get(x));
                                        }
                                    }

                                }
                            }
                        }

                    }
                    i = i + 1;
                }
            }
        }catch(Exception f){
                f.printStackTrace();
            }
            return objetTypes;
        }// fin  lecture fichier Type


    public static ArrayList<Pokemone> lirePokemon(ArrayList<Attaque> listAttaque,ArrayList<Type> listeType) {
        CSVReader reader = null;
        CSVReader reader1 = null;
        String csvSplit = ";";
        ArrayList<Pokemone> objetPokemone = new ArrayList<>();

        try {
            reader = new CSVReader(new FileReader("C:\\Users\\stagiaire\\Documents\\Pokemone.csv"));
            String[] nextLine;
            int i = 0;
            while ((nextLine = reader.readNext()) != null) {
                //on va récupérer les object attaque correspondant afin de pouvoir initier l'objet poekemon
                ArrayList<Attaque> objetAtt = new ArrayList<>();
                Type objetType = null;
                for (String token : nextLine) {
                    if (i != 0) {
                        String[] curentLine = token.split(csvSplit);
                        for (int j = 0; j < listAttaque.size(); j++) {
                            if (Objects.equals(curentLine[4], listAttaque.get(j).getNomAttaque())) {
                                objetAtt.add(listAttaque.get(j));
                            }
                            if ((Objects.equals(curentLine[5], listAttaque.get(j).getNomAttaque())) && curentLine[5] != null && curentLine[5] != "")  {
                                objetAtt.add(listAttaque.get(j));
                            }
                        }//fin du for
                        for (int j=0; j < lireType().size();j ++){
                            if (Objects.equals(curentLine[6], listeType.get(j).getNomType())) {
                                objetType=listeType.get(j);
                            }
                        }//
                        objetPokemone.add(new Pokemone(curentLine[0],Integer.parseInt(curentLine[2]),objetAtt,objetType));
                    }

                    i = i + 1;
                }


            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return objetPokemone;
    }// fin  lecture fichier Pokemon

    public static void AfficherListePokemone(ArrayList<Pokemone> listPo){
        System.out.println("Voici la liste des Poekemone pour jouer");
        for (int i=0;listPo.size() > i;i++){
            System.out.print(listPo.get(i).getNom() + ",");
            if ((i +1) %3 == 0){
                System.out.println();
            }
        }
    }
}
