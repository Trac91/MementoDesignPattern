
public class StudentMemento implements Memento {
    private float gpa;

    public StudentMemento(float gpa){
        this.gpa = gpa;
    }

    public float getGpa() {
        return gpa;
    }
}
