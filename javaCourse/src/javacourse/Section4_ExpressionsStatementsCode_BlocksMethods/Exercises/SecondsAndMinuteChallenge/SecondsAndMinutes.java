package javacourse.Section4_ExpressionsStatementsCode_BlocksMethods.Exercises.SecondsAndMinuteChallenge;

public class SecondsAndMinutes {

    public static void main(String[] args) {
        
        String segundos = getDurationString(66, 40);
        System.out.println(segundos);
    }
    
    public static String getDurationString (int minutes, int seconds) {
        
        if((minutes >= 0 && (seconds >= 0 && seconds <= 59))) {
            
            int totalSeconds = getDurationString(minutes) + seconds;
            
            int finalHours = totalSeconds / 3600;
            int finalMinutes = (totalSeconds - (finalHours * 3600)) / 60;
            int finalSeconds = (totalSeconds - (finalHours * 3600) - (finalMinutes * 60));
            
            return finalHours + " horas, " + finalMinutes + " minutes and " + finalSeconds + " seconds";
        }
        
        return "Invalid value";
    }
    public static int getDurationString (int minutes) {
        
        return minutes * 60;
        
    }
}
