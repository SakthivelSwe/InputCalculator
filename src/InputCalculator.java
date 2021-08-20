import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0L;
        int number = 0;
        while (true) {
            boolean isAsInt = scanner.hasNextInt();

            if(isAsInt) {
                number = scanner.nextInt();

                sum += number;
                count++;
                avg = (double) sum / (double) count;
                avg = Math.round(avg);

            }else {
                int inAvg = (int)avg;
                int inSum =(int) sum;
                System.out.println("SUM = "+inSum +" AVG = "+ inAvg);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
