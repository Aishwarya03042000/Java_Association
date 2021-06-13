class State5
{
	String name;
	String capitalCityName;
	
	State5(String name, String capitalCityName)
	{
		System.out.println("invoked State5 in Constructor");
		this.name = name;
		this.capitalCityName = capitalCityName;
	}
	void displayState5Properties()
	{
		System.out.println("StateName: "+this.name);
		System.out.println("CapitalCityName: "+this.capitalCityName);
	}
}