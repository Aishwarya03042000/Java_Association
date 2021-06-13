class State4
{
	String name;
	String capitalCityName;
	
	State4(String name, String capitalCityName)
	{
		System.out.println("invoked State4 in Constructor");
		this.name = name;
		this.capitalCityName = capitalCityName;
	}
	void displayState4Properties()
	{
		System.out.println("StateName: "+this.name);
		System.out.println("CapitalCityName: "+this.capitalCityName);
	}
}