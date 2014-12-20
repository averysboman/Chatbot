package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatbotAppController;

public class ChatbotView
{
	private ChatbotAppController baseController;
	public ChatbotView(ChatbotAppController baseController)
	{
		this.baseController = baseController;
	}
	
	/**
	 * Displays the supplied String parameter to the user with a popup and gives the user's response to the Controller.
	 * @param input the text to be displayed.
	 * @return the user's input.
	 */
	public String displayChatbotConversation(String input)
	{
		String output = "";
		output = JOptionPane.showInputDialog(null, input);
		return output;
	}
	
	/**
	 * Displays the user's previously supplied input.
	 * @param input the text to be displayed.
	 */
	public void displayInformation(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
