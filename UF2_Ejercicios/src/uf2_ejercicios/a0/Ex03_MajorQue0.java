package uf2_ejercicios.a0;

public class Ex03_MajorQue0 {

    public static void main(String[] args) {
        
        checkNumber(0);
        checkNumber(10);
        checkNumber(-5);
        checkNumber(300);
        checkNumber(423432);
    }
    static void checkNumber (int n1) {
        
        if (n1 > 0) {
            System.out.printf("El numero %d es MAYOR que 0%n", n1);
        } else {
            System.out.printf("El numero %d es MENOR que 0%n", n1);
        }
    }
}
