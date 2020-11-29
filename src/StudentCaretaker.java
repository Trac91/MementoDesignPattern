
public class StudentCaretaker implements  Caretaker{

    @Override
    public void addMemento(Memento m){
        savedStudents.add(m);
    }
    @Override
    public Memento getMemento(int index){
        return savedStudents.get(index);
    }

}
