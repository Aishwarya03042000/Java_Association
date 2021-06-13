class Address3
{
	String street;
	int doorNo;
	Country3 country;
	
	Address3(String street, int doorNo)
	{
		System.out.println("invoking Address3 in constructor");
		this.street = street;
		this.doorNo = doorNo;
	}
	void initCountry(Country3 country)
	{
		System.out.println("invoking method initCountry()");
		this.country = country;
	}
	void displayAddress3Properties()
	{
		System.out.println("Street: "+this.street);
		System.out.println("DoorNo: "+this.doorNo);
		System.out.println("Country: "+this.country.name);
	}
}