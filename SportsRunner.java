class SportsRunner{
	public static void main (String[] game)
	{
		String[] names={"Dhoni","RahulDravid","AnilKumble","DineshKarthik","DevduttPadikkal","GouthamGambir","KLRahul","ABD","RohitSharma","SuryakumarYadav","Malinga"};
		Sports.cricketTeamMembers(names);
		
		System.out.println("--------------------------------------");
		
		int[] numbers={07,19,68,21,11,12,01,17,63,99};
		Sports.kabbadiTeamMembersJerseyNos(numbers);
		
		System.out.println("--------------------------------------");
		
		double[] salaries={91d,65d,66.5d,86d,77d,72d,62d,82d,88d,89d};
		Sports.FootBallTeamMembersSalary(salaries);
		
		System.out.println("--------------------------------------");
		
		long[] number={9258522155L,9485125556L,7256321156L};
		Sports.ludoTeamMobileNumber(number);
		
		System.out.println("--------------------------------------");
		
		String[] anames={"abcd","efgh","ijkl","mnop"};
		Sports.khokhoTeamMembersCountryCode(anames);
	}
}