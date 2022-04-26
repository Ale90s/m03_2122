package m03.uf1.a5;

public class Ex16_OrdenarArray {

    public static void main(String[] args) {

        int[] n = new int[]{5, 4, 3, 8, 32, 768, 564, 95, 172, 1500, 859, 754};
        //Example Array To sort...
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                int aux = 0;
                if (n[i] > n[j]) {
                    aux = n[i];
                    n[i] = n[j];
                    n[j] = aux;
                }
            }
        }

        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println("");
    }
}
