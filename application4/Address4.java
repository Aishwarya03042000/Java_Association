class Address4
{
	String street;
	int doorNo;
	Country4 country;
	
	Address4(String street, int doorNo)
	{
		System.out.println("invoking Address4 in constructor");
		this.street = street;
		this.doorNo = doorNo;
	}
	void initCountry(Country4 country)
	{
		System.out.println("invoking method initCountry()");
		this.country = country;
	}
	void displayAddress4Properties()
	{
		System.out.println("Street: "+this.street);
		System.out.println("DoorNo: "+this.doorNo);
		System.out.println("Country: "+this.country.name);
	}
}