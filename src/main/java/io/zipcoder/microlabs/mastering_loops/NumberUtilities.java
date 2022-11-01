package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {


    public static String getEvenNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i ++) /* i incremented by step*/{
            //i
            sb.append(i);
        }
        return sb.toString();
            return null;
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i ++) /* i incremented by step*/{
            sb.append(i);
        }
        return sb.toString();
        return null;
    }


    public static String getRange(int stop) {

        return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {

        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 1);
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 2); //LOOK FOR THE PATTERNS AND CALL  YOUR OWN CODE...
    }
    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i += step) /* i incremented by step*/{
            sb.append(i);
        }
        return sb.toString();
    }
}
