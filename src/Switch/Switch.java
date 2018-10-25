package Switch;

public class Switch {
    public static void main(String args[]){
        int switchValue=10;
        switch (switchValue){
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4:case 5:
                System.out.println(" value was either 3 or 4 or 5");
                System.out.println("actual value is"+switchValue);
                break;
                default:
                    System.out.println("value is not 1 or 2");
        }
    }
}
