class Developer5
{
	String name;
	String eMail;
	Address5[] address;
	
	Developer5(String name, String eMail)
	{
		System.out.println("invoking Developer5 in constructor");
		this.name = name;
		this.eMail = eMail;
	}
	void initAddress5(Address5[] address)
	{
		if(address!=null)
		System.out.println("invoking method initAddress5()");
		this.address = address;
	}
	void displayDeveloper5Properties()
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