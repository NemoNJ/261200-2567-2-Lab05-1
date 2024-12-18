import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;
    User(){
        this.name = null;
        this.dob = LocalDate.now(); // current date
    }
    User(String name,int year,int month,int date){
        this.name = name;
        this.dob = LocalDate.of(year,month,date);
    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public void setDob(LocalDate dob){
//        this.dob = dob;
//    }
//    public String getName(){
//        return this.name;
//    }
//    public LocalDate getDob(){
//        return this.dob;
//    }
    public void displayInfo(){
        System.out.println("----------------------------\n");
        System.out.println(name+" was born on "+dob+"\n");
        System.out.println("----------------------------\n");
    }
}
