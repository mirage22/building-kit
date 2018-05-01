module com.wengnermiro.building.simulation {
    exports com.wengnermiro.building.simulation;
    provides com.wengnermiro.building.simulation.Simulation
            with com.wengnermiro.building.simulation.SimpleSimulation;
}