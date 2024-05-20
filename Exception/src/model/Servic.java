import java.time.LocalDate;

public class Servic {
    private Human human;

    public Servic(){
        this.human = new Human();
    }
    
    public void setName(String name) throws LengthFioException, NotLettersException{
        human.setName(name);
    }
    public void setBirthDate(LocalDate birthDate){
        human.setBirthDate(birthDate);
    }
    public void setGender(Gender sex){
        human.setGender(sex);
    }
    public void setNumber(long number) throws LengthNumberException, NoDigitException{
        human.setNumber(number);
    }
    public void writeFile(){
        WriteFile writeNewFile = new WriteFile();
       writeNewFile.writeFile(this.human);
    }
    public void readFile(String lastName){
        ReadFile useReadFile = new ReadFile();
        useReadFile.readFile(lastName);
    }
}
