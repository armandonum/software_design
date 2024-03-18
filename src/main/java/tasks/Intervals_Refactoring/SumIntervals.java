package tasks.Intervals_Refactoring;


import  java.util.List;

public class SumIntervals {
    public static int sumIntervals(int[][] intervalsArray) {
        List<Interval> intervals = IntervalFusion.parseAndSortIntervals(intervalsArray);
        return calculateTotalLength(intervals);
    }

    private static int calculateTotalLength(List<Interval> intervals) {
        int totalLength = 0;
        for (Interval interval : intervals) {
            totalLength += interval.length();
        }
        return totalLength;
    }
}
