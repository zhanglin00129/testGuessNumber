package GuessNum;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GenerateNumTest {
    private GenerateNum num;

    @Before
    public void setUp() throws Exception {
        num = new GenerateNum();
    }

    @Test
    public void isNumber() {
        String str = num.generate();
        boolean isNumber = true;
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            isNumber = false;
        }
        assertThat(isNumber, is(true));
    }



    @Test
    public void isFourDig() {
        String str = num.generate();
        assertThat(str.length(),is(4));
    }
}
