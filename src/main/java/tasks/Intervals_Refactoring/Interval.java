package tasks.Intervals_Refactoring;

public class Interval {
    private int start;
    private int end;

    public Interval(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start cannot be greater than end");
        }
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
    public void setStart(int start) {
        this.start = start;
    }
    public void setEnd(int end) {
        this.end = end;
    }

    public int length() {
        return end - start;
    }
}
