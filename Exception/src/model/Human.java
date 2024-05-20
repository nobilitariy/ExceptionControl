import java.time.LocalDate;

public class Human {
    private String name;
    private LocalDate birthDate;
    private long number;
    private Gender sex;

    public Human(){
 
    }

    public void setName(String name) throws LengthFioException, NotLettersException{
        String[] fio = name.split(" ");
        if (fio.length != 3) {
            throw new LengthFioException();
        }
        for (String string : fio) {
            if (!containsNonLetters(string)) {
                throw new NotLettersException();
            }
        }
        this.name = name;
    }
    private boolean containsNonLetters(String name){
        return !name.matches("[a-zA-Z]+");
    }
    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }
    public void setNumber(long number) throws LengthNumberException, NoDigitException{
        String numberLength = String.valueOf(number);

        if (numberLength.length() != 9) {
            throw new LengthNumberException();
            
        }
        if (!numberLength.matches("[0-9]+")) {
            throw new NoDigitException();
        }
        this.number = number;
    }
    public void setGender(Gender sex){
        this.sex = sex;
    }
    public String getLastname(){
        String[] lastName =  name.split(" ");
        return lastName[0];
    }
    @Override
    public String toString() {
        return "ФИО: "+name + ", дата рождения: " + birthDate.getDayOfMonth()+ "."+ birthDate.getMonthValue() + "." + birthDate.getYear()+ ", номер телефона: " + number + ", пол: " + sex.name() + "\n";
    }
    
}
