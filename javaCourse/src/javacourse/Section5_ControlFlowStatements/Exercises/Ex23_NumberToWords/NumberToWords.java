package javacourse.Section5_ControlFlowStatements.Exercises.Ex23_NumberToWords;

public class NumberToWords {

    public static void main(String[] args) {
        /*
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        */
        
        //numberToWords(123);
        //numberToWords(1010);
        //numberToWords(1000);
        //numberToWords(-12);
    }

    public static void numberToWords(int number) {

        int digitCount = (int) Math.pow(10, getDigitCount(number) - 1);
        int nReversed = reverse(number);
        int lastNumber;

        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            do {

                if (nReversed <= 0 && digitCount > 0) {
                    lastNumber = 0;
                    digitCount /= 10;
                } else {
                    lastNumber = nReversed % 10;
                    digitCount /= 10;
                    nReversed /= 10;
                }

                switch (lastNumber) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }

            } while (nReversed > 0 || digitCount > 0);
        }
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            int n = 0;
            
            while (number > 0) {

                number /= 10;
                n++;
            }

            return n;
        }
    }

    public static int reverse(int number) {

        int nReversed = 0;
        boolean finished = false;

        do {

            nReversed += number % 10;

            number /= 10;

            if (number == 0) {
                finished = true;
            } else {
                nReversed *= 10;
            }

        } while (!finished);

        return nReversed;
    }
}
