package midterm;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class SubjectTests {

    @Test
    public void testCase0() {
        Subject subject = new Subject();
        Map<Character, Integer> data = subject.getData();
        Integer expected = 40;
        Integer found = data.get('A');
        Assert.assertEquals(expected, found);
        expected = 25;
        found = data.get('B');
        Assert.assertEquals(expected, found);
        expected = 15;
        found = data.get('C');
        Assert.assertEquals(expected, found);
        expected = 20;
        found = data.get('D');
        Assert.assertEquals(expected, found);
    }

    @Test
    public void testCase1() {
        Subject subject = new Subject();
        PieChart pieChart = new PieChart(subject);
        BarChart barChart = new BarChart(subject);

        subject.setData('B', 5);

        Map<Character, Integer> data = subject.getData();
        Integer found = data.get('B');
        Integer expected = 5;

        Assert.assertEquals(found, expected);
    }

    @Test
    public void testCase2() {
        Subject subject = new Subject();
        BarChart barChart = new BarChart(subject);
        DrawBarChart barChartDraw = new DrawBarChart(barChart);
    }

    @Test
    public void testCase3() {
        Subject subject = new Subject();
        PieChart barChart = new PieChart(subject);
        DrawPieChart barChartDraw = new DrawPieChart(barChart);
    }
}
