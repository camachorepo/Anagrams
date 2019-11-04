import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class anagrams {
	public static void main (String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		//Number of inputs entered 
		int values = Integer.parseInt(br.readLine()); 
		
		for(int i =0; i < values; i++){
		    
		    String s = br.readLine(); 
		    String firstWord = s.split(" ")[0]; 
		    String secondWord = s.split(" ")[1];
		    char [] a = firstWord.toCharArray();
		    char [] b = secondWord.toCharArray();
		    
		    Arrays.sort(a);
		    Arrays.sort(b);
		    
		    String stringa = new String(a);
		    String stringb = new String(b); 
		    
		    if(stringa.equals(stringb)){
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		    
		    
		}

}		
		



}
