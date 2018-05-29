
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static utama.matritellabs.com.StringConcatenator.stringConcat;

public class StringConcatenatorTest {

    @Test
    public void testConcat() {
        assertEquals("Majom", stringConcat("Ma", "jom"));
    }


}


