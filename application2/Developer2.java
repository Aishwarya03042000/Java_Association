class Developer2
{
	String name;
	String eMail;
	Address2[] address;
	
	Developer2(String name, String eMail)
	{
		System.out.println("invoking Developer2 in constructor");
		this.name = name;
		this.eMail = eMail;
	}
	void initAddress2(Address2[] address)
	{
		if(address!=null)
		System.out.println("invoking method initAddress2()");
		this.address = address;
	}
	void displayDeveloper2Properties()
	{
		System.out.println("DeveloperName: "+this.name);
		System.out.println("DeveloperE-Mail: "+this.eMail);
		
		if(this.address!=null)
		{
			System.out.println("DeveloperAddress: "+this.address.length);
			for(int i=0; i<this.address.length; i++)
			{
				System.out.println(this.address[i]);
			}
		}
	}
}