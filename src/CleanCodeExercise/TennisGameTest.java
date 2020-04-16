package CleanCodeExercise;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TennisGameTest {

    private int player1Score;
    private int player2Score;
    private String expectedScore;

    public TennisGameTest(int player1Score, int player2Score, String expectedScore) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.expectedScore = expectedScore;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getAllScores() {
        return Arrays.asList(new Object[][] {
                { 0, 0, "Love-All" },
                { 1, 1, "Fifteen-All" },
                { 2, 2, "Thirty-All"},
                { 3, 3, "Forty-All"},
                { 4, 4, "Deuce"},

                { 1, 0, "Fifteen-Love"},
                { 0, 1, "Love-Fifteen"},
                { 2, 0, "Thirty-Love"},
                { 0, 2, "Love-Thirty"},
                { 3, 0, "Forty-Love"},
                { 0, 3, "Love-Forty"},
                { 4, 0, "Win for John"},
                { 0, 4, "Win for Bill"},

                { 2, 1, "Thirty-Fifteen"},
                { 1, 2, "Fifteen-Thirty"},
                { 3, 1, "Forty-Fifteen"},
                { 1, 3, "Fifteen-Forty"},
                { 4, 1, "Win for John"},
                { 1, 4, "Win for Bill"},

                { 3, 2, "Forty-Thirty"},
                { 2, 3, "Thirty-Forty"},
                { 4, 2, "Win for John"},
                { 2, 4, "Win for Bill"},

                { 4, 3, "Advantage for John"},
                { 3, 4, "Advantage for Bill"},
                { 5, 4, "Advantage for John"},
                { 4, 5, "Advantage for Bill"},
                { 15, 14, "Advantage for John"},
                { 14, 15, "Advantage for Bill"},

                { 6, 4, "Win for John"},
                { 4, 6, "Win for Bill"},
                { 16, 14, "Win for John"},
                { 14, 16, "Win for Bill"},
        });
    }

    @Test
    public void checkAllScores() {
        int highestScore = Math.max(this.player1Score, this.player2Score);
        int m_score1 = 0;
        int m_score2 = 0;
        for (int i = 0; i < highestScore; i++) {
            if (i < this.player1Score)
                m_score1 += 1;
            if (i < this.player2Score)
                m_score2 += 1;
        }
        assertEquals(this.expectedScore, TennisGame.getScore("John", "Bill", m_score1, m_score2));
    }
}