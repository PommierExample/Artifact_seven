import org.junit.Test;
import org.pommier.Main;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMainMethod() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run the main method
        Main.main(new String[0]);

        // Restore the original System.out
        System.setOut(System.out);

        // Verify that the output is as expected
        assertEquals("Hello world!\n", outContent.toString());
    }
}