import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentOriginatorTest {

    @org.junit.jupiter.api.Test
    void restore() {
        Originator originator = new StudentOriginator();
        originator.setGpa(99);
        assertEquals(99,99);
        originator.setGpa(88);
        assertEquals(88,88);
    }
    @Test
    void Save(){

    }
}