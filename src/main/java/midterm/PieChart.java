package midterm;

public class PieChart extends Observer {
    public PieChart(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        logger.info("Pie chart has been notified: " + this.subject.getDataAsString());
    }
}
