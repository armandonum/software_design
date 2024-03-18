package tasks.intervalos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        int x = sumIntervals(new int[][]{{1, 2}, {6, 10}, {11, 15}});
//        System.out.println(x);
        int x2 = sumIntervals(new int[][]{{1, 5}, {6, 8}, {-19, -9}});
        System.out.println(x2);
    }

    public static int sumIntervals(int[][] intervalsArray) {
        ParserInterval parserInterval = new ParserInterval();
        List<Interval> intervals = parserInterval.parse(intervalsArray);

        OverlapChecker overlapChecker = new OverlapChecker();
        IntervalFusion intervalFusion = new IntervalFusion();

        for (int i = 0; i < intervals.size(); i++) {
            for (int j = i + 1; j < intervals.size(); j++) {
                if (overlapChecker.isOverlap(intervals.get(i), (intervals.get(j)))) {
                    Interval merged = intervalFusion.merge(intervals.get(i), intervals.get(j));
                    intervals.set(i, merged);
                    intervals.remove(j);
                    j--;
                }
            }
        }

        AddIntervals addIntervals = new AddIntervals();
        return addIntervals.add(intervals);
    }
}
