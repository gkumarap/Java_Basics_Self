public class IfClass {

    /*public static void main(String args[]){
        int score=30;
        int average=9;
        int lowScore=5;

        if (score>=10 && average==10){
            System.out.println("test one ");
        }else if (lowScore<=5 && average<11){
            System.out.println("test two");
        }
    }*/

    public static void main (String args[]){
        boolean gameOver=false;
        int score =1000;
        int levelCompleted = 8;
        int bonus = 200;

        if (gameOver){
            int finalScore=score+(levelCompleted*bonus);
            System.out.println(finalScore+"is your final score");
        }else {
            System.out.println("ERROR 404");
        }

    }
}
