import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;

public class Driver  {
    public static void main(String[] args) {

    GUI GUI = new GUI();
    GUI.setVisible(true);

    }
    @Test
    void TestMemento(){
        Originator originator = new StudentOriginator();
        originator.setGpa(22);

    assertEquals(22,originator);

    }
}

