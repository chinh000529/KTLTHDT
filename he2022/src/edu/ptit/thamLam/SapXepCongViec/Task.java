package edu.ptit.thamLam.SapXepCongViec;

public class Task implements Comparable<Task> {
    private Integer start;
    private Integer finish;

    public Task(int start) {
        this.start = start;
    }
    
    public Integer getStart() {
        return start;
    }

    public Integer getFinish() {
        return finish;
    }

    public void setFinish(Integer finish) {
        this.finish = finish;
    }

    @Override
    public int compareTo(Task o) {
        return this.finish.compareTo(o.finish);
    }
}
