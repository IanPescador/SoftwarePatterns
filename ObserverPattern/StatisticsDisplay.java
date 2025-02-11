public class StatisticsDisplay implements Observer, DisplayElement {
    private float avgTemp;
    private float maxTemp = Float.MIN_VALUE;
    private float minTemp = Float.MAX_VALUE;
    private float sumTemp = 0.0f;
    private int numTemp = 0;
    private Subject weatherData;
    
    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        sumTemp += temperature;
        numTemp ++;
        avgTemp = sumTemp/numTemp;

        if (maxTemp < temperature) {
            maxTemp = temperature;
        }
        if (minTemp > temperature) {
            minTemp = temperature;
        }

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature =" + avgTemp + "/"
            + maxTemp + "/" + minTemp);
    }
}
