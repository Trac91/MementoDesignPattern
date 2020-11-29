import java.util.ArrayList;

public class StudentOriginator {

    private String tNumber;
    private String name;
    private String dob;
    private Float gpa;


    private ArrayList studentRecords;

    public StudentOriginator(String tNumber, String name, String dob, float gpa){
        this.tNumber = tNumber;
        this.name = name;
        this.dob = dob;
        this.gpa = gpa;
    }

    public String getTNumber() {
        return tNumber;
    }

    public void settNumber(String tNumber) {
        this.tNumber = tNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    public void addStudent(String tNumber,String name,String dob, float gpa){
       studentRecords.add(new StudentOriginator(tNumber,name,dob,gpa));
        System.out.println("Adding student");
    }

    public void removeStudent(int index){
        studentRecords.remove(index);
        System.out.println("Removing Student");
    }
    @Override
    public String toString(){
        String strStudent ="Current Student: " + this.tNumber + " , " + this.name + " , " + this.dob + " , " + this.gpa;
        return strStudent;
    }

    public StudentMemento Save(){
        System.out.println("Student Originator - Now Saving Memento.......");
        return new StudentMemento(this.gpa);
    }
    

}
