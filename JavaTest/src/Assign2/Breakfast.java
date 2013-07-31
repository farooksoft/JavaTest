package Assign2;

/* 12.	Write a program to display a random choice from a set of six choices for breakfast.( You could use any set, for example scrambled eggs, waffles, fruit, cereal, yogurt, baked beans). */


class SetItems
{

//String array containing a set of breakfast items

   String arr[] = {"chapati","puri","dosa","veg biriyani","Idli-vada","Maggi"};
   int i,index;   //i is a variable used for iterations of the loop

   //index is a variable representing the index of the array

	void checkItems()//method generates a random no.and
					//that will be the index value for array to display the breakfast item
	{
	//loop is used to display all the breakfast items
	   	for(i=0;i<arr.length;i++)
	   	 	   	System.out.println("Item:"+(i+1)+"    "+arr[i]);

	   	System.out.println();
//the below line generates a random number between 1 and 6

	   	index=1+(int)(6*Math.random());
	   	System.out.println("\nToday's Breakfast   :  "+arr[index-1]+"\n");
	}
}

class Breakfast
{
	public static void main(String []args)
	{
		SetItems items=new SetItems(); //instance of SetItems class
		items.checkItems(); //method checkItems is called
	}
}
