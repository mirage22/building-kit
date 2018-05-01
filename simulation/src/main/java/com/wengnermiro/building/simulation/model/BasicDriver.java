package com.wengnermiro.building.simulation.model;

/**
 * Mutable model
 *
 * @author Miroslav Wengner (@miragemiko)
 */

public class BasicDriver implements Driver {
    private final String name;

    public BasicDriver(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
