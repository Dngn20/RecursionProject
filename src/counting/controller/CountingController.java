package counting.controller;

import counting.view.*;

import javax.swing.JOptionPane;

import counting.model.*;

public class CountingController 
{
	private CountingFrame baseFrame;
	private RecursionTool mathTool;
	private Timer mathTimer;
	
	public CountingController()
	{
		this.baseFrame = new CountingFrame(this);
		this.mathTool = new RecursionTool();
		this.mathTimer = new Timer();
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Math here");
	}

	public String transferFactorial(String input)
	{
		String factorialInfo = "The iteration of " + input + " is ";
		
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			factorialInfo += mathTool.calculateFactorial(Integer.parseInt(input));
		}
		
		mathTimer.stoptimer();
		factorialInfo += "\n" + mathTimer.toString();
		
		return factorialInfo;
		
	}
	
	public String transferFibonacci(String input)
	{
		String fibanocciInfo = "";
		
		mathTimer.resetTimer();
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			fibanocciInfo += mathTool.calculateFibonacci(Integer.parseInt(input));
		}
		
		mathTimer.stoptimer();
		fibanocciInfo += "\n" + mathTimer;
		
		
		return fibanocciInfo;
	}
	
	public String trasferIterationFac(String input)
	{
		String iterationInfo = "";
		
		mathTimer.resetTimer();
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			iterationInfo += mathTool.calculateFibonacci(Integer.parseInt(input));
		}
		
		mathTimer.stoptimer();
		iterationInfo += "\n" + mathTimer;
		
		
		return iterationInfo;
	}
	
	private boolean isValid(String testValue)
	{
		try
		{
			double test = Double.parseDouble(testValue);
			if(test >= 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(baseFrame ,"type in a valid number >= 0" );
			return false;
		}
	}
	

}
