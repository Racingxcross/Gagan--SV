class barRunner{
    public static void main(String[] stressReleif)
{
	bar.name="mourya Bar And Resturant";
	bar.place="shimogga";
	bar.ownerName="raghu";
	bar.type="bar And Resturant"; 
	bar.salesType="liquor";
	bar.numberOfWorkers=7;
	bar.numberOfFloors=2;
	bar.income=300000D;
	bar.size='L';
	bar.numberOfBottles=5000L;
	bar.maximumPriceOfBottle=1000000F;
	bar.regularCustomersInBar=30;
	bar.noOfPresentCustomers=60;
	bar.luxuary=true;
	
	double income=bar.getincome();
    if(income>300000D){
		System.out.println("owner Full Kush");
	}		
	else{
		System.out.println("owner not satisfied");
	}	
}
}