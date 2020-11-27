import java.util.Scanner;

public class House {

    int door;
    int window;
    String name;

    public void Close() {
        System.out.println("Закрыть на ключ дом");
    }

    public static void main(String[] args) {
        House hell = new House();
        hell.Close();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество дверей дома: ");
        String Двери = in.nextLine();
        System.out.print("Введите количество окон в доме: ");
        int окна = in.nextInt();
        System.out.printf("Количество дверей: %s Количество окон: %d \n", Двери, окна );
        in.close();

    }
}
