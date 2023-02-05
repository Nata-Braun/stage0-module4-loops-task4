package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int summSkipped = 0;
        int summCount = 0;
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else {
            for (int i = 1; i <= lastInRow; i++) {

                if (i <= numberToSkip) {
                    summSkipped=summSkipped+i;
                    continue;
                } else {
                    summCount = summCount+i;
                    continue;
                }


            }
            System.out.println("skipped sum is " + summSkipped);
            System.out.println("counted sum is " + summCount);
        }

    }
}