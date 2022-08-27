import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescAscInteger
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,9,87,45,32,45,13,18};
		ArrayList<Integer> evenlist=new ArrayList<Integer>();
		ArrayList<Integer> oddlist=new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]%2==0)
			{
				evenlist.add(arr[i]);

			}
			else
			{
				oddlist.add(arr[i]);
			}

		}
		Collections.sort(oddlist);
		Collections.sort(evenlist,Collections.reverseOrder());
		//System.out.println(oddlist);
		//System.out.println(evenlist);
		oddlist.addAll(evenlist);
		System.out.println(oddlist);
		/*List<Integer> merge=new ArrayList<Integer>();
		merge.addAll(arg0)
		 */
		/*for(int even:oddlist)
		{
			System.out.print(even +",");
		}
		for(int odd:evenlist)
		{
			System.out.print(odd);
		}
		System.out.println();
		 */
		/*List<Integer> li=new ArrayList<Integer>();
		li.add(12);
		li.add(2);
		li.add(127);
		li.add(3);
		li.add(5);
		li.add(1);
		li.add(122);
		li.add(7);
		li.add(5);
		li.add(29);
		Collections.sort(li);
		System.out.println(li);*/

	}

}
