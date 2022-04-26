package javacourse.Section5_ControlFlowStatements.Exercises.Ex21_AllFactors;

public class FactorPrinter {

    public static void main(String[] args) {
        
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
        
    }
    
    public static void printFactors (int number) {
        
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            
            int counter = 1;
            
            do {
                
                if (number % counter == 0) {
                    System.out.print(counter + " ");
                }
                
                counter ++;
            } while (counter != number + 1);
            System.out.println("");
        }
    }
}
