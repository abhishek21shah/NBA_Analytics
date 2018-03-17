import java.io.*;
import java.util.*;
public class NBATest {

	static Scanner ff;
	static String line; 
	static int maxIndx;   
	static NBAObjects NBA[] = new NBAObjects[100];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		loadFiles();
		Menu();
		/*searchFirst();
		searchLast();
		searchPoints();
		searchGames();
		searchSeasons();
		searchMade();
		searchAttempted();*/
	}
	
	static void loadFiles() throws IOException
	{
		Scanner lf = new Scanner(new File("nba")); 
		maxIndx = -1;

		while(lf.hasNextLine())
		{
			//grab the line of text 
			line = lf.nextLine();
			//create a scanner object to parse the line of text
			ff = new Scanner(line).useDelimiter(",");
			maxIndx++;
			//create the record using the appropriate scanner methods for the arguments of the constructor
			NBA[maxIndx]= new NBAObjects(ff.next().toUpperCase(),ff.next().toUpperCase(),ff.nextInt(), ff.nextInt(),ff.nextInt(),ff.nextInt(),ff.nextInt());
		}  
		//close the scanner we used for the line
		ff.close(); 
		//close the main scanner object    
		lf.close();

		//output all the data - a test 
		for(int a = 0; a <= maxIndx; a++)
		{
			//System.out.println(NBA[a].allInfo());
		}
	}

	public static void Menu()
	{
		System.out.println("Make your search selections from the choices below:\n"); 
		System.out.println(" 1. Player's First Name"); 
		System.out.println(" 2. Player's Last Name"); 
		System.out.println(" 3. Points"); 
		System.out.println(" 4. Seasons");
		System.out.println(" 5. Games");
		System.out.println(" 6. Field Goals Made");
		System.out.println(" 7. Field Goals Attempted");
		System.out.println(" 8. Finish Searching");
		
		System.out.print("\nYour Choice: ");
		
		Scanner selection = new Scanner(System.in);
		int choice = selection.nextInt();

		System.out.println("");

		switch (choice)
		{
			case 1:
				searchFirst();
				break;
			case 2:
				searchLast();
				break;
			case 3:
				searchPoints();
				break;
			case 4:
				searchSeasons();
				break;
			case 5:
				searchGames();
				break;
			case 6:
				searchMade();
				break;
			case 7:
				searchAttempted();
				break;
			case 8:
				break;
			default:
					System.out.println("Hey bozo, enter only a 1, 2, 3, 4, 5, 6, 7, or 8!");
		}
		
	}
	static void searchFirst()
	{
		Scanner kbReader = new Scanner (System.in);
		System.out.print("Enter first few letters of Player's First Name: ");
		String f = kbReader.next().toUpperCase();
		for (int a = 0; a <=maxIndx; a++)
		{
			if (NBA[a].PlayerFirstName.indexOf(f)==0)
			{
				System.out.println(NBA[a].allInfo());
			}
		}
		System.out.println("");
		Menu();
	
	}

	static void searchLast()
	{
		Scanner kbReader = new Scanner (System.in);
		System.out.print("Enter first few letters of Player's Last Name: ");
		String l = kbReader.next().toUpperCase();
		for (int a = 0; a <=maxIndx; a++)
		{
			if (NBA[a].PlayerLastName.indexOf(l)==0)
			{
				System.out.println(NBA[a].allInfo());		
			}
		}
		System.out.println("");
		Menu();
	}

	static void searchPoints()
	{
		Scanner kbReader = new Scanner (System.in);
		System.out.print("Please Enter an amount of Points: ");
		int p = kbReader.nextInt();
		for (int a = 0; a <= maxIndx; a++)
			if (NBA[a].Points >= p)
			{
				System.out.println(NBA[a].allInfo());
				
			}
		System.out.println("");
		Menu();
	}

	static void searchSeasons()
	{
		Scanner kbReader = new Scanner (System.in);
		System.out.print("Please Enter an amount of Seasons: ");
		int s = kbReader.nextInt();
		for (int a = 0; a <= maxIndx; a++)
			if (NBA[a].Seasons >= s)
			{
				System.out.println(NBA[a].allInfo());				
			}
		System.out.println("");
		Menu();
	}

	static void searchGames()
	{
		Scanner kbReader = new Scanner (System.in);
		System.out.print("Please Enter an amount of Games: ");
		int g = kbReader.nextInt();
		for (int a = 0; a <= maxIndx; a++)
			if (NBA[a].Games >= g)
			{
				System.out.println(NBA[a].allInfo());			
			}
		System.out.println("");
		Menu();
	}

	static void searchMade()
	{
		Scanner kbReader = new Scanner (System.in);
		System.out.print("Please Enter an amount of Field Goals Made: ");
		int m = kbReader.nextInt();
		for (int a = 0; a <= maxIndx; a++)
			if (NBA[a].FieldGoalsMade >= m)
			{
				System.out.println(NBA[a].allInfo());
			}
		System.out.println("");
		Menu();
	}

	static void searchAttempted()
	{
		Scanner kbReader = new Scanner (System.in);
		System.out.print("Please Enter an amount of Field Goals Attempted: ");
		int ga = kbReader.nextInt();
		for (int a = 0; a <= maxIndx; a++)
			if (NBA[a].FieldGoalsAttempted >= ga)
			{
				System.out.println(NBA[a].allInfo());		
			}
		System.out.println("");
		Menu();
	}
}
