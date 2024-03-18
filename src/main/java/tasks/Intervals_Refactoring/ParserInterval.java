package tasks.Intervals_Refactoring;



import java.util.List;

public class ParserInterval {
    public static Interval parseSimple(int[] start) {
        return new Interval(start[0], start[1]);
    }

    public static List<Interval> parseComplex(int[][] start) {
        List<Interval> intervals = new java.util.ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            intervals.add(parseSimple(start[i]));
        }
        return intervals;
    }
}
