package com.example.pc.retrofit.models;

/**
 * Created by PC on 16-Oct-17.
 */

public class Main {
    private Double temp;

    private Integer pressure;

    private Integer humidity;

    private double temp_min;

    private double temp_max;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public double getTempMin() {
        return temp_min;
    }

    public void setTempMin(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getTempMax() {
        return temp_max;
    }

    public void setTempMax(double temp_max) {
        this.temp_max = temp_max;
    }

}
