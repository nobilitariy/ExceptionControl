import java.time.LocalDate;

public class Presenter {
    private Servic servic;
    public Presenter(){
        this.servic = new Servic();
    }
    public void setName(String name) throws LengthFioException, NotLettersException{
        servic.setName(name);
    }
    public void setBirthDate(LocalDate birthDate){
        servic.setBirthDate(birthDate);
    }
    public void setGender(Gender sex){
        servic.setGender(sex);
    }
    public void setNumber(long number) throws LengthNumberException, NoDigitException{
        servic.setNumber(number);
    }
    public void writeFile(){
        servic.writeFile();
    }
    public void readFile(String lastName){
        servic.readFile(lastName);
    }
}
