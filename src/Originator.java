
public interface Originator {

    Memento Save();

    Float Restore(Memento memento);

    void setGpa(float gpa);


}
