package array.view;

import javax.swing.JOptionPane;

public class Popup
{
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	public String askQuestion(String question)
	{
		String answer = JOptionPane.showInputDialog(null, question);
		if(answer == null)
		{
			answer = "";
		}
		return answer;
	}
}
