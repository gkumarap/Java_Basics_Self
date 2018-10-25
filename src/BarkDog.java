public class BarkDog {
    public static void main(String args[]) {
        System.out.println(bark(true, 2));
        System.out.println(bark(false, 24));
        System.out.println(bark(false, -1));
        System.out.println(bark(true, 40));
    }


    public static boolean bark(boolean barking, int hourOfDay) {
        if (barking == true || hourOfDay > 22 && hourOfDay < 8) {
            return true;
        } else if (barking == false || hourOfDay > 23 && hourOfDay < 0) {
            return false;
        }
        return false;
    }
}
