package m03.uf1.a2;

import java.util.Scanner;

public class Ex04_DadesPersonals {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nom, adreca, sexeresposta = null;
        int edat, telefon;
        boolean sexe;

        System.out.print("Digueu el nom.............................: ");
        nom = in.nextLine();
        System.out.print("Digueu l'edat.............................: ");
        edat = in.nextInt();

        in.nextLine();

        System.out.print("Digueu l'adreça...........................: ");
        adreca = in.nextLine();
        System.out.print("Digueu el telèfon.........................: ");
        telefon = in.nextInt();
        System.out.print("Digueu el sexe (TRUE=Dona, FALSE=Home)....:");
        sexe = in.nextBoolean();

        if (sexe == true) {
            sexeresposta = "Dona";
        } else if (sexe == false) {
            sexeresposta = "Home";
        }
        System.out.printf("Em dic %s, tinc %d anys, soc %s, la meva adreça és "
                + "¨%s¨ i el meu telèfon és %d.", nom, edat, sexeresposta, 
                adreca, telefon);
    }
}
