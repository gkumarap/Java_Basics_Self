package String;

public class ReverseString {
    public static void main(String args[]){
        String test ="test";
        reverse(test);
        /*StringBuilder builder= new StringBuilder();
        builder.append(test);
        System.out.println(builder.reverse());*/
    }

    public static String reverse(String test){
        char[] temp=test.toCharArray();
        for (int i=temp.length;i<=0;i--){
            System.out.println(i);
        }
        return test;
    }
}
