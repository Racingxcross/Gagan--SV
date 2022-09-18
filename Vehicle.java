class Vehicle{
	static double transport(String source,String destination){
		System.out.println("Entered the source & destination : ");
		if(source=="shivamogga" && destination=="chennai"){
			System.out.println("Source : "+source);
			System.out.println("Destination : "+destination);
			return 650;
		}
		return 0.0;
	}
	static double transport(String source,String destination,double onTime){
		System.out.println("Entered source,destination & onTime : ");
		if(source=="shivamogga" && destination=="chennai" && onTime==7.7){
			System.out.println("Source : "+source);
			System.out.println("Destination : "+destination);
			System.out.println("onTime : "+onTime);
			return 7.7;
		}
		return 0.0;

	}
	static boolean transport(String destination){
		System.out.println("Entered the destination : ");
		if(destination=="shivamogga"){
			System.out.println("Destination : "+destination);
		return true;
		}
		return false;
	}
	static boolean transport(String destination,double onTime){
		System.out.println("Entered destination & onTime : ");
		if(destination=="Bengaluru" && onTime==7.7){
			System.out.println("Destination : "+destination);
			System.out.println("onTime : "+onTime);
			return true;
		}
		return false;
	}
	static boolean transport(double onTime){
		System.out.println("Entered onTime : ");
		if(onTime==7.7){
			System.out.println("OnTime : "+onTime);
			return true;
		}
		return false;
	}
}