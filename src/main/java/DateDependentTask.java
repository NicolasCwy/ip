public abstract class DateDependentTask extends Task {
    String date;

    public DateDependentTask(String description, String date) {
        super(description);
        this.date = date;
    }

    public DateDependentTask(String description, String date, boolean isCompleted) {
        super(description, isCompleted);
        this.date = date;
    }

    protected String getDate() {
        return this.date;
    }
}
