package org.example.homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.*;
/**
 * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
 *
 * и
 * ты
 * Еще
 * день друг Пора
 * ..
 *
 */
//static void collectStats(String text) {
//        // Map<Integer, List<String>> stats = new HashMap<>();
//        }
public class HomeWork5 {
    public static void main(String[] args) {
        String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.";

        Map<Integer, List<String>> stats = collectStats(text);
        printStats(stats);
    }

    static Map<Integer, List<String>> collectStats(String text) {
        Map<Integer, List<String>> stats = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new StringReader(text))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    int length = word.length();
                    if (!stats.containsKey(length)) {
                        stats.put(length, new ArrayList<>());
                    }
                    stats.get(length).add(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stats;
    }

    static void printStats(Map<Integer, List<String>> stats) {
        List<Integer> lengths = new ArrayList<>(stats.keySet());
        Collections.sort(lengths);

        for (int length : lengths) {
            List<String> words = stats.get(length);
            Collections.sort(words);
            System.out.printf("%d: %s%n", length, words);
        }
    }
}