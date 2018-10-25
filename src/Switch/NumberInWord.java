package Switch;

public class NumberInWord {
    public static void main(String args[]) {
        printNumberInWord(1);
        printNumberInWord(-15);
        printNumberInWord(-1);
        printNumberInWord(5);
        printNumberInWord(6);
    }

        public static void printNumberInWord ( int number){
            switch (number) {
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 0:
                    System.out.println("ZERO");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("OTHER");
                    break;
            }
        }

    }


