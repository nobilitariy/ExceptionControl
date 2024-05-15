import java.time.LocalDate;

public class Human {
    private String name;
    private LocalDate birthDate;
    private int number;
    private Gender sex;

    public Human(){
        
    }

    public void setName(String name){
        this.name = name;
    }
    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setGender(Gender sex){
        this.sex = sex;
    }
    public String getLastname(){
        return name;
    }
    
}
