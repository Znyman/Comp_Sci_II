import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<Integer>(); //default capacity is 10
		
		numList.add(new Integer(53));//manually taking care of boxing
		numList.add(new Integer(4));
		numList.add(16);//Java taking care of boxing; still storing objects
		System.out.println(numList);
		numList.add(1, 42);
		System.out.println(numList);
		System.out.println(numList.size());
		
		int sum = 0;
		for(int i = 0; i < numList.size(); i++)
		{
			sum += numList.get(i);
		}
		System.out.println(sum);
		
		for(int i = 0; i < numList.size(); i++)
		{
			numList.set(i, numList.get(i)+1);
		}
		System.out.println(numList);
		
		numList.remove(2);
		System.out.println(numList);
		
		numList.remove(new Integer(17));//removes the object "17"
		System.out.println(numList);
		
		
		
		
		
		
	}

}
