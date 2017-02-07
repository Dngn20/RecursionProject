package counting.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import counting.controller.CountingController;

public class CountingPanel extends JPanel
{
	

	private CountingController  baseController;
	private SpringLayout baseLayout;
	private JTextField textField;
	private JButton fibButton;
	private JButton factButton;
	private JTextArea textArea;
	
	
	
	
	
	
	public CountingPanel(CountingController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.fibButton = new JButton("Fact");
		this.factButton = new JButton("Fib");
		this.textField = new JTextField(35);
		this.textArea = new JTextArea(20, 40);
		
		setupListeners();
		setupPanel();
		setupLayout();
		
	}
	
	private void setupListeners()
	{
		factButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				
			}
		});
		
		fibButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				
			}
		});
	}
	
	private void setupPanel()
	{
		this.add(fibButton);
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(500, 500));
		this.add(factButton);
		this.add(textField);
		this.add(textArea);
		textArea.setEditable(false);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
	}


	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, fibButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, fibButton, -20, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, factButton, 0, SpringLayout.NORTH, fibButton);
		baseLayout.putConstraint(SpringLayout.WEST, factButton, 21, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textField, -12, SpringLayout.NORTH, fibButton);
		baseLayout.putConstraint(SpringLayout.EAST, textField, -22, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textArea, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textArea, 10, SpringLayout.WEST, this);
	}


	


}
