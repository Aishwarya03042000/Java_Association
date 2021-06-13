class Address6
{
	String street;
	int doorNo;
	Country6 country;
	
	Address6(String street, int doorNo)
	{
		System.out.println("invoking Address6 in constructor");
		this.street = street;
		this.doorNo = doorNo;
	}
	void initCountry(Country6 country)
	{
		System.out.println("invoking method initCountry()");
		this.country = country;
	}
	void displayAddress6Properties()
	{
		System.out.println("Street: "+this.street);
		System.out.println("DoorNo: "+this.doorNo);
		System.out.println("Country: "+this.country.name);
	}
}