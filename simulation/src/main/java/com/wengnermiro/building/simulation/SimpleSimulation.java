package com.wengnermiro.building.simulation;

/**
 * @author Miroslav Wengner (@miragemiko)
 */
public class SimpleSimulation implements Simulation {
    @Override
    public String simulate() {
        System.out.println("simulation runs -> stop");
        return "done";
    }
}
