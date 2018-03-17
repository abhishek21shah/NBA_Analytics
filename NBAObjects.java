import java.util.Scanner;


public class NBAObjects {

	public String PlayerFirstName;
	public String PlayerLastName;
	public int Points;
	public int Seasons;
	public int Games;
	public int FieldGoalsMade;
	public int FieldGoalsAttempted;

	public NBAObjects (String f, String l, int p, int s, int g, int m, int a)
	{
		PlayerFirstName = f;
		PlayerLastName = l;
		Points = p;
		Seasons = s;
		Games = g;
		FieldGoalsMade = m;
		FieldGoalsAttempted = a;
	}
	
	public String FirstName()
	{
		return PlayerFirstName;
	}

	public String LastName()
	{
		return PlayerLastName;
	}

	public int Points()
	{
		return Points;
	}

	public int Seasons()
	{
		return Seasons;
	}

	public int Games()
	{
		return Games;
	}

	public int GoalsMade()
	{
		return FieldGoalsMade;
	}

	public int GoalsAttempted()
	{
		return FieldGoalsAttempted;
	}

	public String allInfo()
	{
		String info = PlayerFirstName + " " + PlayerLastName + " " + Points + " " + Seasons + " " + Games + " " + FieldGoalsMade + " " + FieldGoalsAttempted;
		return info;
	}

}
