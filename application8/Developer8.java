class Developer8
{
	String name;
	String eMail;
	Address8[] address;
	
	Developer8(String name, String eMail)
	{
		System.out.println("invoking Developer8 in constructor");
		this.name = name;
		this.eMail = eMail;
	}
	void initAddress8(Address8[] address)
	{
		if(address!=null)
		System.out.println("invoking method initAddress8()");
		this.address = address;
	}
	void displayDeveloper8Properties()
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