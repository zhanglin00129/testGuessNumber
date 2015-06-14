package GuessNum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    @Mock
    private Guess guess;

    @Mock
    private GenerateNum expectedNum;

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game(guess, expectedNum, "1235");
    }

    @Test
    public void testGame() throws Exception {

        when(expectedNum.generate()).thenReturn("1234");
        when(guess.compare("1234", "1235")).thenReturn("3A1B");
        assertThat(game.result(), is("3A1B"));
    }
}
