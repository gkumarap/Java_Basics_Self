package Switch;

public class SwitchWeekOfTheDay {
    public static void main(String args[]){
        int number=3;
        switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
                break;
            case 6: case 0:
                System.out.println("Either Saturday or sunday");
                break;
            default:
                System.out.println("invalid day");
        }

    }

}
