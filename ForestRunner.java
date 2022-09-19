class ForestRunner{
	public static void main(String[] args)
	{
		System.out.println(Forest.name);
		System.out.println(Forest.totalArea);
		System.out.println(Forest.type);
		System.out.println(Forest.region);
		System.out.println(Forest.primaryAnimals);
		
	
	for (int index=0; index<Forest.primaryAnimals.length; index++)
	 {
		String ref0=Forest.primaryAnimals[index];
		System.out.println("Animals Name: +index +name: "+ref0);
	 }	
    }				
}
	
	
	
	