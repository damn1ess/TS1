import exceptions.CustomException;

public class Main {
    public static void main(String[] args) {
        NumberValidator validator = new NumberValidator();

        try {
            validator.validate(-5); // Это вызовет исключение
        } catch (CustomException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            validator.validate(10); // Это не вызовет исключение
        } catch (CustomException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}