package main;

public class Car {
    private double speed;
    private double time;
    private boolean engine;

    public void run() {
        if (!isEngineOn()) {
            setEngineOn(true);
            System.out.println("Engine on");
        }
    }
    public void shutDown() {
        if (isEngineOn()) {
            setEngineOn(false);
            System.out.println("Engine off");
        }
    }

    public double getDistance() {
        return getSpeed() * getTime();
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isEngineOn() {
        return engine;
    }

    public <engine> void setEngineOn(boolean engine) {
        this.engine = engine;
    }
}

