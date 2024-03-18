package tasks.Intervals_Refactoring;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntervalFusion {
    public static List<Interval> parseAndSortIntervals(int[][] intervalsArray) {
        ParserInterval parserInterval = new ParserInterval();
        List<Interval> intervals = parserInterval.parseComplex(intervalsArray);
        intervals.sort(Comparator.comparingInt(Interval::getStart));
        return intervals;
    }

    public Interval merge(Interval a, Interval b) {
        return new Interval(Math.min(a.getStart(), b.getStart()), Math.max(a.getEnd(), b.getEnd()));
    }
    }


