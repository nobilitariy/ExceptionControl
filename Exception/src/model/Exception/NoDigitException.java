public class NoDigitException extends Exception {
    public NoDigitException(){
        super("Номер должен состоять только из чисел");
    }
}
