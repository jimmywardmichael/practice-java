import org.w3c.dom.ls.LSOutput;

public class methodChallenge {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);
    }
    public static void displayHighScorePosition(String playersName, int highScorePosition){
        System.out.println(playersName + " managed to get into position " + highScorePosition + " on the high score list");
    };
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }else if (playerScore >= 500 && playerScore < 1000){
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        }else{
            return 4;
        }
    };
}

//Method challenge
// 1st method displayHighScorePosition
// should print "Tim managed to get into position 2 on high score list"
//2nd method calculateHighScorePosition
//has 1 parameter, the player score
//method should return a number between 1 and 4, based on scores below
// score greater than or equal 1000 = 1
//score greater than or = to 500 but less than 1000 = 2
//score greater than or = to 100 but less than 500 = 3
//all other scores = 4
//finally call both methods and display results for the following scores: 1500, 1000, 500, 100, 25