package Section1_8;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		int myNum = 5;

		String website = "Rahul Shetty Academy";

		char letter = 'r';

		double dec = 5.99;

		boolean myCard = true;



		System.out.println(myNum+"is the value stored in the myNum variable");

		System.out.println(website);

		//Arrays -

		int[] arr = new int[5];// 5, 10

		arr[0] = 1;

		arr[1] = 2;

		arr[2]= 4;

		arr[3]= 5;

		arr[4]= 6;



// array creation

		int[] arr2 = {1,2,4,5,6};



		System.out.println(arr2[0]);




// Access and print Array

		//for loop arr.length - 5

		for(int i = 0; i< arr.length; i++) //4

		{

        System.out.println(arr[i]);

		}


//       reverse Order
		for (int i=arr.length - 1; i>= 0 ; i--)

		{

		System.out.println(arr[i]);

		}
//		Bonus: Element count
		
		System.out.println(arr.length);



		String[] name = {"rahul", "shetty", "selenium"};



		for(int i =0; i<name.length;i++)

		{

		System.out.println(name[i]);

		}



		for( String s: name)

		{

		System.out.println(s);

		}

	}

}
