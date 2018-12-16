package canvas;

import javax.swing.JFrame;

public class Canvas {

	public void createCanvas() {
		JFrame frame = new JFrame();
		
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Display the window.
        frame.pack();
        frame.setVisible(true);
	}
}
