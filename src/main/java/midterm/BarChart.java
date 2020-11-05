package midterm;

public class BarChart extends Observer {
    public BarChart(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        logger.info("Bar chart has been notified: " + this.subject.getDataAsString());
    }

}
