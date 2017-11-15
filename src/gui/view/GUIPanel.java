package gui.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.SpringLayout;

import gui.controller.GUIAppController;
import gui.view.GUIFrame;

public class GUIPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Wow a button");
		baseLayout = new SpringLayout();
				
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	//used to add all components to the subclass of JPanel
	//this installs them into the panel so they hare seen in the GUI
	
	private void setupPanel()
	{
		this.setBackground(Color.MAGENTA);
		this.setLayout(baseLayout);
		this.add(firstButton);
	}
	
	//This is used to hold all the layout and arrangement code for SpringLayout
	
	private void setBackground(Color magenta)
	{
		
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton,  89,  SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton,  117,  SpringLayout.WEST, this);
		
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
	}
	
	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	
}
