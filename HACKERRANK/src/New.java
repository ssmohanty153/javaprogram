import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'oddNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER l
     *  2. INTEGER r
     */

    public static List<Integer> oddNumbers(int l, int r) 
    {
    	List<Integer> l1=new ArrayList<Integer>();
    	
    	
    	
    	for(int i=l;i<=r;i++)
    	{
    		l1.add(i);
    	
    		
    	}
    	Iterator iterator = l1.iterator(); 
        while (iterator.hasNext())
        {
        	
        	for(int i=0;i<l1.size();i++)
        	{
        		if(l1.indexOf(i)/2==1)
        		{
        			System.out.println(l1.indexOf(i));
        			
        		}
        	}
        
        }
    		
    
		return l1;
    // Write your code here

    }

}

public class New {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = Result.oddNumbers(l, r);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
