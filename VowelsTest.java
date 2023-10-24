import GitIntro.Vowels;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VowelsTest {

    @Test
    public void compare() {
        Vowels basicProgram = new Vowels();
        int result = basicProgram.vowelCount("hello");
        Assertions.assertEquals(2, result);
    }
}
