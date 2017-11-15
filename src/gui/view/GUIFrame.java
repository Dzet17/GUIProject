package gui.view;

import gui.controller.GUIAppController;
import gui.view.GUIPanel;

public class GUIFrame extends JFrame
{
	private GUIAppController appController;
	private GUIPanel firstPanel;
	
	public GUIFrame(GUIAppController appController)
	{
		super();
		this.appController = appController;
		this.firstPanel = new GUIPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(firstPanel);
		this.setTitle("The Window Title");
		this.setSize(500, 500);
		this.setResizable(false);
		this.setVisible(true);
	}

}
