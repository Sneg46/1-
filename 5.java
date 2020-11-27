package bilet7;

import java.util.Scanner;

public class Text {
    private static Object Text;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println (s);
        System.out.println("Предложение: " + s + "\n");

//заменяем знаки препинания на пробел
        s = s.replaceAll("\\p{Punct}", " ");

//делим строку на массив слов
        String[] words = s.split("\\s+");

//ответ
        System.out.println("Количество слов: " + words.length + ";");


        {
            System.out.println("Стоимость отправки = " + words.length*20);
        }
    }
}
