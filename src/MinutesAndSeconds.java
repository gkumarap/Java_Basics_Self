public class MinutesAndSeconds {
    public static void main (String args[]) {
        System.out.println(getDurationString(360,58));
        System.out.println(getDurationString(12456));


    }

    public static String getDurationString(double minutes, double seconds){
        if(minutes>0 ){
            if ((seconds>0 && seconds<59)) {
                int totalSeconds = (int) ((minutes * 60) + seconds);
                int xx = totalSeconds / 3600;
                int remainder = totalSeconds%3600;
                int yy = remainder / 60;
                remainder = remainder%60;
                int zz = remainder;
                String totalTime = xx + "h" + yy + "m" + zz + "s";
                return totalTime;
            }else{
                return "invalid seconds";
            }
        }else{
            return "invalid parameters";
        }
    }
    public static String getDurationString(double seconds){
        if (seconds>0){
            int hours= (int) (seconds/3600);
            int remainder= (int) (seconds-hours*3600);
            int min=remainder/60;
            remainder=remainder-min*60;
            int sec=remainder;
            String totalTime;
            return totalTime=hours+"h"+ min+"m"+sec+"s";
        }else {
            return "invalid param";
        }

    }

}
