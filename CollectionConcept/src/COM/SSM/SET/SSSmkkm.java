package COM.SSM.SET;
import java.util.*;
public class SSSmkkm {
	
public static void main(String[] args)
{
String[ ] words = { "When", "all", "is", "said", "and", "done",
"more", "has", "been", "said", "than", "done" };
Set<String> mySet = new HashSet<String>();
for (String word : words)
{
mySet.add(word);
}
for (String word : mySet)
{
System.out.print(word + " ");
}
System.out.println();
}
}

