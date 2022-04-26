package javacourse.Section4_ExpressionsStatementsCode_BlocksMethods.Exercises.Ex02_MegaByesConverter;

public class MegaBytesConverter {
    
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        
        int megaBytes = 0;
        
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else{ 
            System.out.print(kiloBytes + " KB = ");
            
            while (kiloBytes >= 1024) {
                kiloBytes -= 1024;
                megaBytes++;
            }
            System.out.println(megaBytes + " MB and " + kiloBytes + " KB");
        }
    }
}
