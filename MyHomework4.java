import java.io.IOException;
import java.util.*;

public class MyHomework4 {
    static final String getFile1 = "File1.txt";
    static final String getFile2 = "File2.txt";

    public static void main(String[] args) {

        List<String> wordList = new ArrayList<String>();
        wordList = SetArray.fullTheArray(wordList);
        System.out.println(wordList + "\n");
        SetArray.printUniqueWords(wordList);
        wordList.clear();
        try {
            wordList = SetArray.fullTheArrayFromFile(wordList, getFile2);
        } catch (IOException e) {
            System.out.println("Нет возможности заполнить массив из файла!\n");
        }
        try {
            wordList = SetArray.fullTheArrayFromFile(wordList, getFile1);
        } catch (IOException e) {
            System.out.println("Нет возможности заполнить массив из файла!\n");
        }
        System.out.println(wordList + "\n");
        SetArray.printUniqueWords(wordList);
        Phonebook phonebook = new Phonebook();

        phonebook.add(223-44-44, "Иванов");
        phonebook.add(222-45-40, "Иванов");
        phonebook.add(223-14-24, "Петров");
        phonebook.add(225-34-48, "Сидоров");
        phonebook.add(229-56-20, "Сидоров");
        phonebook.add(223-60-40, "Сидоров");

        phonebook.get("Иванов");
        phonebook.get("Петров");
        phonebook.get("Сидоров");
        phonebook.get("Суркова");
    }
}
