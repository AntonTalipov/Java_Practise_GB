package org.example.homework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Practise2 {
    public static void main(String[] args) throws IOException {
        Path of = Path.of( "file.txt");
        System.out.println(Files.exists(of));

        Files.createFile(of);
        System.out.println(Files.exists(of));
//        String s = "aaaabbbcdd";
//        String compressed = compress(s);
//        System.out.println(compressed);
    }}
//    public static void main(String[] args) throws IOException {
//        try (FileOutputStream fileOutputStream = new FileOutputStream("file.txt")){
//            String text = "My text111";
//            byte [] bytes = text.getBytes(StandardCharsets.UTF_8);
//            fileOutputStream.write(bytes);}
//
//    }
//static String compress (String input){
//        String result = "";
//        int count = 1;
//        char tmp = input.charAt(0);
//        for (int i=1; i < input.length(); i++){
//            char c = input.charAt(i);
//            if (tmp==c){
//                count++;
//            } else {
//                if (count > 1) {
//                    result += tmp;
//                    result += count;
//                } else{
//                    result += tmp;
//                }
//                tmp = c;
//                count = 1;
//            }
//
//
//        }
//        result += tmp;
//        result += count;
//        return result;
//
//}
//}
