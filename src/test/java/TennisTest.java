import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public final class TennisTest {
    @Test
    public void ShouldReturnLoveWhenPointsAreZero() throws Exception {
        int actual = 0;
        String expected = "love";
        assertThat(Tennis.startscoring(actual, 0), is(expected));
    }

    @Test
    public void ShouldReturnFifteenWhenPointIsOne() throws Exception {
        int actual = 1;
        String expected = "fifteen";
        assertThat(Tennis.startscoring(actual, 0), is(expected));
    }

    @Test
    public void ShouldReturnThirtyWhenPointIsTwo() throws Exception {
        int actual = 2;
        String expected = "thirty";
        assertThat(Tennis.startscoring(actual, 0), is(expected));
    }

    @Test
    public void ShouldReturnFortyWhenPointIsThree() throws Exception {
        int actual = 3;
        String expected = "forty";
        assertThat(Tennis.startscoring(actual, 0), is(expected));
    }

    @Test
    public void ShouldReturnAdvantageWhenOnePlayerScoresMoreThanThreePoints() throws Exception {
        int player1 = 4;
        int player2 = 3;
        String expected = "advantage";
        assertThat(Tennis.startscoring(player1, player2), is(expected));

    }

    @Test
    public void ShouldReturnDeuceWhenBothPlayersScoreFourPoints() throws Exception {
        int player1 = 4;
        int player2 = 4;
        String expected = "deuce";
        assertThat(Tennis.startscoring(player1, player2), is(expected));
    }

    @Test
    public void Player2ShouldWinGame() throws Exception {
        int player2 = 4;
        int player1 = 1;
        String expected = "GAME";
        assertThat(Tennis.startscoring(player2, player1), is(expected));

    }
}
