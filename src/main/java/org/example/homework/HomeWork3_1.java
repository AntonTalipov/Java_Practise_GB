package org.example.homework;

import java.util.ArrayList;

//Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
public class HomeWork3_1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                evenNumbers.add(list.get(i));
            }
        }
        list.clear();
        list.addAll(evenNumbers);

        System.out.println("There are just even numbers from the list:");
        for (int number : list) {
            System.out.println(number);
    }
}}
