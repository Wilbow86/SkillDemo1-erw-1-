import static org.junit.Assert.*;
import org.junit.*;

public class TestAddTwo{

    @Test
    public void testAdd(){

        assertEquals(AddTwo.add(2, 3), 6);
    }
}