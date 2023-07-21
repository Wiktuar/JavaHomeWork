package exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserData {
    public static void main(String[] args) {
        String userdata = null;
        try {
            userdata = getUserData();
        } catch (NotAllDataException e) {
            System.out.println(e.getMessage());
            return;
        }

        String text = null;

        try {
            text = parseUserData(userdata);
        } catch (NotCorrectDataException e) {
            System.out.println(e.getMessage());
            return;
        }

        Matcher matcher = Pattern.compile("\\b[а-яА-Я]+").matcher(text);
        matcher.find();
        String fileName = matcher.group() + ".txt";
        if(Files.exists(Paths.get(fileName))){
            writeToFile(fileName, text, true);
        } else {
            writeToFile(fileName, text, false);
        }
    }

//  метод получения данных от пользоввателя и проверки их количества
    private static String getUserData() throws NotAllDataException {
        System.out.println("Введите в любом поряде Вашу ФИО, дата рождения в формате dd.mm.yyyy, омер телефона и пол лтинской буквой");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

//  полученную строку проверяем на количесво пробелов ФИО + дата рождения + телефонный номер + пол = 6 слов
//  сщтветственно пробелов должно быть 5
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(text);
        int counter = 0;
        while(matcher.find()){
            counter++;
        }
        if(counter != 5) throw new NotAllDataException("Вы ввели неверное количество данных");
        return text;
    }

//  метод, выделяющий из общей строки необходимые данные
    private  static String parseUserData(String userData) throws NotCorrectDataException{
        String[] arr = new String[4];
        Matcher matcher = Pattern.compile("\\d{2}.\\d{2}.\\d{4}").matcher(userData);
        if(matcher.find())arr[1] = matcher.group();
        else throw new NotCorrectDataException("Вы ввели неверную дату рождения");

        matcher = Pattern.compile("\\d{10}").matcher(userData);
        if(matcher.find())arr[2] = matcher.group();
        else throw new NotCorrectDataException("Вы ввели неверный телефон");

        matcher = Pattern.compile("\\b[f|m]\\b").matcher(userData);
        if(matcher.find())arr[3] = matcher.group();
        else throw new NotCorrectDataException("Вы указали пол неверно");

        matcher = Pattern.compile("([а-яА-Я]+\\s){2}[а-яА-Я]+").matcher(userData);
        if(matcher.find())arr[0] = matcher.group();
        else throw new NotCorrectDataException("Вы указали пол неверно");

        return String.join(" ", arr[0], arr[1], arr[2], arr[3]);
    }

//  метод записи в файл 
    private static void writeToFile(String fileName, String text, boolean append){
        try(FileWriter fw = new FileWriter(fileName, append);
            BufferedWriter bw = new BufferedWriter(fw);){
            bw.write(text + "\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

