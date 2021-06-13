class Address5
{
	String street;
	int doorNo;
	Country5 country;
	
	Address5(String street, int doorNo)
	{
		System.out.println("invoking Address5 in constructor");
		this.street = street;
		this.doorNo = doorNo;
	}
	void initCountry(Country5 country)
	{
		System.out.println("invoking method initCountry()");
		this.country = country;
	}
	void displayAddress5Properties()
	{
		System.out.println("Street: "+this.street);
		System.out.println("DoorNo: "+this.doorNo);
		System.out.println("Country: "+this.country.name);
	}
}