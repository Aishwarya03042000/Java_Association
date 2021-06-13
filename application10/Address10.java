class Address10
{
	String street;
	int doorNo;
	Country10 country;
	
	Address10(String street, int doorNo)
	{
		System.out.println("invoking Address10 in constructor");
		this.street = street;
		this.doorNo = doorNo;
	}
	void initCountry(Country10 country)
	{
		System.out.println("invoking method initCountry()");
		this.country = country;
	}
	void displayAddress10Properties()
	{
		System.out.println("Street: "+this.street);
		System.out.println("DoorNo: "+this.doorNo);
		System.out.println("Country: "+this.country.name);
	}
}