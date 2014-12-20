package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatbotAppController;

public class ChatbotFrame extends JFrame
{
	private ChatbotPanel basePanel;
	
	/**
	 * Sets up the frame for the ChatbotPanel to reside in.
	 * @param baseController the frame.
	 */
	public ChatbotFrame(ChatbotAppController baseController)
	{
		setResizable(false);
		basePanel = new ChatbotPanel(baseController);
		setupFrame();
	}
	
	/**
	 * Sets the size, resizability, and visibility of the ChatbotFrame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 350);
		this.setVisible(true);
	}
}
