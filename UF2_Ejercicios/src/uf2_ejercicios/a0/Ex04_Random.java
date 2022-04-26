package uf2_ejercicios.a0;

public class Ex04_Random {
    
    public static void main(String[] args) {
        
        System.out.println(randomNumberGenerator(1, 10));
        System.out.println(randomNumberGenerator(500, 501));
        System.out.println(randomNumberGenerator(1, 1000));
        System.out.println(randomNumberGenerator(35, 80));
    }
    
    public static int randomNumberGenerator (int min, int max) {
        
        return (int)(Math.random()*(max-min+1)+min);
    }
}