package chatbot.controller;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotPanel;
import chatbot.view.ChatbotView;

/**
 * Application Controller for Chatbot project. Controls the View and Model packages.
 * @author Avery Boman
 * @version 1.4 12/19/2014 - Finishing touches and final commit.
 */
public class ChatbotAppController
{
	/**
	 * The Chatbot app's GUI.
	 */
	private ChatbotView appView;
	
	/**
	 * Chatbot's model instance.
	 */
	private Chatbot notSoCleverbot;
	
	/**
	 * The message Chatbot will display on startup.
	 */
	private String startMessage;
	
	/**
	 * GUI frame for the Chatbot.
	 */
	private ChatbotFrame baseFrame;
	
	/**
	 * Creates a ChatbotAppController and initializes the View and Model objects.
	 */
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		baseFrame = new ChatbotFrame(this);
		notSoCleverbot = new Chatbot("Mr. Notso C. Lever");
		startMessage = "Hello, and welcome to the " + notSoCleverbot.getName() + " Chatbot. Please type in your name.";
	}
	
	/**
	 * Allows other objects to access the notSoCleverBot.
	 * @return The Chatbot for this app.
	 */
	public Chatbot getNotSoCleverbot()
	{
		return notSoCleverbot;
	}
	
	public ChatbotFrame getBaseFrame()
	{
		return baseFrame;
	}
	
	/**
	 * Starts the Chatbot application.
	 */
	public void start()
	{
		ChatbotPanel myAppPanel = (ChatbotPanel)baseFrame.getContentPane();
		myAppPanel.displayTextToUser(startMessage);
		
		//(ChatbotPanel)baseFrame.getContentPane()).displayTextToUser(startMessage);
	}
	
	/**
	 * Quits the program.
	 */
	private void quit()
	{
		appView.displayInformation("Farewell, dear user! Until we meet again.");
		System.exit(0);
	}
	
	public String sendTextToChatbot(String userInput)
	{
		String respondText = "";
		
		respondText = notSoCleverbot.processText(userInput);
		
		return respondText;
	}
}
