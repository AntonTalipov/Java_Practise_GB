package org.example.homework;

//Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
public class HomeWork2_1 {
    public static void main(String[] args) {
        System.out.println(doString(7, 'a', 'b'));
    }

    private static String doString(int n, char c1, char c2) {
        if(n % 2 == 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    sb.append(c1);
                } else {
                    sb.append(c2);
                }
            }
            return sb.toString();
        }
        else {
            return "We need an even number";
        }
    }
}