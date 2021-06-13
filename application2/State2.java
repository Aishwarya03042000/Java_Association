class State2
{
	String name;
	String capitalCityName;
	
	State2(String name, String capitalCityName)
	{
		System.out.println("invoked State2 in Constructor");
		this.name = name;
		this.capitalCityName = capitalCityName;
	}
	void displayState2Properties()
	{
		System.out.println("StateName: "+this.name);
		System.out.println("CapitalCityName: "+this.capitalCityName);
	}
}