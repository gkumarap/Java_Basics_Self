public class Method {
    public static void main(String args[]){
        int highScore=calculateHighScore(1500);
        /*int overAllScore=calculateFinalScore(true,
                100,5,100);
        System.out.println(overAllScore);*/
        displayHighScorePosition("Govind",highScore);
        highScore=calculateHighScore(400);
        displayHighScorePosition("tim",highScore);
        highScore=calculateHighScore(900);
        displayHighScorePosition("PRabha",highScore);
        highScore=calculateHighScore(50);
        displayHighScorePosition("Ramesh",highScore);

    }
    public static int calculateFinalScore(boolean player,int score,int level, int bonus){

        if (player){
            int finalScore=score+(level*bonus);
            finalScore+=1000;
            return finalScore;
        }
     return -1;
    }
    public static void displayHighScorePosition( String pName,int positionIntable){
        System.out.println(pName+ " has Managed to get into position" +positionIntable+ "on the high score table!!!!!!!!");

    }
    public static int calculateHighScore( int playerScore){
        if (playerScore>1000){
            //System.out.println(playerScore);
            return 1;

        }else if (playerScore>500 && playerScore<1000){
            //System.out.println(playerScore);
            return 2;
        }else if (playerScore>100 && playerScore<500){
            return 3;
        }
        return 4;
    }
}
