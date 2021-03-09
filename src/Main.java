import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) {
        Country ctr = null;

        for (Country country : Country.values()) {
            System.out.println(country.toString());
        }
        System.out.println();

        String input = scanner.next();

        try {
            ctr = Country.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Наименование страны на английском введено некорректно, проверяем русское название...");
        } catch (NullPointerException e) {
            System.out.println("Элемент перечисления является null");
        }

        if (ctr == null) {
            try {
                ctr = Country.getByRuName(input);
            } catch (NoSuchCountryException e) {
                System.out.println("Страны '<" + input + ">' не существует");
            }
        }

        if (ctr != null) {
            if (ctr.getIsOpen()) {
                System.out.println("Страна [" + ctr + "] открыта для посещения.");
            } else {
                System.out.println("Страна [" + ctr + "] закрыта для посещения.");
            }
        }
    }
}
