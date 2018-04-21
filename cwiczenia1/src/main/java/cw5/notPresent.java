package cw5;

import java.util.Arrays;
import java.util.List;

public class notPresent {

    public static int solution2(int[]tab) {
        Integer[]tabl = new Integer[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tabl[i] = tab[i];
        }
        List<Integer>tablAsList = Arrays.asList(tabl);
        int number = 1;
        while (tablAsList.contains(number)) {
            number ++;
        }
        return number;
    }

    public static int solution(int[]tab) {
        Integer[]tabl = new Integer[tab.length];
                for (int i = 0; i < tab.length; i++) {
                    tabl[i] = tab[i];
                }
        List<Integer>tablAsList = Arrays.asList(tabl);
        int number = 1;

       for (int i = 0; i <= tablAsList.size(); i++) {
           if (tablAsList.contains(number)) {
               number ++;
           }
       }
       return number;
    }

    public static void main(String[] args) {

        int[] lista = new int[] {1, 2, 4, 5}; //3
        int[] lista2 = new int[] {1, 4, 8, 3, 2}; //5
        int[] lista3 = new int[] {-3, -1}; //1
        int[] lista4 = new int[] {1, 3, 6, 4, 1, 2}; //5

        long begin1 = System.nanoTime();
        int result = solution(lista);
        int result2 = solution(lista2);
        int result3 = solution(lista3);
        int result4 = solution(lista4);
        long end1 = System.nanoTime();
        System.out.println("Petla for - czas operacji w nanosekundach: " + (end1 - begin1));

        wyswietlWynik(lista, result);
        wyswietlWynik(lista2, result2);
        wyswietlWynik(lista3, result3);
        wyswietlWynik(lista4, result4);

        long begin2 = System.nanoTime();
        int result1a = solution2(lista);
        int result2a = solution2(lista2);
        int result3a = solution2(lista3);
        int result4a = solution2(lista4);
        long end2 = System.nanoTime();
        System.out.println("Petla while - czas operacji w nanosekundach: " + (end2 - begin2));

        wyswietlWynik(lista, result1a);
        wyswietlWynik(lista2, result2a);
        wyswietlWynik(lista3, result3a);
        wyswietlWynik(lista4, result4a);

    }



    public static void wyswietlWynik(int[] arr, int result) {
        StringBuilder builder = new StringBuilder();
        builder.append("Wynik dla tablicy: ");
        for (int a : arr) {
            builder.append(a);
            builder.append(" ");
        }
        builder.append("to: ");
        builder.append(result);
        System.out.println(builder.toString());
    }
}
