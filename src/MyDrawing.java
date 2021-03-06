import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyDrawing extends JPanel {
	private Cat cat;
	public MyDrawing() 
	{
		// Add critters to the drawing
		cat = new Cat();
	}
	// paintComponent is called automatically when the frame needs
	// to display (e.g., when the program starts)
	public void paintComponent(Graphics g) {
		cat.draw(g, 50, 50);
		
		//added a second cat at a new location 
		cat.draw(g, 300, 300);
		
		//added a third cat at a new location 
		cat.draw(g, 50, 300);
		
		//added a forth cat at a new location 
		cat.draw(g, 300, 50);
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// Create a JPanel (MyDrawing), we'll draw on this
		frame.setContentPane(new MyDrawing());
		// Program will end when the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the size (otherwise only title bar displays)
		//frame.setSize(400, 400);
		
		//Changed the frame size for my first git 
		frame.setSize(600, 600);
		
		// Frame will not display until you set visible true
		frame.setVisible(true);
	}

}
