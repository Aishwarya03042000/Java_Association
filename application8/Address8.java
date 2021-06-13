class Address8
{
	String street;
	int doorNo;
	Country8 country;
	
	Address8(String street, int doorNo)
	{
		System.out.println("invoking Address8 in constructor");
		this.street = street;
		this.doorNo = doorNo;
	}
	void initCountry(Country8 country)
	{
		System.out.println("invoking method initCountry()");
		this.country = country;
	}
	void displayAddress8Properties()
	{
		System.out.println("Street: "+this.street);
		System.out.println("DoorNo: "+this.doorNo);
		System.out.println("Country: "+this.country.name);
	}
}