package tw;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {

    @Test
    public void should_return_2_when_1_add_1() throws Exception {
        assertEquals(2, new Add().addNumbers(1, 1));
    }
    @Test
    public void should_return_2_when_2_add_1() throws Exception {
        assertEquals(2, new Add().addNumbers(2, 1));
    }
}