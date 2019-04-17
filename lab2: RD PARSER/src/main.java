import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class main {
	public static void main(String args[]){
		  String line = "//I am a comment";
	      String pattern ="[a-zA-Z]*[(][a-zA-Z| \\s]*[)]";
	      String identifier="[a-zA-Z| 0-9 ]+[_]*[0-9]*[a-zA-Z]";
	      String if_er="[i][f][{][a-zA-Z|0-9|\\s]*[)]";
	      String single_comment="[/][/].{3,}.";
	      // Pattern object
	      Pattern r = Pattern.compile(pattern);
	      Pattern i = Pattern.compile(identifier);
	      Pattern if_key= Pattern.compile(if_er);
	      Pattern single_key=Pattern.compile(single_comment);
	      // matcher object for function names.
	      Matcher m = r.matcher(line);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	      }else {
	         System.out.println("not function name");
	      }
	      //matcher object for identifiers.
	      Matcher m2 = i.matcher(line);
	      if (m2.find( )) {
	         if(m2.group(0)==line){
		         System.out.println("Found value: " + m2.group(0) );
	         }
	         else{
	        	 System.out.println("Not an Identifier");
	         }
	      }else {
	         System.out.println("NO an identifier");
	      }
	      //matcher object for if keyword
	      Matcher m3= if_key.matcher(line);
	      if(m3.find( )){
	    	  if(m3.group(0)==line){
			         System.out.println("Found value: " + m3.group(0) );
		         }
		         else{
		        	 System.out.println("Not an If Keyword");
	      }
	   }
	      else{
	    	System.out.println("Not an If keyword")  ;
	      }
	      
	    //matcher object for single line comment
	      Matcher m4= single_key.matcher(line);
	      if(m4.find( )){
	    	  if(m4.group(0)==line){
			         System.out.println("Found value: " + m4.group(0) );
		         }
		         else{
		        	 System.out.println("Not a single line program");
	      }
	   }
	      else{
	    	System.out.println("Not a single line program")  ;
	      }
	      }
	}

