import java.util.ArrayList;

public class StudentOriginator implements Originator{

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

    public StudentOriginator() {
        this.tNumber = tNumber;
        this.name = name;
        this.dob = dob;
        this.gpa = gpa;
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

    public Memento Restore(Memento memento){
        this.gpa = gpa;
        return memento;
    }

    @Override
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }


}
