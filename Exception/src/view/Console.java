import java.time.LocalDate;
import java.util.Scanner;

public class Console {
    private static Presenter presenter;
    private static Scanner scanner;

    public static void main(String[] args) throws LengthFioException, NotLettersException, LengthNumberException, NoDigitException {
        Console console = new Console();
        requesingData();
    }
    
    public Console(){
        this.presenter = new Presenter();
        this.scanner = new Scanner(System.in);
    }
    public static void requesingData() throws LengthFioException, NotLettersException, LengthNumberException, NoDigitException{
        name();
        birhtday();
        number();
        gender();
        writeFile();
        readFile();
        finish();
    }
    private static void finish() throws LengthFioException, NotLettersException, LengthNumberException, NoDigitException {
        System.out.println("Продолжить (да или нет):");
String input = scanner.nextLine();
try {
    if (input.equals("да")) {
        requesingData();
    } else if (input.equals("нет")) {
        System.exit(0);
    } else {
        System.out.println("Введите 'да' или 'нет':");
        finish();
    }
} catch (Exception e) {
    System.out.println("Введите 'да' или 'нет':");
    finish();
}
    }

    private static void readFile() {
        System.out.println("Введите Фамилию для прочтенния данных о человеке(или нажмите 'Enter' для продолженния работы)");
        String lastName = scanner.nextLine();
        if (!lastName.isEmpty()) {
            presenter.readFile(lastName);
        }
    }

    private static void name() throws LengthFioException, NotLettersException{
        System.out.println("Введите фамилию, имя и отчетсво человека через пробел");
        String name = scanner.nextLine();
        presenter.setName(name);
    }
    private static void birhtday(){
        System.out.println("Введите день рождения");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите месяц");
        int manth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите год");
        int year = scanner.nextInt();
        scanner.nextLine();
        LocalDate birthDate = LocalDate.of(year, manth, day);
        presenter.setBirthDate(birthDate);
    }
    private static void number() throws LengthNumberException, NoDigitException{
        System.out.println("Введите номер телефона(только цифры без пробела)");
        long number = scanner.nextLong();
        scanner.nextLine();
        presenter.setNumber(number);
    }
    public static void gender(){
        System.out.println("Введите пол(мужской/женский)");
        String gender = scanner.nextLine();
        if (gender.equalsIgnoreCase("мужской")) {
            presenter.setGender(Gender.Male);
        } else{
            presenter.setGender(Gender.Female);
        }
    }
    private static void writeFile(){
        presenter.writeFile();
    }

}
