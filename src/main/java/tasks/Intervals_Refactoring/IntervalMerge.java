package tasks.Intervals_Refactoring;

public class IntervalMerge implements IMerger{
    @Override
    public Interval merge(Interval a, Interval b) {
        return new Interval(Math.min(a.getStart(), b.getStart()), Math.max(a.getEnd(), b.getEnd()));
    }
}
