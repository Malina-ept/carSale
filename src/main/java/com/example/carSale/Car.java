package com.example.carSale;

public class Car {
    //private ClassicConfiguration classicConfiguration;
//    private SportConfiguration sportConfiguration;
//
//    public String readyForSale() {
        //classicConfiguration = new ClassicConfiguration();
//        sportConfiguration = new SportConfiguration();
//        return "Car Ready in: " + sportConfiguration.makeConfiguration();
//    }
//    private Configurable configuration;
//    public String readyForSale() {
////        configuration = new ClassicConfiguration();
//        configuration = new SportConfiguration();
//        return "Car Ready in: " + configuration.makeConfiguration();
//    }
    private Configurable configuration;


    public Car(Configurable configuration) {
        this.configuration = configuration;
    }
    public String readyForSale() {
        return "Car Ready in: " + configuration.makeConfiguration();
    }


}
