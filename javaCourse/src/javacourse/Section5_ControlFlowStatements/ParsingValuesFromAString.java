package javacourse.Section5_ControlFlowStatements;

public class ParsingValuesFromAString {

    public static void main(String[] args) {

        String numberAsString = "2018.125";
        System.out.println("numbreAsString = " + numberAsString);
        
        double number = Double.parseDouble(numberAsString);
        
        System.out.println("number = " + number);
        
        
        numberAsString += 1;
        number += 1;
        
        System.out.println("numbreAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
