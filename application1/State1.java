class State1
{
	String name;
	String capitalCityName;
	
	State1(String name, String capitalCityName)
	{
		System.out.println("invoked State1 in Constructor");
		this.name = name;
		this.capitalCityName = capitalCityName;
	}
	void displayState1Properties()
	{
		System.out.println("StateName: "+this.name);
		System.out.println("CapitalCityName: "+this.capitalCityName);
	}
}