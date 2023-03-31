import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Реализовать консольное приложение, которое:
//
//        Принимает от пользователя строку вида text~num
//
//        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//
//        Если введено print~num, выводит строку из позиции num в связном списке.
//
//        Если введено exit, завершаем программу
public class HomeWork4 {
    public static void main(String[] args) {

        String cmd = "";
        Scanner myScanner = new Scanner(System.in);
        while (!cmd.equals("exit")) {
            cmd = myScanner.nextLine();
            String[] cmdArr = cmd.split("~");
            if (cmdArr.length == 2) {
                try {
                    Integer index = Integer.parseInt(cmdArr[1]);
                    if (cmdArr[0].equals("print")) {
                        System.out.println(getItem(index));
                    } else {
                        addItem(cmdArr[0], index);
                    }

                } catch (NumberFormatException e) {
                    System.out.println(String.format("ERR:%s", e.getMessage()));
                }
            }
        }
        myScanner.close();
    }
    static List<String> myDict = new ArrayList<String>();

    static void addItem(String str, Integer index) {
        if (index < 0)
            throw new NumberFormatException("Negative index");
        while (myDict.size() < index + 1)
            myDict.add(null);
        myDict.set(index, str);
    }

    static String getItem(Integer index) {
        if (index > 0 && myDict.size() > index && myDict.get(index) != null) {
            return myDict.get(index);
        } else {
            throw new NumberFormatException("Wrong index");
        }
    }

}