package While;
import While.isEven;

import static While.isEven.isEven;

public class Sumeven5 {
    isEven isEven=new isEven();
    public static void main(String args[]){
        int num=4;
        int finishNumber=20;
        int count=0;
        while(num<=finishNumber){
            num++;
            if (!isEven(num)){
                continue;
            }
            System.out.println(" even number in range is "+ num);
            count++;
            if (count==5){
                break;
            }
        }
        System.out.println(count);

    }


}
