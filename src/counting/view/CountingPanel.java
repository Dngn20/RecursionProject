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
	private JButton iterFibButton;
	private JButton iterFacButton;
	
	
	
	
	
	public CountingPanel(CountingController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.fibButton = new JButton("fib");
		this.factButton = new JButton("Fact");
		this.textField = new JTextField(35);
		this.textArea = new JTextArea(20, 40);
		this.iterFibButton = new JButton("Iteration for Fibanocci");
		this.iterFacButton = new JButton("Iteration for the Factorial");
		
		
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
				textArea.setText(baseController.transferFactorial(textField.getText()));
			}
		});
		
		fibButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				textArea.setText(baseController.transferFibonacci(textField.getText()));
			}
		});
		iterFibButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				textArea.setText(baseController.transferFactorial(textField.getText()));
			}
		});
	}
	
	
	private void setupPanel()
	{
		this.add(fibButton);
		this.add(iterFibButton);
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
		baseLayout.putConstraint(SpringLayout.NORTH, iterFibButton, 0, SpringLayout.NORTH, fibButton);
		baseLayout.putConstraint(SpringLayout.WEST, iterFibButton, 102, SpringLayout.EAST, factButton);
	}


	


}
