package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum1 = 0;
        int sum2 = 0;
        if (0 > lastInRow) {
            System.out.println("last number in row is negative");
        } else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else {
            for (int i = 0; i <= numberToSkip; i++) {
                sum1=sum1+i;
            }
            for (int l = 0; l <= lastInRow; l++) {
                sum2 = sum2 + l;
            }
            System.out.println("skipped sum is " + sum1 + "\ncounted sum is " + (sum2 - sum1));
        }
    }
}
