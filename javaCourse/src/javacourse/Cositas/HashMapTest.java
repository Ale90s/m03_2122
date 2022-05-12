package javacourse.Cositas;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {

        HashMap<String, String> fun = new HashMap<String, String>();
        
        fun.put("Ale", "1234");
        fun.put("Alberto", "12345");
        
        String hashFun = fun.toString();
        
        System.out.println(hashFun);
        
        String [] nombresEquipo = hashFun.split("[, {}]+");
        
        for (int i = 0; i < nombresEquipo.length; i++) {
            
            System.out.println(nombresEquipo[i]);
            
        }
        
    }
}
