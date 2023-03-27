package org.example.homework;
//Создать файл с названием file.txt. Если файл уже есть, то создавать не надо Записать в него Слово "TEXT" 100 раз
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class HomeWork2_2 {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file);
            for (int i = 0; i < 100; i++) {
                writer.write("TEXT\n");
            }
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
