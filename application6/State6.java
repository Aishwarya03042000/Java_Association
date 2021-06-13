class State6
{
	String name;
	String capitalCityName;
	
	State6(String name, String capitalCityName)
	{
		System.out.println("invoked State6 in Constructor");
		this.name = name;
		this.capitalCityName = capitalCityName;
	}
	void displayState6Properties()
	{
		System.out.println("StateName: "+this.name);
		System.out.println("CapitalCityName: "+this.capitalCityName);
	}
}