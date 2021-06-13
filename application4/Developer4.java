class Developer4
{
	String name;
	String eMail;
	Address4[] address;
	
	Developer4(String name, String eMail)
	{
		System.out.println("invoking Developer4 in constructor");
		this.name = name;
		this.eMail = eMail;
	}
	void initAddress4(Address4[] address)
	{
		if(address!=null)
		System.out.println("invoking method initAddress4()");
		this.address = address;
	}
	void displayDeveloper4Properties()
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