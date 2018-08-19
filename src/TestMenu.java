import java.util.Scanner;

public class TestMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu[] values = Menu.values();
        wyswietlMenu(values);

        String userInput = scanner.nextLine();
        while (!sprawdzenie(userInput, values)) {
            System.out.println("Podana wartość jest nieprawidłowa, wybierz ponownie ");
            wyswietlMenu(values);
            userInput = scanner.nextLine();
        }
        System.out.println("Wybrana opcja: " + userInput);

    }

    public static void wyswietlMenu(Menu[] values) {
        System.out.println("Menu: ");
        for (Menu menu : values) {
            System.out.println(menu);
        }
    }

    public static boolean sprawdzenie(String userInput, Menu[] values) {
        int i = 0;
        while (i < values.length && !userInput.equalsIgnoreCase(values[i].toString())) {
            i++;
        }
        if (i < values.length) {
            return true;
        } else {
            return false;
        }

        // return  i < values[i];
    }
}

