import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;


public class Test {
	
	public static void main(String[] args) {
		
		//System.out.println("srinath , ".contains("srinath"));
		//String abc = "125+584+417";
		//System.out.println(abc.split("\\+")[0]);
		
		/*
		String[] arrayStr = {"aa", "bb", "cc"};		
		StringBuilder builder = new StringBuilder();
		for(String str : arrayStr){
			builder.append(str);
			builder.append("+");
		}
		*/
		
		//System.out.println(builder.toString());
		
		System.out.println(Double.parseDouble("15"));
		
		Calendar calendar = Calendar.getInstance();
		long timeInMillis = calendar.getTimeInMillis();
		System.out.println(timeInMillis);
		
		
		long timein = timeInMillis - (15 * 60 * 1000);
		System.out.println(timein/1000);
		
		
		calendar.add(Calendar.MINUTE, -15 );
		long time = (calendar.getTime().getTime())/1000;
		System.out.println(time);
		
		
		
		System.out.println(new Double("1115.150").intValue());
		
		
		
		String input = ".15";
		
		
		//System.out.println(input.split("\\.")[1]);
		
		
		//System.out.println((int) - (60 * Double.parseDouble(".150")));
		
		System.out.println(callSwitchMethod());
		
		
	}
	
	
	private static String callSwitchMethod() {
		
		switch ("abc") {
		case "abc":
			
			if(1 == 1)
				return "abc";
			
			break;

		default:
			System.out.println("default");
			break;
		}
		
		
		System.out.println("hey");
		
		return null;
	}


	private static void readLinesUsingFileReader() throws IOException
	{
	    File file = new File("c:/temp/data.txt");
	    FileReader fr = new FileReader(file);
	    BufferedReader br = new BufferedReader(fr);
	    String line;
	    int i =0;
	    
	    while((line = br.readLine()) != null){
	    	
	    	if(i < 4){
	    		i++;
	    		continue;
	    	}
	        if(line.contains("password")){
	            System.out.println(line);
	        }
	        i++;
	    }
	    
	    br.close();
	    fr.close();
	}

}