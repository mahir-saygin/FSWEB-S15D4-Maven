package org.example;

import java.util.Stack;

public class Main {

    public static boolean checkForPalindrome(String text) {
        Stack<Character> stack = new Stack<>();

        String cleanedText = "";

        for (char character : text.toCharArray()) {
            if (Character.isLetterOrDigit(character)) {
                cleanedText += Character.toLowerCase(character);
            }
        }

        for (char character : cleanedText.toCharArray()) {
            stack.push(character);
        }

        for (char character : cleanedText.toCharArray()) {
            if (character != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static String convertDecimalToBinary(int number) {
        if (number == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();

        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
        }

        StringBuilder binary = new StringBuilder();

        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}