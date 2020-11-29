
import java.util.ArrayList;

public interface Caretaker {
    ArrayList<Memento> savedStudents = new ArrayList<>();

    void addMemento(Memento m);

    Memento getMemento(int index);
}
