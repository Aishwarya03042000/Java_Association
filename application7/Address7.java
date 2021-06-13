class Address7
{
	String street;
	int doorNo;
	Country7 country;
	
	Address7(String street, int doorNo)
	{
		System.out.println("invoking Address7 in constructor");
		this.street = street;
		this.doorNo = doorNo;
	}
	void initCountry(Country7 country)
	{
		System.out.println("invoking method initCountry()");
		this.country = country;
	}
	void displayAddress7Properties()
	{
		System.out.println("Street: "+this.street);
		System.out.println("DoorNo: "+this.doorNo);
		System.out.println("Country: "+this.country.name);
	}
}