import java.io.*;
import java.util.*;

public class SetArray {

    public static List<String> fullTheArray(List<String> array) {
        array.add("Домашка");
        array.add("Массив");
        array.add("Лист");
        array.add("Фамилия");
        array.add("Справочник");
        array.add("Телефон");
        array.add("Буква");
        array.add("Буффер");
        array.add("Память");
        array.add("Джава");
        return array;
    }
    public static List<String> fullTheArrayFromFile(List<String> arr, String fileName) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) {
            stringBuffer.append(reader.readLine() + "\n");
        }
        if(stringBuffer.length() > 0) {
            String[] tempArr = stringBuffer.toString().split(" ");
            for (String temp : tempArr) {
                arr.add(temp);
            }
        }
        return arr;
    }

    public static void printUniqueWords(List<String> array) {
        Set<String> tempArray = new LinkedHashSet<>();
        for (String arr : array) {
            String a = arr.toLowerCase();
            tempArray.add(a);
        }
        for (String tempArr : tempArray) {
            int count = 0;
            for (String arr : array) {
                String a = arr.toLowerCase();
                if(tempArr.equals(a)) count++;
            }
            System.out.println("\"" + tempArr + "\"" + " repeated in the list = " + count);
        }
        System.out.println();
    }
}
