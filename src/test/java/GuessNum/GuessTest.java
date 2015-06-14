package GuessNum;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GuessTest {
    private Guess guess;
    String targetNum;

    @Before
    public void setUp() throws Exception {
        guess = new Guess();
        targetNum = "1234";
    }

    @Test
    public void testShouldReturn4A0BWhenAllNumAreCorrect() throws Exception {
        String result = guess.compare(targetNum, "1234");
        assertThat(result, is("4A0B"));
    }

    @Test
    public void testShouldReturn0A0BWhenAllNumAreIncorrect() throws Exception {
        String result = guess.compare(targetNum, "5678");
        assertThat(result, is("0A0B"));
    }

    @Test
    public void testShouldReturn2A2BWhenTargetIs1234AndInputIs1243() throws Exception {
        String result = guess.compare(targetNum, "1243");
        assertThat(result, is("2A2B"));
    }

    @Test
    public void testShouldReturn1A2BWhenTargetIs1234AndInputIs1843() throws Exception {
        String result = guess.compare(targetNum, "1843");
        assertThat(result, is("1A2B"));
    }
}
