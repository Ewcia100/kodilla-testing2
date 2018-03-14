package com.kodilla;

import java.util.HashSet;
import java.util.Set;

public class FirstClass {
    public static void main(String[] args) {
        int[] lista = new int[]{1, 3, 6, 4, 1, 2};
        int result = solution(lista);
        wyswietlWynik(lista, result);

        int[] lista2 = new int[]{1, 4, 8};
        int result2 = solution(lista2);
        wyswietlWynik(lista2, result2);

        int[] lista3 = new int[]{-3, -1};
        int result3 = solution(lista3);
        wyswietlWynik(lista3, result3);

        int[] lista4 = new int[]{1, 2, 3, 4, 5};
        int result4 = solution(lista4);
        wyswietlWynik(lista4, result4);
    }

    private static int solution(int[] list) {

        Set<Integer> compareSet = new HashSet<Integer>();

        for (int i = 0; i < list.length; i++) {
            compareSet.add(list[i]);
        }

        int compare = 1;
        for (int i = 0; i < compareSet.size(); i++) {
            if (!compareSet.contains(compare)) {
                return compare;

            }
            compare++;
        }
        return compare;
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
