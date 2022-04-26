package javacourse.Section5_ControlFlowStatements;
public class switchStatement {
    
    public static void main(String[] args) {
        
        char switchChal = 'A';
        
        switch (switchChal) {
            
            case 'A':
                System.out.println("The letter was A");
                break;
            case 'B':
                System.out.println("The letter was B");
                break;
            case 'C':
                System.out.println("The letter was C");
                break;
            case 'D':
                System.out.println("The letter was D");
                break;
            case 'E':
                System.out.println("The letter was E");
                break;
            default:
                System.out.println("Any of these letters has been found.");
                break;
        }
        
        String month = "JANuary";
        // if we use the method string.toUpperCase we can enter the input either with lower
        // or upper case, the program will understand if it's the same string

        switch(month.toUpperCase()) {
            case "JANUARY":
                System.out.println("JANUARY");
                break;
            case "JUNE":
                System.out.println("JUNE");
                break;
            default:
                System.out.println("Not sure.");
                break;
        }
    }
}
