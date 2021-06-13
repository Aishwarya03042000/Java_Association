class State3
{
	String name;
	String capitalCityName;
	
	State3(String name, String capitalCityName)
	{
		System.out.println("invoked State3 in Constructor");
		this.name = name;
		this.capitalCityName = capitalCityName;
	}
	void displayState3Properties()
	{
		System.out.println("StateName: "+this.name);
		System.out.println("CapitalCityName: "+this.capitalCityName);
	}
}