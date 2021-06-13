class Developer10
{
	String name;
	String eMail;
	Address10[] address;
	
	Developer10(String name, String eMail)
	{
		System.out.println("invoking Developer10 in constructor");
		this.name = name;
		this.eMail = eMail;
	}
	void initAddress10(Address10[] address)
	{
		if(address!=null)
		System.out.println("invoking method initAddress10()");
		this.address = address;
	}
	void displayDeveloper10Properties()
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