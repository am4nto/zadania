package cw4;

public class LiczbaPierwsza {

    static boolean liczbaPierwsza (int liczba) {

        for(int i = 2; i <= liczba / 2; i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main (String args[]) {
        int number = 108379;

        long begin = System.nanoTime();
        boolean isPrime = liczbaPierwsza(number);
        long end = System.nanoTime();
        System.out.println(end - begin);
        if (isPrime) {
            System.out.println("Liczba " + number + " jest liczba pierwsza.");
        } else {
            System.out.println(("Liczba " + number + " nie jest liczba pierwsza."));
        }
    }
//1665385
//1511618
//1188570
}
