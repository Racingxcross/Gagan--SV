class bar{
	static String name;
	static String place;
    static String ownerName;	
	static String type;
	static String salesType;
	static int numberOfWorkers;
	static int numberOfFloors;
	static double income;
	static char size;
	static long numberOfBottles;
	static float maximumPriceOfBottle;
	static byte regularCustomersInBar;
	static short noOfPresentCustomers;
	static boolean luxuary;
	
	static void setname(String value)
	{
	name=value;	
	}
	static void setplace(String value)
	{
	place=value;	
	}
	static void setownerName(String value)
	{
	ownerName=value;	
	}
	static void settype(String value)
	{
	type=value;
	}
	static void setsalesType(String value)
	{
	salesType=value;	
	}
	static void setnumberOfWorkers(int value)
	{
    numberOfWorkers=value;	
	}
	static void setnumberOfFloors(int value)
	{
    numberOfFloors=value;
	}
	static void setincome(double value)
	{
	income=value;
	}
	static void setsize(char value)
	{
	size=value;
	}
	static void setnumberOfBottles(long value)
	{
	numberOfBottles=value;
	}
	static void setmaximumPriceOfBottle(float value)
	{
	maximumPriceOfBottle=value;
	}
	static void setregularCustomersInBar(byte value)
	{
	regularCustomersInBar=value;
	}
	static void setnumberOfPresentCustomers(short value)
	{
	noOfPresentCustomers=value;
	}
	static void setluxuary(boolean value)
	{
	luxuary=value;
	}
	static String getname()
	{
	 return name;	
	}
	static String getplace()
	{
	return place;	
	}
	static String getownerName()
	{
	return ownerName;
	}
	static String gettype()
	{
	return type;	
	}
	static String getsalesType()
	{
	return salesType;
	}
	static int getnumberOfWorkers()
	{
    return numberOfWorkers;
	}
	static int getnumberOfFloors()
	{
    return numberOfFloors;
	}
	static double getincome()
	{
	return income;
	}
	static char getsize()
	{
	return size;
	}
	static long getnumberOfBottles()
	{
	return	numberOfBottles;
	}
	static float getmaximumPriceOfBottle()
	{
	return	maximumPriceOfBottle;
	}
	static byte getregularCustomersInBar()
	{
	return	regularCustomersInBar;
	}
	static short getnumberOfPresentCustomers()
	{
	return	noOfPresentCustomers;
	}
	static boolean getluxuary()
	{
	return	luxuary;
	}
	static void printbardetails()
	{
		System.out.println(name);
		System.out.println(place);
		System.out.println(ownerName);
		System.out.println(type);
		System.out.println(salesType);
		System.out.println(numberOfWorkers);
		System.out.println(numberOfFloors);
		System.out.println(income);
		System.out.println(size);
		System.out.println(numberOfBottles);
		System.out.println(maximumPriceOfBottle);
		System.out.println(regularCustomersInBar);
		System.out.println(noOfPresentCustomers);
		System.out.println(luxuary);
	}	
}


