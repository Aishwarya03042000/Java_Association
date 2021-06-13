class State7
{
	String name;
	String capitalCityName;
	
	State7(String name, String capitalCityName)
	{
		System.out.println("invoked State7 in Constructor");
		this.name = name;
		this.capitalCityName = capitalCityName;
	}
	void displayState7Properties()
	{
		System.out.println("StateName: "+this.name);
		System.out.println("CapitalCityName: "+this.capitalCityName);
	}
}