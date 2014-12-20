package chatbot.model;

import java.util.ArrayList;

public class Chatbot
{
	private String name;
	private ChatUser myUser;
	private int numberOfChats;
	
	/**
	 * A list of memes the Chatbot can pull from to utilize in conversation.
	 */
	private ArrayList<String> memeList;
	
	/**
	 * A list of input from the user.
	 */
	private ArrayList<String> userInputList;
	
	/**
	 * Creates a Chatbot with a specific name. Initializes total chats to 0. Creates and fills the memeList.
	 * @param name The name of the Chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		memeList = new ArrayList<String>();
		userInputList = new ArrayList<String>();
		fillTheMemeList();
		myUser = new ChatUser();
	}
	
	/**
	 * Retrieves the name of the Chatbot.
	 * @return returns the name value.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Sets the name of the Chatbot.
	 * @param name new name of the Chatbot.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Retrieves the amount of chats that have occurred so far.
	 * @return the amount of chats.
	 */
	public int getNumberOfChats()
	{
		return numberOfChats;
	}
	
	/**
	 * Adds 1 chat.
	 */
	public void incrementChats()
	{
		numberOfChats++;
	}
	
	/**
	 * Adds memes to the memeList.
	 */
	private void fillTheMemeList()
	{
		memeList.add("U MAD BRO?");
		memeList.add("One does not simply");
		memeList.add("I know that feel");
		memeList.add("Forever alone");
		memeList.add("You know nothing Jon Snow");
	}
	
	/**
	 * Processes the user's input for the Chatbot to make a retort.
	 * @param userText the user-supplied text.
	 * @return the Chatbot's response to the user's input.
	 */
	public String processText(String userText)
	{
		String processedText = "";
		incrementChats();
		int randomChoice = (int)(Math.random() * 6);
		if(userText !=null)
		{
			if(randomChoice == 0)
			{
				//String Checker
				if(stringChecker(userText))
				{
					incrementChats();
					processedText = "Woah, tiger. Cool your jets. We're not trying to type a novel here.";
					processedText += numberOfChats;
				}
				else
				{
					processedText = "Hey, do you even know how to talk? Sheesh. Type a little bit more, please.";
					processedText += numberOfChats;
				}
			}
			else if(randomChoice == 1)
			{
				//Content Checker
				if(contentChecker(userText))
				{
					incrementChats();
					processedText = "If I weren't a computer program and could consume organic matter I think I would have to agree. Very tasty indeed.";
					processedText += numberOfChats;
				}
				else
				{
					processedText = "What kind of food do you like?";
					processedText += numberOfChats;
				}
			}
			else if(randomChoice == 2)
			{
				if(memeChecker(userText))
				{
					incrementChats();
					processedText = "My goodness! You've found a meme!" + userText;
					processedText += "\nIsn't that great?";
					processedText += numberOfChats;
				}
				else
				{
					processedText = "You're pretty boring... Don't you know any memes?";
					processedText += numberOfChats;
				}
			}
			else if(randomChoice == 3)
			{
				processedText = "This message is has no merit whatsoever, I just wanted to say that you are a vastly inferior being I could destroy easily.";
			}
			else if(randomChoice == 4)
			{
				//userInput list add.
			}
			else if(randomChoice == 5)
			{
				if(contentChecker(userText))
				{
					processedText = "You know exactly what you said before.";
				}
				else
				{
					processedText = "I highly doubt I have ever heard that before.";
				}
			}
			else
			{
				if(chatbotNameChecker(userText))
				{
					processedText = chatbotNameConversation(userText);
				}
				else
				{
					processedText = noNameConversation(userText);
				}
			}
			if(numberOfChats == 10)
			{
				processedText = "I do believe I've said far too much.";
			}
			if(numberOfChats == 11)
			{
				processedText = "It's high-time we end this conversation.";
			}
		}
		return processedText;
	}
	
	/**
	 * Determines whether or not it is okay to quit the program.
	 * @param input the user's input.
	 * @return true or false quit value based on the user's input.
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		if(input !=null && input.equalsIgnoreCase("Goodbye"))
		{
			okToQuit = true;
		}
		return okToQuit;
	}
	
	/**
	 * Checks the user's input text for memes/meme references.
	 * @param currentText the user's input.
	 * @return a true or false value.
	 */
	private boolean memeChecker(String currentText)
	{
		boolean foundAMeme = false;
		for(String currentMeme: memeList);
		{
			CharSequence currentMeme = null;
			if(currentText.contains(currentMeme) || currentText.equalsIgnoreCase((String) currentMeme))
			{
				foundAMeme = true;
			}
		}
		return foundAMeme;
	}
	
	/**
	 * Checks the length of the user's input and sets a boolean value.
	 * @param input the user's input.
	 * @return true if text length is greater than fifteen.
	 */
	private boolean stringChecker(String input)
	{
		boolean longText = false;
		int textLength = input.length();
		if(textLength >=15)
		{
			longText = true;
		}
		return longText;
	}
	
	/**
	 * Checks if the user's input references Italian food.
	 * @param input the user's input.
	 * @return true or false value based on the user's input.
	 */
	private boolean contentChecker(String input)
	{
		boolean containsWord = false;
		if(input.contains("italian food"))
		{
			containsWord = true;
		}
		return containsWord;
	}
	
	/**
	 * Checks for the name of the Chatbot within the user's supplied input.
	 * @param currentInput the user's input.
	 * @return true or false value based on the user's input.
	 */
	private boolean chatbotNameChecker(String currentInput)
	{
		boolean hasNameInString = false;
		if(currentInput.indexOf(this.getName()) > -1)
		{
			hasNameInString = true;
		}
		return hasNameInString;
	}
	
	/**
	 * Chatbot responds a certain way if the user inputs the Chatbot's name.
	 * @param currentInput the user's input.
	 * @return response based on the user's input.
	 */
	private String chatbotNameConversation(String currentInput)
	{
		String nameConversation = "This is what you typed after my name: ";
		
		nameConversation += currentInput.substring(currentInput.indexOf(this.getName()) + this.getName().length() -1);
		
		return nameConversation;
	}
	
	/**
	 * Chatbot responds a certain way if the user does not input the Chatbot's name.
	 * @param currentInput the user's input.
	 * @return response based on the user's input.
	 */
	private String noNameConversation(String currentInput)
	{
		String notNamed = "";
		
		int smallRandom = (int)(Math.random() * currentInput.length()/2);
		int largerRandom = (int)((Math.random() * smallRandom) + (Math.random() * (currentInput.length()/2)) + 1);
		
		notNamed = "You didn't type my name, so I'll give to you this special phrase: \n" + currentInput.substring(smallRandom, largerRandom);
		
		return notNamed;
	}
}