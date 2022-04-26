package uf2_ejercicios.p1.a1;

import java.util.Scanner;

public class Ex01_Calculadora {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String acabar = "";
        do {
            
            if (in.hasNextInt()) {
                int a = in.nextInt();
                int b = in.nextInt();
                in.nextLine();
                String operacion = in.nextLine();
                
                switch(operacion) {
                case "+":
                    sumar(a,b);
                    break;
                case "-":
                    restar(a,b);
                    break;
                case "x":
                    multiplicar(a,b);
                    break;
                case "/":
                    dividir(a,b);
                    break;
                default:
                    break;
            }
            } else {
                acabar = in.nextLine();
            }
        } while(!acabar.equals("S"));   
    }

    public static void sumar(int a, int b) {
        System.out.printf("%d + %d = %d%n", a, b, a + b);
    }
    public static void restar(int a, int b) {
        System.out.printf("%d - %d = %d%n", a, b, a - b);
    }

    public static void multiplicar(int a, int b) {
        System.out.printf("%d x %d = %d%n", a, b, a * b);
    }   

    public static void dividir(int a, int b) {
        if (b == 0) {
            System.out.println("No es pot dividir per 0.");
        } else {
            System.out.printf("%d / %d = %d%n", a, b, a / b);
        }
    }
}
