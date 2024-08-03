package com.java.laboratory.hackerRank.certification.javaBasic.excercises;


import java.util.Stack;

// Write your code here. DO NOT use an access modifier in your class declaration.
public class Braces{
    // Método para verificar si una cadena de símbolos está balanceada
    public static boolean isBalanced(String symbols) {
        Stack<Character> stack = new Stack<>();

        for (char ch : symbols.toCharArray()) {
            switch (ch) {
                case '(': case '{': case '[':
                    stack.push(ch);
                    break;
                case ')': case '}': case ']':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char openChar = stack.pop();
                    if (!isMatchingPair(openChar, ch)) {
                        return false;
                    }
                    break;
                default:
                    return false; // Caracter no válido
            }
        }
        return stack.isEmpty();
    }

    // Método para verificar si dos caracteres son pares de apertura y cierre correspondientes
    private static boolean isMatchingPair(char openChar, char closeChar) {
        return (openChar == '(' && closeChar == ')') ||
                (openChar == '{' && closeChar == '}') ||
                (openChar == '[' && closeChar == ']');
    }

    public static void main(String[] args) {
        String[] symbolsArray = {
                //"((()))",
                //"({}{})",
                //"({)})",
                "}{",
                //")()",
                //"({)}"
        };

        for (String symbols : symbolsArray) {
            System.out.println(isBalanced(symbols));
        }
    }
}