class State10
{
	String name;
	String capitalCityName;
	
	State10(String name, String capitalCityName)
	{
		System.out.println("invoked State10 in Constructor");
		this.name = name;
		this.capitalCityName = capitalCityName;
	}
	void displayState10Properties()
	{
		System.out.println("StateName: "+this.name);
		System.out.println("CapitalCityName: "+this.capitalCityName);
	}
}