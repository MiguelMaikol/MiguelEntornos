package com.example.utils;
 
public class StringUtils {
 
    // Método para invertir una cadena
    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }
 
    // Método para contar el número de vocales en una cadena
    public static int countVowels(String input) {
        if (input == null) {
            return 0;
        }
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}