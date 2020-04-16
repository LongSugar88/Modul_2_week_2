package CleanCodeExercise;

public class TennisGame {
    static String gamePoint = "";

    public static String getScore(String player1Name, String player2Name, int player_1_Point, int player_2_Point) {
        int score = player_1_Point - player_2_Point;
        boolean isEndGame = player_1_Point >= 4 || player_2_Point >= 4;

        if (isEndGame && score != 0) {
            gamePoint = checkWinner(player1Name, player2Name, player_1_Point, player_2_Point);
        } else if (score == 0 && player_1_Point > 3) {
            gamePoint = resultScore(player_1_Point);
        } else if (score == 0) {
            gamePoint = resultScore(player_1_Point) + "-All";
        } else {
            gamePoint = resultScore(player_1_Point) + "-" + resultScore(player_2_Point);
        }
        return gamePoint;
    }

    public static String resultScore(int playerPoint) {
        switch (playerPoint) {
            case 0:
                gamePoint = "Love";
                break;
            case 1:
                gamePoint = "Fifteen";
                break;
            case 2:
                gamePoint = "Thirty";
                break;
            case 3:
                gamePoint = "Forty";
                break;
            default:
                gamePoint = "Deuce";
                break;
        }
        return gamePoint;
    }

    public static String checkWinner(String player1Name, String player2Name, int player_1_Point, int plarer_2_Point) {
        if (player_1_Point >= 4 || plarer_2_Point >= 4) {
            int score = player_1_Point - plarer_2_Point;
            if (score == 1) {
                gamePoint = "Advantage for " + player1Name;
            } else if (score == -1) {
                gamePoint = "Advantage for " + player2Name;
            } else if (score >= 2) {
                gamePoint = "Win for " + player1Name;
            } else {
                gamePoint = "Win for " + player2Name;
            }
        }
        return gamePoint;
    }
}
