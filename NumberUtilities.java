


public class NumberUtilities {

    public static String getRange(int stop) {
        String actual = "";
        for(int i = 0; i < stop; i++) {
            actual += i;
        }

        return actual;
    }

    public static String getRange(int start, int stop) {
        String actual = "";
        for(int i = start; i < stop; i++) {
            actual += i;
        }
        return actual;
    }


    public static String getRange(int start, int stop, int step) {
        String actual = "";
        for(int i = start; i < stop; i+=step) {
            actual += i;
        }
        return actual;
    }

    public static String getEvenNumbers(int start, int stop) {
        String actual = "";
        for(int i = start; i < stop; i++) {
            if (i % 2 == 0) {
            actual += i;
        }
        }
        return actual;
    }


    public static String getOddNumbers(int start, int stop) {
        String actual = "";
        for(int i = start; i < stop; i++) {
            if (i % 2 != 0) {
            actual += i;
        }
        }
        return actual;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String actual = "";
        for(int i = start; i <= stop; i++) {
            actual += (int) Math.pow(i, exponent);
        }
        return actual;
    }
}
