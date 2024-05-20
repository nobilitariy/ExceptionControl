public class NotLettersException extends Exception{
    public NotLettersException(){
        super("ФИО должно содержать только буквы");
    }
}
