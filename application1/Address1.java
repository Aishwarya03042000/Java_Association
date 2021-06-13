class Address1
{
	String street;
	int doorNo;
	Country1 country;
	
	Address1(String street, int doorNo)
	{
		System.out.println("invoking Address1 in constructor");
		this.street = street;
		this.doorNo = doorNo;
	}
	void initCountry(Country1 country)
	{
		System.out.println("invoking method initCountry()");
		this.country = country;
	}
	void displayAddress1Properties()
	{
		System.out.println("Street: "+this.street);
		System.out.println("DoorNo: "+this.doorNo);
		System.out.println("Country: "+this.country.name);
	}
}