public class linecomp
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Line Comparison Computation Program");
		int x1=2;
		int x2=1;
		int y1=5;
		int y2=1;
		double line1 = Math.sqrt((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1));
		int a1=2;
		int a2=1;
		int b1=5;
		int b2=1;
		double line2 = Math.sqrt((a2-a1) * (a2-a1)) + ((b2-b1) * (b2-b1));
		System.out.println(line1);
		System.out.println(line2);
		if (line1 == line2)
			System.out.println("lines are equal");
		else
			System.out.println("lines are not equal");
		if (line1 > line2)
			System.out.println("line1 is greater than line2");
		else if (line2 > line1)
			System.out.println("line2 is greater than line1");
		else
			System.out.println("Both are equal");
	}
}
