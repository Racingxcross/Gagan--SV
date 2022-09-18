class Person{
	static void work(String company,float salary){
		System.out.println("Entered the company & salary : ");
	    if(company=="amazon" && salary==7.0F){
			System.out.println("Company : "+company);
		    System.out.println("Salary : "+salary);
			return;
		}
	}
	static void work(String company,float salary,String designation){
		System.out.println("Entered the company,salary & designation : ");
		if(company=="amazon" && salary==7.0F && designation=="softwareDeveloper"){
			System.out.println("Company : "+company);
			System.out.println("Salary : "+salary);
			System.out.println("Designation : "+designation);
			return;
		}
	}
}