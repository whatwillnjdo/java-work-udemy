public final class Tennis {

    public static String startscoring(int player1, int player2) {
        if (player1 == 0){
            return "love";
        }
        else if (player1 == 1){
            return "fifteen";
        }
        else if (player1 == 2){
            return "thirty";
        }
        else if (player1 == 3){
            return "forty";
        }
        else if (player1 == 4 && player2 == 3){
            return "advantage";
        }
        else if (player1 ==3 && player2 == 3){
            return "deuce";
        }
        else if (player1 == 4 && player2 < 3){
            return "GAME";
        }
     return null;
    }
}
