class Address2
{
	String street;
	int doorNo;
	Country2 country;
	
	Address2(String street, int doorNo)
	{
		System.out.println("invoking Address2 in constructor");
		this.street = street;
		this.doorNo = doorNo;
	}
	void initCountry(Country2 country)
	{
		System.out.println("invoking method initCountry()");
		this.country = country;
	}
	void displayAddress2Properties()
	{
		System.out.println("Street: "+this.street);
		System.out.println("DoorNo: "+this.doorNo);
		System.out.println("Country: "+this.country.name);
	}
}