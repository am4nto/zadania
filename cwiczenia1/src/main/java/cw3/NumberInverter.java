package cw3;

public class NumberInverter {
    static int invert (int number) {
        String numberAsString = String.valueOf(number);
        String revertedNumberAsString = "";
        for (int i = numberAsString.length() - 1; i >= 0; i--) {
            char c = numberAsString.charAt(i);
            revertedNumberAsString = revertedNumberAsString + c + "";
        }
        int revertedNumber = Integer.parseInt(revertedNumberAsString);
        return revertedNumber;
    }

    public static void main (String args[]) {
        System.out.println(invert(1234));
    }
}
