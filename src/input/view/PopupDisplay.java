package input.view;

import javax.swing.JOptionPane;
/**
 * This class provides popups for input and output. 
 * @author akin8529
 * @version 1.0 9/24/15
 */
public class PopupDisplay
{

	public String getAnswer(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
