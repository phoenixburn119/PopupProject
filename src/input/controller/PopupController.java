package input.controller;

import input.view.PopupDisplay;
import input.model.Thing;

public class PopupController
{
	private PopupDisplay myPopups;
	private Thing myThing;
	
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	{
		/**
		 * Starts the whole input system.
		 */
		String name = myPopups.getAnswer("Type in your name");
		
		myPopups.displayResponse("Thank you, " + name);
		
		//Checks and sets age
		int age;
		String tempAge = myPopups.getAnswer("Type in your age");
		
		while(!isInteger(tempAge))
		{
			tempAge = myPopups.getAnswer("Type in an integer value.");
		}
		
		
		if(isInteger(tempAge))
		{
			age = Integer.parseInt(tempAge);
		}
		else
		{
			age = 16;
		}
		
		myPopups.displayResponse("You are " + age);
		
		//Checks and sets weight
		double weight;
		String tempWeight = myPopups.getAnswer("Type in your weight");
		
		while(!isDouble(tempWeight))
		{
			tempWeight = myPopups.getAnswer("Give me a valid double value.");
		}
		
		if(isDouble(tempWeight))
		{
			weight = Double.parseDouble(tempWeight);
		}
		else
		{
			weight = 120;
		}
		myPopups.displayResponse("You typed in " + weight);
		
		myThing = new Thing(name, age, weight);
		
		myPopups.displayResponse(myThing.toString());
	}
	
	/**
	 * The fail answer if you do not put in a valid age.
	 * @param input
	 * @return
	 */
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int validInteger = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("You did not type in a valid integer.");
		}
		return isInt;
	}
	
	/**
	 * The fail answer if you do not put in a valid weight.
	 * @param input
	 * @return
	 */
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("You did not type in a valid number.");
		}
		return isDouble;
	}
}
