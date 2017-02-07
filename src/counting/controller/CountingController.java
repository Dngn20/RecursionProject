package counting.controller;

import counting.view.*;
import counting.model.*;

public class CountingController 
{
	private CountingFrame baseFrame;
	private RecursionTool mathTool;
	
	public CountingController()
	{
		this.baseFrame = new CountingFrame(this);
		this.mathTool = new RecursionTool();
	}
	
	public void start()
	{
		
		
	}

	
}
