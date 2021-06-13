class Address9
{
	String street;
	int doorNo;
	Country9 country;
	
	Address9(String street, int doorNo)
	{
		System.out.println("invoking Address9 in constructor");
		this.street = street;
		this.doorNo = doorNo;
	}
	void initCountry(Country9 country)
	{
		System.out.println("invoking method initCountry()");
		this.country = country;
	}
	void displayAddress9Properties()
	{
		System.out.println("Street: "+this.street);
		System.out.println("DoorNo: "+this.doorNo);
		System.out.println("Country: "+this.country.name);
	}
}