package com.wengnermiro.building.application;

import com.wengnermiro.building.simulation.Simulation;

import java.util.ServiceLoader;

/**
 * @author Miroslav Wengner (@miragemiko)
 */
public class ApplicationMain {
    public static void main(String[] args) {
        System.out.println("... Application Start: Loading Simulation ...");

        ServiceLoader<Simulation> simulations = ServiceLoader.load(Simulation.class);
        for(Simulation simulation: simulations){
            System.out.println("result: " + simulation.simulate());
        }
    }
}
