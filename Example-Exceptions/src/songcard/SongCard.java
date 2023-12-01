package songcard;

public class SongCard {
	
	private int songs;
	private boolean activated;
	
	public SongCard(int n)
	{
		songs = n;
		activated = false;
	}
	
	public void activate()
	{
		try
		{
			if(activated)
			{
				throw new Exception("Card already activated.");
			}
			activated = true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public int songsRemaining()
	{
		return songs;
	}
	
	public void buyASong()
	{
		try
		{
			if(!activated)
			{
				throw new Exception("Card hasn't been activated.");
			}
			if(songs <= 0)
			{
				throw new Exception("Card has no songs left.");
			}
			songs--;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
