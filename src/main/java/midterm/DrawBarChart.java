package midterm;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class DrawBarChart extends JFrame {

    BarChart barChart;

    public DrawBarChart(BarChart barChart) {
        this.barChart = barChart;
        initUI();
    }

    private void initUI() {

        CategoryDataset dataset = createDataset();

        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);

        pack();
        setTitle("Bar chart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private CategoryDataset createDataset() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        Map<Character, Integer> data = barChart.subject.getData();

        dataset.setValue(data.get('A'), "Values", "A");
        dataset.setValue(data.get('B'), "Values", "B");
        dataset.setValue(data.get('C'), "Values", "C");
        dataset.setValue(data.get('D'), "Values", "D");

        return dataset;
    }

    private JFreeChart createChart(CategoryDataset dataset) {

        JFreeChart barChart = ChartFactory.createBarChart(
                "Bar chart",
                "",
                "Values",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);

        return barChart;
    }

}
