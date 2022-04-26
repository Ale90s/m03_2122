package m03.uf1.a2;

import java.util.Scanner;

public class Ex12_NombresRomans {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero, millar, centenar, decena, unidad;

        System.out.print("Introdueixi un nombre natural entre 1 i 3999: ");
        numero = in.nextInt();
        
        millar = numero/1000;
        centenar = (numero/100)-(millar*10);
        decena = (numero/10)-(millar*100)-(centenar*10);
        unidad= numero - (millar*1000) - (centenar*100) - (decena*10);
        
        System.out.print("El nombre romans és: ");
        
        switch (millar) {
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print("M");
                break;
            case 2:
                System.out.print("MM");
                break;
            case 3:
                System.out.print("MMM");
                break;
        }
        switch (centenar) {
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print("C");
                break;
            case 2:
                System.out.print("CC");
                break;
            case 3:
                System.out.print("CCC");
                break;
            case 4:
                System.out.print("CD");
                break;
            case 5:
                System.out.print("D");
                break;
            case 6:
                System.out.print("DC");
                break;
            case 7:
                System.out.print("DCC");
                break;
            case 8:
                System.out.print("DCCC");
                break;
            case 9:
                System.out.print("CM");
                break;
        }
        switch (decena) {
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print("X");
                break;
            case 2:
                System.out.print("XX");
                break;
            case 3:
                System.out.print("XXX");
                break;
            case 4:
                System.out.print("XL");
                break;
            case 5:
                System.out.print("L");
                break;
            case 6:
                System.out.print("LX");
                break;
            case 7:
                System.out.print("LXX");
                break;
            case 8:
                System.out.print("LXXX");
                break;
            case 9:
                System.out.print("XC");
                break;
        }
        switch (unidad) {
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print("I");
                break;
            case 2:
                System.out.print("II");
                break;
            case 3:
                System.out.print("III");
                break;
            case 4:
                System.out.print("IV");
                break;
            case 5:
                System.out.print("V");
                break;
            case 6:
                System.out.print("VI");
                break;
            case 7:
                System.out.print("VII");
                break;
            case 8:
                System.out.print("VIII");
                break;
            case 9:
                System.out.print("IX");
                break;
            default:
                System.out.print("ERROR");
        }
                System.out.println("");
    }
}