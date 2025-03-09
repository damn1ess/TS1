import exceptions.CustomException;

public class NumberValidator {
    public void validate(int number) throws CustomException {
        if (number < 0) {
            throw new CustomException("Число не должно быть отрицательным: " + number);
        }
        System.out.println("Число " + number + " является допустимым.");
    }
}