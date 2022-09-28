class BillaniorDataOperator{
 static String[] billaniorNames={null,null,null,null,null,null,null,null};
 static int position =0;
 static void save (String billanior)
{
	System.out.println("Dudde doddappa");
	if(position>=billaniorNames.length)
	{
		System.err.println("System size exceeded");
		return;
	}
	if (billaniorNames!=null && billanior!=null)
	{
		System.out.println("billanior Names,will check in arrey");
		billaniorNames[position]=billanior;
		position++;
		System.out.println("saved billanior:"+billaniorNames+"at position:"+position);
	}
} 
    static void displayDetails()
{
	for (int index=0;index<billaniorNames.length;index++)
	{
		String ref=billaniorNames[index];
		System.out.println(ref);
	}
}
    static boolean findBillanior(String name)
    {
	System.out.println("it is valid name");
    for (int index=0;index<billaniorNames.length;index++)
     {
	 String ref=billaniorNames[index];
	 if(ref==name)
	 {
		System.out.println("rich is:"+ref);
		return true;
	 }
	 else
	 {
		System.out.println("list alli yaaru illa");
	 }
}	
     return false;
    }
     static String update(String oldName,String newName)
 {
	 System.out.println("change the list");
	 if(oldName!=null && newName!=null)
	 {
		 if(oldName.length()>4 && newName.length()>4)
		  {
			 System.out.println("billanior iddare");
			 for(int money=0;money<billaniorNames.length;money++)
		  {
			 String data=billaniorNames[money];
		     if(oldName==data)
		  {
			 System.out.println("name updated"+data+"with");
			 billaniorNames[money]=newName;
			 return newName;				 
		  }	   
		  }
		  } 
	 }
	 else
	        {
		     System.out.println("billanior data is valid,cannot update"); 
	        }
		     return null;
  }
}
