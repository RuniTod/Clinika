package ru.Cliniks.Clinika;

public class Counter {
    private int amount;

    public synchronized int increase(){
        this.amount++;
        return this.amount;
    }

}
