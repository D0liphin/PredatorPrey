package uk.ac.kcl;

import javax.swing.*;
import java.awt.*;
import uk.ac.kcl.util.Tuple;

/**
 * Class managing the swing GUI for this simulation
 */
public class SimulationView {
    /** The main JFrame */
    JFrame frame;
	JPanel panel;

    /**
     * Sets up and starts the simulation
     */
    protected SimulationView(SimulationViewBuilder builder) {
        this.frame = new JFrame(builder.title);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(builder.dimensions.getA(), builder.dimensions.getB());
        this.frame.setVisible(true);

		this.panel = new JPanel();
		this.frame.getContentPane().add(this.panel);
    }

	/**
	 * draws a frame to the panel
	 */
	void draw() {

	}

    /**
     * Class for setting the parameters to the SimulationView
     * window.
     */
    public static class SimulationViewBuilder {
        public String title = "No Title";
        public Tuple<Integer, Integer> dimensions =
            new Tuple<Integer, Integer>(100, 100);

        /** Create a new SimulatinViewBuilder */
        public SimulationViewBuilder() {}

        /**
         * Consumes this builder, returning a SimulationView
         * and initialising it
         */
        public SimulationView build() { return new SimulationView(this); }
    }
}