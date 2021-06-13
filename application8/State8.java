class State8
{
	String name;
	String capitalCityName;
	
	State8(String name, String capitalCityName)
	{
		System.out.println("invoked State8 in Constructor");
		this.name = name;
		this.capitalCityName = capitalCityName;
	}
	void displayState8Properties()
	{
		System.out.println("StateName: "+this.name);
		System.out.println("CapitalCityName: "+this.capitalCityName);
	}
}