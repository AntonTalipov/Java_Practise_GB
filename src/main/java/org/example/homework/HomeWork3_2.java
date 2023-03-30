package org.example.homework;

import java.util.ArrayList;
import java.util.List;

//Дан список ArrayList<String>. Удалить из него все строки, которые являются числами Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value")); ["string", "s", "my_value"]
public class HomeWork3_2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(list);

        list.removeIf(str -> str.matches("-?\\d+(\\.\\d+)?"));
        System.out.println(list);

    }
}
