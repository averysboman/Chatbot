package chatbot.model;

public class ChatUser
{
	private String name;
	private int age;
	private String favoriteMovie;
	private boolean isPierced;
	private boolean isTattooed;
	
	/**
	 * Specifies the characteristics of User.
	 */
	public ChatUser()
	{
		this.name = "";
		this.age = -999;
		this.favoriteMovie = "";
		this.isPierced = false;
		this.isTattooed = false;
	}

	/**
	 * Gets the name of User.
	 * @return
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the name of User.
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Gets the age of User.
	 * @return
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * Sets the age of User.
	 * @param age
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

	/**
	 * Gets User's favorite movie.
	 * @return
	 */
	public String getFavoriteMovie()
	{
		return favoriteMovie;
	}

	/**
	 * Sets User's favorite movie.
	 * @param favoriteMovie
	 */
	public void setFavoriteMovie(String favoriteMovie)
	{
		this.favoriteMovie = favoriteMovie;
	}

	/**
	 * Determines whether User is pierced or not.
	 * @return true or false value.
	 */
	public boolean isPierced()
	{
		return isPierced;
	}

	/**
	 * Sets User to be pierced or not pierced.
	 * @param isPierced
	 */
	public void setPierced(boolean isPierced)
	{
		this.isPierced = isPierced;
	}

	/**
	 * Determines whether User has tattoos or not.
	 * @return true or false value.
	 */
	public boolean isTattooed()
	{
		return isTattooed;
	}

	/**
	 * Sets User to have tattoos or to not have tattoos.
	 * @param isTattooed
	 */
	public void setTattooed(boolean isTattooed)
	{
		this.isTattooed = isTattooed;
	}
}
