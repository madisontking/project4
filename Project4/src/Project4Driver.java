import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project4Driver
{
	
	/**
	 * This is the main method for the MDB program
	 * @param args
	 * @throws IOException 
	 */
	
	public static void  main(String[] args) throws IOException
	{
		/** input reader to read user input in*/
		BufferedReader inputReader = new BufferedReader( new InputStreamReader( System.in ) );
		
		/** database of media (episodes, series, movies) */ 
		MediaDataBase DB = new MediaDataBase();
		
		/** database of mediaMakers (actors, producers, directors) */
		MediaMakerDataBase MMDB = new MediaMakerDataBase();
		
		
		//MDB Starts up, and asks for type of file the user will be reading in
		System.out.println("Read (t)ext or (b)inary file?");
		String txtOrBinary = inputReader.readLine();  // user answer for type of file
			//**If user is reading in a .TXT file ask for series of 5 files
			if(txtOrBinary.equalsIgnoreCase("t"))
			{
				readMovieFile(inputReader, DB);
				readSeriesFile(inputReader, DB);
				readActorFile(inputReader,MMDB);
				readDirectorFile(inputReader,MMDB);
				readProducerFile(inputReader,MMDB);
				
			}
			
	}
	
	
	/**
	 * a method for reading in a movie file to a dataBase
	 * @param inputReader
	 * @param DB- the dataBase being read into
	 * @throws IOException 
	 */
	public static void readMovieFile(BufferedReader inputReader, MediaDataBase DB) throws IOException
	{
		System.out.println("Please enter the name of your Movie file");
		String movieFile = inputReader.readLine();
		SourceReader reader;
		try
		{
			read = new SourceReader(movieFile);
			
		}
		
	}
	
	/**
	 * a method for reading in a series file to a dataBase
	 * @param inputReader
	 * @param DB- the dataBase being read into
	 * @throws IOException 
	 */
	public static void readSeriesFile(BufferedReader inputReader, MediaDataBase dB) throws IOException
	{
		System.out.println("Please enter the name of your Series file");
		String seriesFile = inputReader.readLine();
		
		
	}
	
	/**
	 * a method for reading in a producer file to a dataBase
	 * @param inputReader
	 * @param MMDB- the dataBase being read into
	 * @throws IOException 
	 */
	public static void readProducerFile(BufferedReader inputReader, MediaMakerDataBase MMDB) throws IOException
	{
		System.out.println("Please enter the name of your Producer file");
		String prodFile = inputReader.readLine();
		
	}
	
	/**
	 * a method for reading in a Director file to a dataBase
	 * @param inputReader
	 * @param MMDB- the dataBase being read into
	 * @throws IOException 
	 */
	public static void readDirectorFile(BufferedReader inputReader, MediaMakerDataBase MMDB) throws IOException
	{
		System.out.println("Please enter the name of your Director file");
		String directFile = inputReader.readLine();
		
	}
	
	/**
	 * a method for reading in a Actor file to a dataBase
	 * @param inputReader
	 * @param MMDB- the dataBase being read into
	 * @throws IOException 
	 */
	public static void readActorFile(BufferedReader inputReader, MediaMakerDataBase MMDB) throws IOException 
	{
		System.out.println("Please enter the name of your Actor file");
		String actorFile = inputReader.readLine();
		
	}
	

}
