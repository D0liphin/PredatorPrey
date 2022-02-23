package uk.ac.kcl;

import uk.ac.kcl.util.Tuple;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SimulationView simulationView =
            new SimulationView
                .SimulationViewBuilder() {
                    {
                        title = "Predator Prey";
                        dimensions = new Tuple<Integer, Integer>(600, 600);
                    }
                }
                .build();
		
    }
}
