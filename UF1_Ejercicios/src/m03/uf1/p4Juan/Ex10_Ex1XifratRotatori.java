package m03.uf1.p4Juan;

import java.util.Scanner;

public class Ex10_Ex1XifratRotatori {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //System.out.print("Introdueix la clau de xifrat [1-9]: ");
        int N = entrada.nextInt();
        entrada.nextLine();

        //System.out.println("Introdueix una frase: ");
        String frase = entrada.nextLine();

        String[] paraules = frase.split(" ");

        String[] paraules_pas1 = new String[paraules.length];
        int desplacament = 0;
        do {
            int pos_final = Math.min(N, paraules.length - desplacament);
            for (int i = 0; i < pos_final; ++i) {
                if (i < pos_final - 1) {
                    paraules_pas1[i + desplacament] = paraules[desplacament + i + 1];
                } else {
                    paraules_pas1[i + desplacament] = paraules[desplacament];
                }
            }

            desplacament += N;
        } while (desplacament < paraules.length);

        //System.out.println("Frase xifrada:");
        String[] paraules_pas2 = new String[paraules.length];
        for (int i = 0; i < paraules_pas1.length; ++i) {
            char[] paraula = paraules_pas1[i].toCharArray();
            char[] paraula_pas2 = new char[paraula.length];
            desplacament = 0;
            do {
                int pos_final = Math.min(N, paraula.length - desplacament);
                for (int j = 0; j < pos_final; ++j) {
                    if (j < pos_final - 1) {
                        paraula_pas2[j + desplacament] = paraula[desplacament + j + 1];
                    } else {
                        paraula_pas2[j + desplacament] = paraula[desplacament];
                    }
                }

                desplacament += N;
            } while (desplacament < paraula.length);
            paraules_pas2[i] = new String(paraula_pas2);
            System.out.print(paraules_pas2[i] + " ");
        }
        System.out.println("");

        entrada.close();
    }
}
