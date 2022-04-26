package uf2_ejercicios.a1;

public class Ex09_VectosAleatoris {

    public static void main(String[] args) {

        int n = 10;
        /*
        int[] array = matrizA(n);

        printArray(array);
        
        System.out.println("");
        
        array = matrizB(n);

        printArray(array);
        
        System.out.println("");
        */
        int []array = matrizC(n);
        
        printArray(array);
        
        System.out.println("");
    }

    public static int[] matrizA(int longitud) {

        int[] array = new int[longitud];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (9 - 0 + 1) + 0);
        }

        return array;
    }

    public static int[] matrizB(int longitud) {
        
        int[] array = new int [longitud];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (999 - 100 + 1) + 100);
        }

        return array;
    }
    
    public static int[] matrizC(int longitud) {
        
        int [] arrayC = new int [longitud * 2];
        int [] arrayA = matrizA(longitud);
        int [] arrayB = matrizB(longitud);
        int contador = 0, a = 0, b = 0;
        
        while (contador != arrayC.length) {
            
            if (contador % 2 == 0) {
                arrayC[contador] = arrayA[a];
                a++;
            } else {
                arrayC[contador] = arrayB[b];
                b++;
            }
            contador++;
        }
        
        return arrayC;
    }
    
    public static void printArray(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
