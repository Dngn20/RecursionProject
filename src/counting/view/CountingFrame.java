package counting.view;

import javax.swing.JFrame;
import counting.controller.CountingController;
import java.awt.Dimension;

public class CountingFrame extends JFrame
{
	private CountingController baseController;
	private CountingPanel appPanel;

	public CountingFrame(CountingController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new CountingPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(new Dimension (900, 600));
		this.setTitle("The Simple Games");
		this.setSize(new Dimension(900, 600));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		// GOOD CODE RIGHT HERE
	}

}
