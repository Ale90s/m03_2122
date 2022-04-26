package m03.uf1.a2;

import java.util.Scanner;

public class Ex08_NotaLiteral {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int nota;
        System.out.print("Introdueix una nota (enter entre 0 i 10):");
        nota = entrada.nextInt();
        
        switch (nota){
            
            case 0:
            case 1: 
            case 2:
                System.out.printf("El literal de la nota és molt deficient%n");
                break;
            case 3:
            case 4:
                System.out.printf("El literal de la nota és molt "
                        + "insuficient%n");
                break;
            case 5:
                System.out.printf("El literal de la nota és molt suficient%n");
                break;
            case 6:
                System.out.printf("El literal de la nota és molt bé%n");
                break;
            case 7:
            case 8:
                System.out.printf("El literal de la nota és molt notable%n");
                break;
            case 9:
            case 10:
                System.out.printf("El literal de la nota és molt excel·lent%n");
                break;
            default:
                System.out.printf("Nota incorrecta");
        }
    }

}