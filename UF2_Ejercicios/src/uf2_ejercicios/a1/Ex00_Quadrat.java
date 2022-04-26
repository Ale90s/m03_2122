package uf2_ejercicios.a1;

public class Ex00_Quadrat {

    public static void main(String[] args) {

        printSquare(2, 5);
        laneJump();
        printSquare(5, 5);
        laneJump();
        printSquare(20, 3);
    }

    public static void printSquare(int filas, int columnas) {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                square();
            }
            laneJump();
        }
    }
    
    public static void laneJump() {
        System.out.println("");
    }
    public static void square() {
        System.out.print("*");
    }
}
