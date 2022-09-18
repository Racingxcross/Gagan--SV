class VehicleRunner{
	public static void main(String[] RouteInfo){
		String source="shivamogga";
		String destination="chennai";
		double onTime=7.7;
		Vehicle.transport(source,destination);
		Vehicle.transport(source,destination,onTime);
		Vehicle.transport(destination);
		Vehicle.transport(destination,onTime);
		Vehicle.transport(onTime);
	}
}