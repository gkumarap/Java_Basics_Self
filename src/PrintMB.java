public class PrintMB {
    public static void main(String args[]){
        int printMegaByteAndKiloBytes=calculateMB(102458);
        System.out.println(printMegaByteAndKiloBytes+
        "MB value for your input is"+printMegaByteAndKiloBytes+"With remaining kb");

    }
    public static int calculateMB(int kiloBytes){
        int MB = kiloBytes/100;
        int RemainingKb=kiloBytes%100;
        return MB;
    }
}
