import GitIntro.Vowels;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VowelsTest {

    @Test
    public void compare() {
        Vowels basicProgram = new Vowels();
        int result = basicProgram.vowelCount("123!");
        Assertions.assertEquals(0, result);
    }
}
