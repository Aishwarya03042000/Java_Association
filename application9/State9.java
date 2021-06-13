class State9
{
	String name;
	String capitalCityName;
	
	State9(String name, String capitalCityName)
	{
		System.out.println("invoked State9 in Constructor");
		this.name = name;
		this.capitalCityName = capitalCityName;
	}
	void displayState9Properties()
	{
		System.out.println("StateName: "+this.name);
		System.out.println("CapitalCityName: "+this.capitalCityName);
	}
}