class Developer6
{
	String name;
	String eMail;
	Address6[] address;
	
	Developer6(String name, String eMail)
	{
		System.out.println("invoking Developer6 in constructor");
		this.name = name;
		this.eMail = eMail;
	}
	void initAddress6(Address6[] address)
	{
		if(address!=null)
		System.out.println("invoking method initAddress6()");
		this.address = address;
	}
	void displayDeveloper6Properties()
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