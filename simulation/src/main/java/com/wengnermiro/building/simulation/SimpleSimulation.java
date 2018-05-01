package com.wengnermiro.building.simulation;

import com.wengnermiro.building.simulation.model.BasicDriver;

/**
 * @author Miroslav Wengner (@miragemiko)
 */

public class SimpleSimulation implements Simulation {

    @Override
    public String simulate() {
        var driver = new BasicDriver("magic");
        return new StringBuilder()
                .append("Simulation:")
                .append("driver:")
                .append(driver.getName())
                .toString();
    }
}
