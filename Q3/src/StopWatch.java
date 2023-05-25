/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */
public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.nanoTime();
    }

    public void start() {
        this.startTime = System.nanoTime();
    }

    public void stop() {
        this.endTime = System.nanoTime();
    }

    public double getElapsedTime() {
        return (this.endTime - this.startTime) / 1000000.0;
    }
}
