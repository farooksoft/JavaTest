package Assign2;

/* 18.	Define a class for rectangle objects defined by two points, the top-left and bottom right corners of the rectangle. Include a constructor to copy a rectangle, a method to return a rectangle object, that encloses the current object and the rectangle passed as an argument, and a method to display the defining points of a rectangle. Test the class by creating four rectangles and combining these cumulatively, to end up with a rectangle enclosing them all. Output the defining points of all the rectangles you create. */

class RectObj
{
	int top_x1,top_y1,bot_x2,bot_y2;

	RectObj(int x1,int y1,int x2,int y2)
	{
		top_x1=x1;
		top_y1=y1;
		bot_x2=x2;
		bot_y2=y2;
	}

	RectObj rectReturn()
	{
		RectObj rectobj = null;
		return rectobj;
	}

	void displayPoints()
		{
			System.out.println("top_x1 :"+top_x1 + " " +"top_y1: " + top_y1+""+"bot_x2 :"+bot_x2+""+"bot_y2:"+bot_y2);
		}
}


		class Rectangle

		{
			public static void main(String []ar)
			{
				RectObj rec = new RectObj(10,13,20,25);
				rec.rectReturn();
				rec.displayPoints();
			}
		}

