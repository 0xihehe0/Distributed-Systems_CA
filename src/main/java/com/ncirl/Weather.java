package com.ncirl;

public class Weather {
    private double temperature;
    private double humidity;
    private double pressure;
    private double windSpeed;
    private int windBearing;
    private String windDirection;
    private double precipitation;

    private static final String[] DIRECTIONS = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};

    public Weather(
            double temperature,
            double humidity,
            double pressure,
            double windSpeed,
            int windBearing,
            double precipitation

    ) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.precipitation = precipitation;
        this.windBearing = windBearing;
        this.windDirection = calculateWindDirection(this.windBearing);
    }

    private String calculateWindDirection(int windBearing) {
        int index = (int) Math.round((windBearing % 360) / 45.0);
        return DIRECTIONS[index];
    }

    public double getTemperature() {
        return this.temperature;
    }

    public double getHumidity() {
        return this.humidity;
    }

    public double getPressure() {
        return this.pressure;
    }

    public double getWindSpeed() {
        return this.windSpeed;
    }

    public String getWindDirection() {
        return this.windDirection;
    }

    public int getWindBearing() {
        return this.windBearing;
    }

    public double getPrecipitation() {
        return this.precipitation;
    }

    @Override
    public String toString() {
        return "Temperature: " + temperature + "°C, Humidity: " + humidity + "%, Precipitation: " + precipitation + "mm, Wind: " + windDirection + " " + windSpeed + "m/s";
    }
}
