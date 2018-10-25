public class Test1 {

    public static void main (String args[]){

        double num1=20;
        double num2=80;
        double total=num1+num2;
        System.out.println("Added value="+total);
        double netResult=total*25;
        System.out.println("Next value is "+netResult);
        double confusion=netResult%400;
        System.out.println(netResult%400+" is equla to:"+confusion);
        if (confusion<=20)
            System.out.println("OVER LIMIT");

        int test=10;
        test++;
        System.out.println(test);




}}
