import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgeAndGender help = new AgeAndGender();

        System.out.println("Введите Фамилию:");
        String lastName = scanner.nextLine();

        System.out.println("Введите Имя:");
        String firstName = scanner.nextLine();

        System.out.println("Введите Отчество:");
        String patronymic = scanner.nextLine();

        System.out.println("Введите дату рождения в формате ГГГГ-ММ-ДД:");
        String birthDateStr = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateStr);

        char gender = help.determineGender(patronymic);

        int age = help.calculateAge(birthDate);

        System.out.println("Фамилия и инициалы: " + lastName + " " + firstName.charAt(0) + "." + patronymic.charAt(0) + ".");
        System.out.println("Пол: " + (gender == 'М' ? "Мужской" : "Женский"));
        System.out.println("Возраст: " + age + " лет");

        scanner.close();
    }
}
