package com.kodilla.good.patterns.foodchallenge;

public class Deliverer {

    private String producerName;

    public Deliverer(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerName() {
        return producerName;
    }

    @Override
    public String toString() {
        return "Deliverer{" +
                "producerName='" + producerName + '\'' +
                '}';
    }
}
