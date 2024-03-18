package tasks.Intervals_Refactoring;

import tasks.intervalos.Interval;

public class OverlapChecker {
    public  boolean isOverlap(Interval a, Interval b) {
        return a.getStart() >= b.getStart() && a.getStart() <= b.getEnd()
                || a.getEnd() >= b.getStart() && a.getEnd() <= b.getEnd()
                || b.getStart() >= a.getStart() && b.getStart() <= a.getEnd()
                || b.getEnd() >= a.getStart() && b.getEnd() <= a.getEnd();
    }
}
